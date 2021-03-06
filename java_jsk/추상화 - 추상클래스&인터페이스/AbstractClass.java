/*   ---추상화---
-추상클래스: 완성되지 않은 클래스(추상 메소드(완성되지 않은 메소드)가 있음)
-자체적으로 객체 생성 불가능
*/

abstract class Test
{
	static int x = 100;
	int a = 10;
	
    //선언부는 있음
	abstract void add();//=>추상 메소드 {구현부}가 없음
	//abstract static void add2(); => 이건 안됨(클래스 메소드는 다 완성 되어있어야함)
}

class A extends Test
{
	//무조건 추상 클래스의 추상 메소드를 오버라이딩(구현해야함)
	void add(){
		System.out.println("abstract class Test Override add method");
	}

}

class AbstractClass
{
	public static void main(String[] args) 
	{
		System.out.println(Test.x);//클래스 변수는 사용 가능
		A a = new A();
		a.add();
	}
}
