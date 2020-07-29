//super - 자식 클래스가 자신을 생성할 때 부모 클래스의 생성자를 불러 초기화 할때 사용
class Parent
{
	int x = 100;
	void method(){
		System.out.println("Parent Method");
	}
}

class Child extends Parent
{
	//int x = 200;
	void method(){
		//int x = 300; // 지역 변수 -> 인스턴스 변수 -> 물려받은 변수 순으로 씀
		System.out.println("Child Method");
		System.out.println("x=" + x); // 300(지역)
		System.out.println("super.x="+super.x); // 100(조상님꺼)
		System.out.println("this.x="+this.x); // 200(자기꺼)
	}
}

class BindingTest3
{
	public static void main(String[] args) 
	{
		Parent p = new Child();//다형성 호출
		p.method();
	}
}
