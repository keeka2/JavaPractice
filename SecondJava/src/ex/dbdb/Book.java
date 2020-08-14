package ex.dbdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import ex.db.OracleConnection;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class Book {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String writer=null, title=null,content=null;
		try {
			System.out.print("저자: ");
			writer=scanner.nextLine().trim();
			System.out.print("제목: ");
			title=scanner.nextLine().trim();
			System.out.print("내용: ");
			content=scanner.nextLine().trim();
			connection=OracleConnection.getConnection();
			String sql = "insert into book values(book_seq.nextval,?,?,?,sysdate)";
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, writer);
			psmt.setString(2, title);
			psmt.setString(3, content);
			if(psmt.executeUpdate()==1) {
				System.out.println("good boy");
			}else {
				System.out.println("bad boy");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			OracleConnection.dbclose(connection,psmt,rs);
		}
	}
}
