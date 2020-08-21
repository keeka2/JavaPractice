package test.jdbc.home;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.jdbc.bean.BookDTO;
import test.jdbc.bean.MyBatisConnectionFactory;

public class DollarInput {
	public static void main(String[] args) {
		SqlSession sql = MyBatisConnectionFactory.getSqlSession();
		HashMap map = new HashMap();
		map.put("column","writer");
		map.put("value","a");
		List<BookDTO> list = sql.selectList("ford.bookLike2",map);
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).print();
		}
		sql.close();
		
	}
}
