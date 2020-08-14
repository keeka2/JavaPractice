package ex.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;

public class Empno {
	public static void main(String[] args) {
		//사원번호를 입력받아 정보출력
		try {
			//1단계 DB 드라이버 실행
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 연결(DB 로그인)
			String url = "jdbc:oracle:thin:@nullmaster.iptime.org:1521:orcl";
			String user = "class12", pw="class12";
			
			//경로 유저 패스워드 입력하여 로그인
			Connection connection = DriverManager.getConnection(url,user,pw);
			Scanner scanner = new Scanner(System.in);
			System.out.print("사원번호: ");
			int empno = scanner.nextInt();
			
			//String sql = "select * from emp where empno = "+empno; => 이렇게 써도 작동은 하는데 보안적(sql Injection)으로 안좋음 따라서 대신 ? 넣어야함
			String sql = "select * from emp where empno = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1,empno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("ENAME");
				Timestamp ts = rs.getTimestamp("HIREDATE");
				int sal = rs.getInt("SAL");
				System.out.println(name+" "+ts+" "+sal);
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
