package sleepy.jdbc.bean;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.CORBA.PUBLIC_MEMBER;

//Ä¿³Ø¼Ç pool
public class MyBatisConnectionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("sleepy/jdbc/mybatis/mybatis_config.xml");
			if(sqlSessionFactory==null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static SqlSession getSqlSession2() {
		return sqlSessionFactory.openSession();
	}
}
