//static�� �̸� �޸𸮿� �ö�
class A
{
	static class B{
		static int x = 100;
		int y = 0;
	}

	class C
	{
		int z = 10;
	}
}

class Main4
{
	public static void main(String[] args) 
	{
		System.out.println(A.B.x);
		A.B ab = new A.B();
		//�ν��Ͻ��� ��ü�� �����ؾ� �� �� �ִ�
		System.out.println(ab.y);

		A a = new A();
		A.C c= a.new C();
		System.out.println(c.z);

	}
}