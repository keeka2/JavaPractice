/*   ---�߻�ȭ---
-�߻�Ŭ����: �ϼ����� ���� Ŭ����(�߻� �޼ҵ�(�ϼ����� ���� �޼ҵ�)�� ����)
-��ü������ ��ü ���� �Ұ���
*/

abstract class Test
{
	static int x = 100;
	int a = 10;
	
    //����δ� ����
	abstract void add();//=>�߻� �޼ҵ� {������}�� ����
	//abstract static void add2(); => �̰� �ȵ�(Ŭ���� �޼ҵ�� �� �ϼ� �Ǿ��־����)
}

class A extends Test
{
	//������ �߻� Ŭ������ �߻� �޼ҵ带 �������̵�(�����ؾ���)
	void add(){
		System.out.println("abstract class Test Override add method");
	}

}

class AbstractClass
{
	public static void main(String[] args) 
	{
		System.out.println(Test.x);//Ŭ���� ������ ��� ����
		A a = new A();
		a.add();
	}
}
