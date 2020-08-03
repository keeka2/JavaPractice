//finally는 중간에 리턴을 만나도 실행을 하고 넘어감
//=> DB연결 끊거나, 브라우저 종료시 로그아웃 같은 기능 만들 때 씀
class FinalTest 
{
	public static void main(String[] args) 
	{
		method1();
		System.out.println("method1 수행을 마치고 main메소드로 돌아왔습니다");
	}
	static void method1(){
		try{
			System.out.println("method1이 호출됨");
			return ;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("method1의 finally블럭이 실행되었습니다");
		}
	}
}
