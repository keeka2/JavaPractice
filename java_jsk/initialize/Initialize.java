//1.명시적 초기화 2.블럭 초기화 3.생성자 초기화
//블록 실행 다음 생성자 실행
class BlockTest
{
	//명시적 초기화
	int x = 10;
	static String name = "abc";

	//클래스 변수 초기화
	static{
		System.out.println("블록");
		name = "def";
		}

	//인스턴스 변수 초기화
	{
		x=30;
	}
	//->사용 이유: if나 for문 같은 제어문을 쓸 수 있음(잘 안씀)
	
	//생성자 초기화
	BlockTest(){
		System.out.println("생성자");
		x=40;
		}
}
class Initialize 
{
	public static void main(String[] args) 
	{
		System.out.println(BlockTest.name);
		BlockTest b = new BlockTest();
		System.out.println(b.x);
	}
}
