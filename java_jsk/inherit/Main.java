/*
Ŭ������ ������ ���� ������ ������
�ݺ��� �ڵ� �ߺ� ����
���� ���� ���� ����
��ü ������ ���� ����

��� ��� ���� : private ���� ���� �ʵ�� �޼ҵ� ����

�ֻ��� �θ� Ŭ������ object�� ��ӹް� ����
��ӵ� ��ü ������ �θ�ü���� ���� / �θ� ������ ȣ�� �� �ڽ� ������ ȣ��
Objct 11���� �޼ҵ�?https://docs.oracle.com/javase/8/docs/api/
���� ���� �⺻ �޼ҵ� 11�� ����(equals, toString ���� ��)
*/


class A extends Object//�θ�
{
	private int qw = 10;//��� �ȵ�
	int x = 10;
	A(){
		System.out.println(x);
	}

	void add(){
		System.out.println("add");
	}

	//Overriding - ����θ� �״�� ����ϸ� ������ ����
	//�޼ҵ� ����� - ���������� / ����Ÿ�� / �̸� (�Ű�����)

	//���� toString�� �ּҰ��� ��ȯ���ش�
	public String toString(){
		return "Override <toString> method";
	}
}

class B extends A//�ڼ�
{
	int y = 20;
	B(){
		super(); //�θ��� ������
		System.out.println("B");
	}

	void add(){
		System.out.println("A�� add�޼ҵ� �������̵�");
	}
}

class C extends B
{
	int z = 20;
	C(){
		super(); //�θ��� ������
		System.out.println("C");
	}
}

//final Ŭ������ ������ �� �� ����(�ٸ� Ŭ���� ��� �޴°� ����)
//final�� ���� �޼ҵ�� �������̵� �Ұ���
//final ������ ���� ���� �� �� ����


class Main
{
	public static void main(String[] args) 
	{
		System.out.println("B�� ��ü ����");
		B b = new B();
		System.out.println();
		System.out.println("C�� ��ü ����");
		C c = new C();

		System.out.println("\nA�� add�޼ҵ� ȣ��");
		c.add();
		System.out.println(c.toString());
	}
}

