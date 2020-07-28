class A
{
	int x;

	void add(){
		System.out.println("AAA");
	}
}

class B extends A
{
	int y;

	void add(){
		System.out.println("BBB");
	}
}

class C extends B
{
	int z;
	void add(){
		System.out.println("CCC");
	}
	void ad(){}
}

class DifferentType 
{
	public static void main(String[] args) 
	{
		//A클래스와 B클래스가 상속관계 맺고 있어야 함
		A a = new B(); //-> int y는 못씀
		System.out.println(a.x);
		//System.out.println(a.y);
		//int i = 5.7; 이런거랑 비슷함  [ 5 | 0.7 ] 여기서 5만 참조하는 느낌
		
		//에러
		//x하나 밖에 없는 메모리를 참조하기 때문에 
		//A a2 = new A();
		//B b2 = (B)a2;

		A a3 = new B();
		B b3 = (B)a3; //
		//System.out.println(a2.x);
		//double을 int로 바꿀 때 앞에 type적는거랑 비슷함
		// double d = 5.7;
		// int c = (int)d;

						 //   A   B
		A a4 = new B();  // [ x | y ]
		A a5 = new C();  // [ x | z ]
		a5.add();
		//a5.ad(); 에러

////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("다형성 메소드 적용");
		A aa1 = new A();
		A aa2 = new B(); //오버라이딩 메소드 쓸 수 있음
		aa1.add();
		aa2.add();
		
		Object obj1 = new A();
		Object obj2 = new B();
		Object obj3 = new C();
		Object obj4 = new String();
	//  A a = new String(); 상속관계 아니므로 에러
	
	//instanceof == T/F
	//비교하는 객체들이 대입될 수 잇는지 판단
		A aaa = new A();
		Object obj = (Object)aaa;
		System.out.println(obj instanceof B);

		//B bbb = new A(); error: incompatible types: A cannot be converted to B

		A ai = new B();
		B bi = null;
		if (ai instanceof B)
		{
			bi=(B)ai;
		}else{
			bi= new B();
		}
		System.out.println(bi.x);
	}
}

//====>> 실제 참조하는 타입을 봐야 함