//생성자 초기화X 명시적 초기화만 가능
interface Kor
{
	int x = 100;
	public void add();
}

class Test implements Kor
{
	public void add(){
		System.out.println("no익명");
	};
}
class Main5 
{
	public static void main(String[] args) 
	{
		Kor k = new Test();
		Kor k1 = new Kor(){
			public void add(){
				System.out.println("익명");
			}
		};

		k.add();
		k1.add();
	}
}
