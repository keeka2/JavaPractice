//super - �ڽ� Ŭ������ �ڽ��� ������ �� �θ� Ŭ������ �����ڸ� �ҷ� �ʱ�ȭ �Ҷ� ���
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
		//int x = 300; // ���� ���� -> �ν��Ͻ� ���� -> �������� ���� ������ ��
		System.out.println("Child Method");
		System.out.println("x=" + x); // 300(����)
		System.out.println("super.x="+super.x); // 100(����Բ�)
		System.out.println("this.x="+this.x); // 200(�ڱⲨ)
	}
}

class BindingTest3
{
	public static void main(String[] args) 
	{
		Parent p = new Child();//������ ȣ��
		p.method();
	}
}
