package test.jdbc.bean;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


//config�� 1234�ܰ� ������ �� ����ִµ�..
public class MyBatisConnectionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	
	//Ŭ���� �ʱ�ȭ ���
	static {
		//�������� �� mybatis ������ �ϰ��ִ� XML ��� �б�
		try {
			//���.../././mybatis_config.xml ������ �о reader Ŭ������ ����
			Reader reader = Resources.getResourceAsReader("test/jdbc/mybatis/mybatis_config.xml");
			if(sqlSessionFactory==null) {
				//�ڹٿ��� ����� �� �ִ� �뵵�� �������
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
