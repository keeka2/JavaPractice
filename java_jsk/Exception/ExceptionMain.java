//예외처리는 메소드나 생성자 내에서만 활용
//try-catch-finally
//일반예외: 반드시 작성해야 컴파일 가능
//실행예외: 그냥 컴파일 가능
//위아래 계층 중요 Exception e -> NullPointerException 이 순서로 하면 안됨
//API에서 계층 확인 필요
//main에는 예외처리 하면 안좋음
//throws exception 쓰면 예외처리한게 아니라 예외처리 넘겨주는 것임
import java.nio.channels.Channel;

//public class XXXException extends [Exception|...]
//{
//}
class ExceptionMain
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4};

		try{
			System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(a[3]);
		}finally{//Word 에러시 자동 저장
			System.out.println("종료");
		}


		try{
		Channel ch2 = System.inheritedChannel();
		}catch(Exception e){
			System.out.println("예외처리");
		}

		int number = 100;
		int result = 0;
		try{
			for(int i=0;i<10;i++){
				result = number/(int)(Math.random()*10);
				System.out.println(result);
			}
		}catch(Exception e){
			System.out.println("0");
		}
		//throw 예외 강제 발생
		//throw new RuntimeException();
		//throw new InterruptedException(); 얘는 컴파일이 안됨

		try{
			method1();
		}catch(Exception e){
			e.printStackTrace();//에러 따라감
			System.out.println(e.getMessage());
		}
	}

	static void method1() throws Exception{
		method2();
	}
	
		
	static void method2() throws Exception{//예외가 발생할 수 있다고 알림
		System.out.println(0/0);
	}
}
