//서버 - 호스트
//클라 - 노드
//DB - 서버는 아니고 저장소
//메신저 - 카카오톡같은 글자를 주고 받음
//FTP - 파일을 주고 받음
//비연결 지향 - http 요청 끝나면 연결이 끝남
//게임 - 계속 유지
//ip - 고유 이름, 변할 수 있음
//포트 - 같은 컴퓨터 내에서 프로그램을 식별하는 번호, 중복X
//TCP - 스트림, ACK신호(신뢰성)
//UDP - 비연결 지향적: 발신자가 일방적으로 데이터 발신하는 방식

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
			String serverIp = "192.168.0.83";
            // 소켓을 생성하여 연결을 요청한다.
			// 포트: 서비스 종류
			//서버에 연결된 객체
			Socket socket = new Socket(serverIp, 61888);//ip, 포트번호
			System.out.println("서버에 연결되었습니다.");
			//읽고 쓰는 쓰레드 각각 하나
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
					//접속한 이름을 한번 보냄
					out.writeUTF(name);
				}	
				while(out!=null) {
					//접속한 이름을 한번 보냄+내용
					out.writeUTF("["+name+"]"+scanner.nextLine());		
				}
			} catch(IOException e) {}
		} 
	}


	static class ClientReceiver extends Thread {
		Socket socket;
		//서버가 보내주는 글들을 읽음
		DataInputStream in;
		ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				//inputstream을 꺼내서 in에 넣음
				in = new DataInputStream(socket.getInputStream());
			} catch(IOException e) {}
		}
		public void run() {
			//서버 끊기면 null이 됨
			while(in!=null) {
				try {
					//읽고 출력
					System.out.println(in.readUTF());
				} catch(IOException e) {}
			}
		}
	}

} 