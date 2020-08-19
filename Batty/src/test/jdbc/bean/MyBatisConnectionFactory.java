package test.jdbc.bean;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


//config레 1234단계 설저이 다 들어있는데..
public class MyBatisConnectionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	
	//클래스 초기화 블록
	static {
		//접속정보 및 mybatis 설정을 하고있는 XML 경로 읽기
		try {
			//경로.../././mybatis_config.xml 파일을 읽어서 reader 클래스에 넣음
			Reader reader = Resources.getResourceAsReader("test/jdbc/mybatis/mybatis_config.xml");
			if(sqlSessionFactory==null) {
				//자바에서 사용할 수 있는 용도로 만들어줌
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession(true);
	}

}
