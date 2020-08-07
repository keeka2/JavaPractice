import java.net.*;
import java.io.*;
import java.util.*;

public class TcpIpMultichatServer {
	HashMap clients;
	
	TcpIpMultichatServer() {
		clients = new HashMap();
		//�� ����ȭ
		Collections.synchronizedMap(clients);
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		//��Ʈ��ȣ�� ����: 0���� 65535
		//������� ��Ʈ ��ȣ Ȯ�� ���: cmd - netstat
		//�ڱ� ��ǻ�� IPȮ�� ���: cmd - ipconfig
		try {
			serverSocket = new ServerSocket(8007);
			System.out.println("������ ���۵Ǿ����ϴ�.");

			while(true) {
				// ���ο� ������ ���� Ŭ���̾�Ʈ�� �������� , ����������  ����Ǵ� ����
				socket = serverSocket.accept();
				System.out.println("["+socket.getInetAddress() + ":"+socket.getPort()+"]"+"���� �����Ͽ����ϴ�.");

				//������ ��� �޾��ֱ� ���� ����� �Ѹ�� ������ �ϳ��� �������
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // start()

	void sendToAll(String msg) {
		//�ݺ��� �ϱ� ���� ��� ����ڸ� ����
		Iterator it = clients.keySet().iterator();
		
		while(it.hasNext()) {
			try {
				DataOutputStream out =
					(DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);
			} catch(IOException e){}
		} // while
	} // sendToAll

	public static void main(String args[]) {
		new TcpIpMultichatServer().start();
	} 


	//��뤸 ����
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch(IOException e) {}
		}


		public void run() {
			String name = "";
			try {
				//�� ��� ����
				name = in.readUTF();
				sendToAll("#"+name+"���� �����̽��ϴ�.");

				//����� name, output��ü �������
				clients.put(name, out);
				System.out.println("���� ���������� ���� " + clients.size() + "�Դϴ�.");
				while(in!=null) {
					String temp = in.readUTF();
					System.out.println(name+"���� �޼����� ���� : "+temp);
					sendToAll(temp);
				}
			} catch(IOException e) {
				// ignore
			} finally {
				sendToAll("#"+name+"���� �����̽��ϴ�.");
				clients.remove(name);
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� ������ �����Ͽ����ϴ�.");
				System.out.println("���� ���������� ���� "+ clients.size()+"�Դϴ�.");
			} // try
		} // run
	} // ReceiverThread
} // class