package ex.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;


/*
 * oracle 8 9 - i(internet ����� ����)
 * oracle 10 11 - g(grid - �������� ��ǻ�͸� ��� �ϳ��� ������ ��ǻ�ͷ�)
 * oracle 12 - c(cloud)
 * */


public class GetTest {
	public static void main(String[] args) {
		try {
			Connection connection = OracleConnection.getConnection();
			Scanner scanner = new Scanner(System.in);
			System.out.print("ID: ");
			String id_in = scanner.nextLine();
			
			//String sql = "select * from test where empno = "+empno; => �̷��� �ᵵ �۵��� �ϴµ� ������(sql Injection)���� ������ ���� ��� ? �־����
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
			
			//close ������ finally�� �ִ°� ����
			OracleConnection.dbclose(connection, pstmt, rs);
			
			
		}catch (Exception e) {
			System.out.println("fuck you");
			// TODO: handle exception
		}
	}
}
