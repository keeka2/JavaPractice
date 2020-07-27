//final이 붙으면 변수를 변경 할 수 없게 됨 - 상수
//클래스에 final붙으면 상속이 불가능함
//상수의 이름은 전부 대문자로 작성한다

final class T2
{

	int x=10;

	//이런식으로 처음 생성시 초기화 이후 수정 불가능
	final int XX;
	T2(int s){
		XX=s;
	}
}
//class Test extends T2 안됨
class Test
{
	final int X = 10;
	final static int A = 20;
	static final int B = 30;


	public static void main(String[] args) 
	{
		final int Z = 10;
		System.out.println(Z);
		//Z=200; X
		//Test.A=100; X

		T2 t = new T2(100);
		System.out.println(t.XX);
	}
}
