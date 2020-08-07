import java.net.*;
import java.io.*;
import java.util.*;

public class TcpIpMultichatServer {
	HashMap clients;
	
	TcpIpMultichatServer() {
		clients = new HashMap();
		//맵 동기화
		Collections.synchronizedMap(clients);
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		//포트번호의 범위: 0부터 65535
		//사용중인 포트 번호 확인 방법: cmd - netstat
		//자기 컴퓨터 IP확인 방법: cmd - ipconfig
		try {
			serverSocket = new ServerSocket(8007);
			System.out.println("서버가 시작되었습니다.");

			while(true) {
				// 새로운 소켓을 생성 클라이언트가 들어왔을때 , 접속했을때  실행되는 구문
				socket = serverSocket.accept();
				System.out.println("["+socket.getInetAddress() + ":"+socket.getPort()+"]"+"에서 접속하였습니다.");

				//연결을 계속 받아주기 위해 사용자 한명당 쓰레드 하나씩 만들어줌
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // start()

	void sendToAll(String msg) {
		//반복을 하기 위해 모든 사용자를 꺼냄
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


	//사용ㅈ 접속
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
				//새 사람 입장
				name = in.readUTF();
				sendToAll("#"+name+"님이 들어오셨습니다.");

				//사용자 name, output객체 집어넣음
				clients.put(name, out);
				System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
				while(in!=null) {
					String temp = in.readUTF();
					System.out.println(name+"님이 메세지를 보냄 : "+temp);
					sendToAll(temp);
				}
			} catch(IOException e) {
				// ignore
			} finally {
				sendToAll("#"+name+"님이 나가셨습니다.");
				clients.remove(name);
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"에서 접속을 종료하였습니다.");
				System.out.println("현재 서버접속자 수는 "+ clients.size()+"입니다.");
			} // try
		} // run
	} // ReceiverThread
} // class