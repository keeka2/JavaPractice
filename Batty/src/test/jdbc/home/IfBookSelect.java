package test.jdbc.home;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.jdbc.bean.BookDTO;
import test.jdbc.bean.MyBatisConnectionFactory;

public class IfBookSelect {
	public static void main(String[] args) {
		SqlSession sql = MyBatisConnectionFactory.getSqlSession();
		List<BookDTO> all = sql.selectList("boogie.bookIf",5);
		for (int i = 0; i < all.size(); i++) {
			all.get(i).print();
		}
		System.out.println("===========================================================");
		
		BookDTO temp = new BookDTO();
		List<BookDTO> all2 = sql.selectList("boogie.bookChoose",temp);
		for (int i = 0; i < all2.size(); i++) {
			all2.get(i).print();
		}
		System.out.println("===========================================================");
		temp.setNum(17);
		List<BookDTO> all3 = sql.selectList("boogie.bookChoose",temp);
		for (int i = 0; i < all3.size(); i++) {
			all3.get(i).print();
		}
		System.out.println("===========================================================");
		
		BookDTO temp2 = new BookDTO();
		temp2.setWriter("akakak");
		List<BookDTO> all4 = sql.selectList("boogie.bookTrim",temp2);
		for (int i = 0; i < all4.size(); i++) {
			all4.get(i).print();
		}
		System.out.println("===========================================================");
		
		temp2.setNum(13);
		List<BookDTO> all5 = sql.selectList("boogie.bookTrim",temp2);
		for (int i = 0; i < all5.size(); i++) {
			all5.get(i).print();
		}
		System.out.println("===========================================================");
		
		BookDTO temp3 = new BookDTO();
		temp3.setNum(2);
		temp3.setWriter("Oracle");
		temp3.setTitle("Fucking Java");
		sql.update("boogie.bookUpdate",temp3);
		System.out.println("===========================================================");
		sql.close();
	}

}
