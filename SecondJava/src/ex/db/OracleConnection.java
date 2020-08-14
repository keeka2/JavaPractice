package ex.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleConnection {

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		Connection connection = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 연결(DB 로그인)
			String url = "jdbc:oracle:thin:@nullmaster.iptime.org:1521:orcl";
			String user = "class12", pw="class12";
			connection = DriverManager.getConnection(url,user,pw);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return connection;

	}
	
	public static void dbclose(Connection connection, PreparedStatement pstmt, ResultSet rs) {
		if (connection!=null) {try {connection.close();} catch (Exception e) {}}
		if (pstmt!=null) {try {pstmt.close();} catch (Exception e) {}}
		if (rs!=null) {try {rs.close();} catch (Exception e) {}}

	}

}
