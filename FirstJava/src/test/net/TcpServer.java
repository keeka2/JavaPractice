package test.net;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TcpServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//서버 생성 - 8888번으로 서버 소켓을 만듬
			ServerSocket serverSocket = new ServerSocket(8888);
			//청취하는 부분 - 사용자 계속 받을 수 있음 - 한번에 하나씩 순차처리
			while(true) {
				Socket userSocket = serverSocket.accept();
				//서버에서 유저로 보내주기 위한 객체 생성
				//outputstream 상속 받아있음
				
				//연결
				OutputStream outputStream = userSocket.getOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
				
				//전송
				objectOutputStream.writeObject(new Date());
				
				//더이상 보낼게 없음
				//연결 종료
				objectOutputStream.flush();
				objectOutputStream.close();
				userSocket.close();
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
