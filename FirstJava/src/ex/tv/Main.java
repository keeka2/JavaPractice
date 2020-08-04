package ex.tv;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv("sam");
		Tv t2 = new Tv("sam");
		System.out.println(t1.equals(t2));
		
		//read는 기본적으로 IoException을 상속 받고 있어서 예외처리 해줘야 함
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