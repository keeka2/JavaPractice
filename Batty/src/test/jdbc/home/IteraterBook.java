package test.jdbc.home;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.jdbc.bean.BookDTO;
import test.jdbc.bean.MyBatisConnectionFactory;

public class IteraterBook {
	public static void main(String[] args) {
		SqlSession sql = MyBatisConnectionFactory.getSqlSession();
		List data = new ArrayList();
		data.add("¶ì");
		data.add("Oracle");
		data.add("±è¼±»ý");
		data.add("12");
		data.add("onoenoneoneoneone");
		
		List<BookDTO> all = sql.selectList("ford.checkBook",data);
		for (int i = 0; i < all.size(); i++) {
			all.get(i).print();
			
		}
		System.out.println("=============================================");
		
		List<BookDTO> all2 = sql.selectList("ford.bookLike","d");
		for (int i = 0; i < all2.size(); i++) {
			all2.get(i).print();
			
		}
		sql.close();
		
	}
}
