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
			//���� ���� - 8888������ ���� ������ ����
			ServerSocket serverSocket = new ServerSocket(8888);
			//û���ϴ� �κ� - ����� ��� ���� �� ���� - �ѹ��� �ϳ��� ����ó��
			while(true) {
				Socket userSocket = serverSocket.accept();
				//�������� ������ �����ֱ� ���� ��ü ����
				//outputstream ��� �޾�����
				
				//����
				OutputStream outputStream = userSocket.getOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
				
				//����
				objectOutputStream.writeObject(new Date());
				
				//���̻� ������ ����
				//���� ����
				objectOutputStream.flush();
				objectOutputStream.close();
				userSocket.close();
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
