package ex.tv;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv("sam");
		Tv t2 = new Tv("sam");
		System.out.println(t1.equals(t2));
		
		//read�� �⺻������ IoException�� ��� �ް� �־ ����ó�� ����� ��
		try {
			int input = 0;
			while((input=System.in.read())!= -1) {
				System.out.println("input :"+input+" , char :"+(char)input);
			}
			System.out.println(System.getProperty("java.version"));
			System.out.println(System.getProperty("os.name"));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}