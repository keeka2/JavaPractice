package test.net;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class TcpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//서버의 accept문과 연결
			Socket user = new Socket("192.168.0.105",8888);
			InputStream inputStream = user.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			Date date = (Date)objectInputStream.readObject();
			System.out.println(date);
			objectInputStream.close();
			inputStream.close();
			user.close();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
