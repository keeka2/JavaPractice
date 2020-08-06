import java.net.*;
import java.io.*;
import java.util.Scanner;
public class TcpIpMultichatClient {
	public static void main(String args[]) {
		if(args.length!=1) {
			System.out.println("USAGE: java TcpIpMultichatClient 대화명");
			System.exit(0);
		}
		try {
			String serverIp = "192.168.0.105";
            // 소켓을 생성하여 연결을 요청한다.
			// 포트: 서비스 종류
			Socket socket = new Socket(serverIp, 8007);//ip, 포트번호
			System.out.println("서버에 연결되었습니다.");
			//읽고 쓰는 쓰레드
			Thread sender = new Thread(new ClientSender(socket, args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			sender.start();
			receiver.start();
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(Exception e) {}
	} // main

	static class ClientSender extends Thread {
		//서버
		//DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		//out.writeUTF() :  출력 스트림에 기입
		Socket socket;
		DataOutputStream out;
		String name;

		//생성자
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
					out.writeUTF(name);
				}	
				while(out!=null) {
					out.writeUTF("["+name+"]"+scanner.nextLine());		
				}
			} catch(IOException e) {}
		} 
	}

	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch(IOException e) {}
		}
		public void run() {
			while(in!=null) {
				try {
					//읽기
					System.out.println(in.readUTF());
				} catch(IOException e) {}
			}
		}
	}

} 