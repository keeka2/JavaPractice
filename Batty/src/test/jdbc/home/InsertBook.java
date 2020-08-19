package test.jdbc.home;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import oracle.net.nt.SdpNTAdapter;
import test.jdbc.bean.BookDTO;
import test.jdbc.bean.MyBatisConnectionFactory;

public class InsertBook {
	public static void main(String[] args) {
		SqlSession sql = MyBatisConnectionFactory.getSqlSession();
		BookDTO data = new BookDTO();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");
		String writer = scanner.nextLine();
		
		System.out.print("����: ");
		String title = scanner.nextLine();
		
		System.out.print("����: ");
		String content = scanner.nextLine();
		System.out.println(writer+title+content);
		
		data.setContent(content);
		data.setTitle(title);
		data.setWriter(writer);
		
		sql.insert("book.bookInsert", data);
		sql.commit();
		sql.close();
	}
}
