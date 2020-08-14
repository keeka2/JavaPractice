package ex.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;


/*
 * oracle 8 9 - i(internet 웹기술 제공)
 * oracle 10 11 - g(grid - 여러대의 컴퓨터를 모아 하나의 고성능의 컴퓨터로)
 * oracle 12 - c(cloud)
 * */


public class GetTest {
	public static void main(String[] args) {
		try {
			Connection connection = OracleConnection.getConnection();
			Scanner scanner = new Scanner(System.in);
			System.out.print("ID: ");
			String id_in = scanner.nextLine();
			
			//String sql = "select * from test where empno = "+empno; => 이렇게 써도 작동은 하는데 보안적(sql Injection)으로 안좋음 따라서 대신 ? 넣어야함
			String sql = "select * from test where ID = ?";
			//String sql = "select * from test where ID = \'"+id_in+"\'";
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
			
			//close 문장은 finally에 넣는게 좋음
			OracleConnection.dbclose(connection, pstmt, rs);
			
			
		}catch (Exception e) {
			System.out.println("fuck you");
			// TODO: handle exception
		}
	}
}
