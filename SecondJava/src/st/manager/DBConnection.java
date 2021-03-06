package st.manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * preparedStatement: 캐시 사용하여 재사용
 * Statement: 요청에 한번씩 실행
 * */
import oracle.jdbc.driver.*;
public class DBConnection {
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
