//클래스 = 설계도
class Tv
{
	//속성 = 변수
	boolean power = false;
	int channel = 1;
	//...

}

class Person
{
	String name;
	int age;
	boolean gender;
	int birth = 511, h=180, b=90;
	//...

	//생성자
	//매개변수 없는 생성자(기본생성자) - 객체를 처음 만들 때 초기 설정하는 것
	//없으면 알아서 생성됨
	//Integer i1  new Integer(); - 오류남
	Person(){
		name = "홍";
	}

	//입력받음 - 생성자 있으면 기본생성자가 알아서 안생김
	Person(String n){
		name = n;
	}
}

class class1{
	public static void main(String[] args) 
	{
		//new많아지면 메모리 커짐.. 사용하지 않는 객체 생성됨
		Tv tv1 = new Tv();
		//주소
		System.out.println(tv1);
		//t1.변수 - 참조변수
		System.out.println(tv1.channel);


		Person p1 = new Person();
		Person p2 = new Person("jsk");
		System.out.println(p1.name);
		System.out.println(p2.name);

		
	}
}
