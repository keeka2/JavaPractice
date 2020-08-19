package sleepy.jdbc.home;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.activation.MailcapCommandMap;

import org.apache.ibatis.session.SqlSession;

import sleepy.jdbc.bean.BookInputDTO;
import sleepy.jdbc.bean.EmpDTO;
import sleepy.jdbc.bean.MyBatisConnectionFactory;

public class EmpMain {
	public static void main(String[] args) {
		SqlSession sql = MyBatisConnectionFactory.getSqlSession2();
		int count = sql.selectOne("emp.empCount");
		System.out.println("Á÷¿ø ¼ö : "+count);
		
		EmpDTO data = new EmpDTO();
		data.setSal(1000);
		data.setDeptno(10);
		
		List<EmpDTO> list = sql.selectList("emp.getEmp", data);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEmpno() + " " + list.get(i).getEname());
			
		}
		sql.close();
	}
}
