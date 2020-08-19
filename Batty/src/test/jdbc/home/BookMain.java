package test.jdbc.home;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.jdbc.bean.BookDTO;
import test.jdbc.bean.MyBatisConnectionFactory;

public class BookMain {
	public static void main(String[] args) {
		SqlSession sql = MyBatisConnectionFactory.getSqlSession();
		
		int count = sql.selectOne("book.bookCount");
		System.out.println("책 전체수: "+count);
		
		
		List all = sql.selectList("book.bookResMap");
		if(all!=null) {
			for (int i = 0; i < all.size(); i++) {
				BookDTO bt = (BookDTO)all.get(i);
				bt.print();
			}
		}
		System.out.println("=========================================================================================================================================");
		
		BookDTO bookDTO = (BookDTO)sql.selectOne("bookNum",4);
		bookDTO.print();
		
		sql.close();
	}

}
