package test.test;

public class ClassClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó�� - classNotFoundException�� ���� ��(runtimeexception ��ӹ����� ����ó�� ���ص� ��)
		
		try {
			Class cla = Class.forName("java.util.Date");
			//Object�� ��� �ּҸ� ���� �� �� ����
			Object obj = cla.newInstance();
			System.out.println(obj.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
