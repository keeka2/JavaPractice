/*
인스턴스 변수 int a = 10;
인스턴스 메서드 void aa(){}

클래스 변수 static int x = 10;
클래스 메서드 static void() ..

클래스 변수 및 메서드(클래스 멤버)는 인스턴스 보다 먼저 실행되기 때문에 인스턴스 사용 불가능

객체지향: 메모리에 올려 쓰는 것 -> static:항상 쓸 수 있으므로 메모리에 상주, 객체: 필요 할 때 메모리에 올려 씀

*/

class Kor
{
	//이런식으로 다른 클래스 변수 가져올 수 있음
	static String name = "korea";
	static int aaa = clmt.y;


}
class clmt 
{
	int x=10; //인스턴스 변수
	static int y = 20; //클래스 멤버
	//static int y = new clmt().x; 1회용 객체
	int h = y;//이건됨 -> static붙은 것을 먼저 코딩


	void add(){
		System.out.println(this.x);
		System.out.println(y);
	}

	static void print(){
		System.out.println("hi");
	}

	public static void main(String[] args) 
	{
		//System.out.println(x);  오류
		System.out.println(clmt.y);
		clmt.print();//메소드 앞에 클래스 생략해도 되는데 왠만하면 안하는게 좋음


		//클래스에서 인스턴스 사용하려면 객체를 생성하고 사용해야함
		clmt test = new clmt();
		System.out.println(test.x);
		System.out.println(Kor.name);

		//add메소드 호출
		new clmt().add();
		clmt c = new clmt();
		c.add();

	}
}


