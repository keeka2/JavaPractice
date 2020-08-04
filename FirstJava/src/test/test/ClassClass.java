package test.test;

public class ClassClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리 - classNotFoundException이 존재 함(runtimeexception 상속받으면 예외처리 안해도 됨)
		
		try {
			Class cla = Class.forName("java.util.Date");
			//Object는 모든 주소를 저장 할 수 있음
			Object obj = cla.newInstance();
			System.out.println(obj.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
