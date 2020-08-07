//���� - ȣ��Ʈ
//Ŭ�� - ���
//DB - ������ �ƴϰ� �����
//�޽��� - īī���尰�� ���ڸ� �ְ� ����
//FTP - ������ �ְ� ����
//�񿬰� ���� - http ��û ������ ������ ����
//���� - ��� ����
//ip - ���� �̸�, ���� �� ����
//��Ʈ - ���� ��ǻ�� ������ ���α׷��� �ĺ��ϴ� ��ȣ, �ߺ�X
//TCP - ��Ʈ��, ACK��ȣ(�ŷڼ�)
//UDP - �񿬰� ������: �߽��ڰ� �Ϲ������� ������ �߽��ϴ� ���

import java.net.*;
import java.io.*;
import java.util.Scanner;
public class TcpIpMultichatClient {
	public static void main(String args[]) {
		if(args.length!=1) {
			System.out.println("USAGE: java TcpIpMultichatClient ��ȭ��");
			System.exit(0);
		}
		try {
			String serverIp = "192.168.0.83";
            // ������ �����Ͽ� ������ ��û�Ѵ�.
			// ��Ʈ: ���� ����
			//������ ����� ��ü
			Socket socket = new Socket(serverIp, 61888);//ip, ��Ʈ��ȣ
			System.out.println("������ ����Ǿ����ϴ�.");
			//�а� ���� ������ ���� �ϳ�
			Thread sender = new Thread(new ClientSender(socket, args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			sender.start();
			receiver.start();
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(Exception e) {}
	} // main

	static class ClientSender extends Thread {
		//����
		//DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		//out.writeUTF() :  ��� ��Ʈ���� ����
		Socket socket;
		DataOutputStream out;
		String name;

		//������
		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
				System.out.println(out);
			} catch(Exception e) {}
		}
		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if(out!=null) {
					//������ �̸��� �ѹ� ����
					out.writeUTF(name);
				}	
				while(out!=null) {
					//������ �̸��� �ѹ� ����+����
					out.writeUTF("["+name+"]"+scanner.nextLine());		
				}
			} catch(IOException e) {}
		} 
	}


	static class ClientReceiver extends Thread {
		Socket socket;
		//������ �����ִ� �۵��� ����
		DataInputStream in;
		ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				//inputstream�� ������ in�� ����
				in = new DataInputStream(socket.getInputStream());
			} catch(IOException e) {}
		}
		public void run() {
			//���� ����� null�� ��
			while(in!=null) {
				try {
					//�а� ���
					System.out.println(in.readUTF());
				} catch(IOException e) {}
			}
		}
	}

} 