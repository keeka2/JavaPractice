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
		//AŬ������ BŬ������ ��Ӱ��� �ΰ� �־�� ��
		A a = new B(); //-> int y�� ����
		System.out.println(a.x);
		//System.out.println(a.y);
		//int i = 5.7; �̷��Ŷ� �����  [ 5 | 0.7 ] ���⼭ 5�� �����ϴ� ����
		
		//����
		//x�ϳ� �ۿ� ���� �޸𸮸� �����ϱ� ������ 
		//A a2 = new A();
		//B b2 = (B)a2;

		A a3 = new B();
		B b3 = (B)a3; //
		//System.out.println(a2.x);
		//double�� int�� �ٲ� �� �տ� type���°Ŷ� �����
		// double d = 5.7;
		// int c = (int)d;

						 //   A   B
		A a4 = new B();  // [ x | y ]
		A a5 = new C();  // [ x | z ]
		a5.add();
		//a5.ad(); ����

////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("������ �޼ҵ� ����");
		A aa1 = new A();
		A aa2 = new B(); //�������̵� �޼ҵ� �� �� ����
		aa1.add();
		aa2.add();
		
		Object obj1 = new A();
		Object obj2 = new B();
		Object obj3 = new C();
		Object obj4 = new String();
	//  A a = new String(); ��Ӱ��� �ƴϹǷ� ����
	
	//instanceof == T/F
	//���ϴ� ��ü���� ���Ե� �� �մ��� �Ǵ�
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

//====>> ���� �����ϴ� Ÿ���� ���� ��