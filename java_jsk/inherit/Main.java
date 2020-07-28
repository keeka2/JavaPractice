/*
클래스의 재사용을 통해 개발이 빨라짐
반복된 코드 중복 줄임
유지 보수 편리성 제공
객체 다형성 구현 가능

상속 대상 제한 : private 접근 갖는 필드와 메소드 제외

최상위 부모 클래스는 object를 상속받고 있음
상속된 객체 생성시 부모객체부터 생성 / 부모 생성자 호출 후 자식 생성자 호출
Objct 11개의 메소드?https://docs.oracle.com/javase/8/docs/api/
에서 보면 기본 메소드 11개 있음(equals, toString 많이 씀)
*/


class A extends Object//부모
{
	private int qw = 10;//상속 안됨
	int x = 10;
	A(){
		System.out.println(x);
	}

	void add(){
		System.out.println("add");
	}

	//Overriding - 선언부를 그대로 사용하며 구현부 변경
	//메소드 선언부 - 접근제어자 / 리턴타입 / 이름 (매개변수)

	//원래 toString은 주소값을 반환해준다
	public String toString(){
		return "Override <toString> method";
	}
}

class B extends A//자손
{
	int y = 20;
	B(){
		super(); //부모의 생성자
		System.out.println("B");
	}

	void add(){
		System.out.println("A의 add메소드 오버라이딩");
	}
}

class C extends B
{
	int z = 20;
	C(){
		super(); //부모의 생성자
		System.out.println("C");
	}
}

//final 클래스는 조상이 될 수 없다(다른 클래스 상속 받는건 가능)
//final이 붙은 메소드는 오버라이딩 불가능
//final 변수는 값을 변경 할 수 없다


class Main
{
	public static void main(String[] args) 
	{
		System.out.println("B로 객체 생성");
		B b = new B();
		System.out.println();
		System.out.println("C로 객체 생성");
		C c = new C();

		System.out.println("\nA의 add메소드 호출");
		c.add();
		System.out.println(c.toString());
	}
}

