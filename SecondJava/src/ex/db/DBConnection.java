package ex.db;
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
	public static void main(String[] args) {
		try {
			//1단계 DB 드라이버 실행(디비 종류에 따라 달라짐) - 드라이버 매니저에 등록됨
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계 연결(DB 로그인)
			String url = "jdbc:oracle:thin:@nullmaster.iptime.org:1521:orcl";
			String user = "class12", pw="class12";
			
			//경로 유저 패스워드 입력하여 로그인
			Connection connection = DriverManager.getConnection(url,user,pw);
			System.out.println(connection);
			
			//3단계 sql작성
			String sql = "select * from dept";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			
			//4단계 sql실행
			/*
			 * 1. 리턴 있는 방식(select) - executeQuery()
			 * 2. 리턴 없는 방식(insert, update, delete) - executeUpdate()
			 * */
			
			ResultSet rs = pstmt.executeQuery();
			
			//5단계 추출단계
			while(rs.next()) {
				System.out.println(rs.getInt("DEPTNO")+" "+rs.getString("DNAME")+" "+rs.getString("LOC"));
			}
			
			rs.close();
			pstmt.close();
			connection.close();
			//close안하면 메모리 누수 발생할 수 있음
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
