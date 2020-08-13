package ex.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;

public class GetTest {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 연결(DB 로그인)
			String url = "jdbc:oracle:thin:@nullmaster.iptime.org:1521:orcl";
			String user = "class12", pw="class12";
			
			//경로 유저 패스워드 입력하여 로그인
			Connection connection = DriverManager.getConnection(url,user,pw);
			Scanner scanner = new Scanner(System.in);
			System.out.print("ID: ");
			String id_in = scanner.nextLine();
			
			//String sql = "select * from emp where empno = "+empno; => 이렇게 써도 작동은 하는데 보안적(sql Injection)으로 안좋음 따라서 대신 ? 넣어야함
			String sql = "select * from test where ID = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1,id_in);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String id = rs.getString("ID");
				String password = rs.getString("PASSWORD");
				int age = rs.getInt("AGE");
				Timestamp ts = rs.getTimestamp("REG");
				System.out.println(id+" "+password+" "+age+" "+ts);
			}else {
				System.out.println("fuck you");
			}
			rs.close();
			pstmt.close();
			connection.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
