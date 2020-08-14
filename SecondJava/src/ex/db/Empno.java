package ex.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;

public class Empno {
	public static void main(String[] args) {
		//�����ȣ�� �Է¹޾� �������
		try {
			//1�ܰ� DB ����̹� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2�ܰ� ����(DB �α���)
			String url = "jdbc:oracle:thin:@nullmaster.iptime.org:1521:orcl";
			String user = "class12", pw="class12";
			
			//��� ���� �н����� �Է��Ͽ� �α���
			Connection connection = DriverManager.getConnection(url,user,pw);
			Scanner scanner = new Scanner(System.in);
			System.out.print("�����ȣ: ");
			int empno = scanner.nextInt();
			
			//String sql = "select * from emp where empno = "+empno; => �̷��� �ᵵ �۵��� �ϴµ� ������(sql Injection)���� ������ ���� ��� ? �־����
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
