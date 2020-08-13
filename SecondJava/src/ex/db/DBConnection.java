package ex.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * preparedStatement: ĳ�� ����Ͽ� ����
 * Statement: ��û�� �ѹ��� ����
 * */
import oracle.jdbc.driver.*;
public class DBConnection {
	public static void main(String[] args) {
		try {
			//1�ܰ� DB ����̹� ����(��� ������ ���� �޶���) - ����̹� �Ŵ����� ��ϵ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2�ܰ� ����(DB �α���)
			String url = "jdbc:oracle:thin:@nullmaster.iptime.org:1521:orcl";
			String user = "class12", pw="class12";
			
			//��� ���� �н����� �Է��Ͽ� �α���
			Connection connection = DriverManager.getConnection(url,user,pw);
			System.out.println(connection);
			
			//3�ܰ� sql�ۼ�
			String sql = "select * from dept";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			
			//4�ܰ� sql����
			/*
			 * 1. ���� �ִ� ���(select) - executeQuery()
			 * 2. ���� ���� ���(insert, update, delete) - executeUpdate()
			 * */
			
			ResultSet rs = pstmt.executeQuery();
			
			//5�ܰ� ����ܰ�
			while(rs.next()) {
				System.out.println(rs.getInt("DEPTNO")+" "+rs.getString("DNAME")+" "+rs.getString("LOC"));
			}
			
			rs.close();
			pstmt.close();
			connection.close();
			//close���ϸ� �޸� ���� �߻��� �� ����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
