/*
�ν��Ͻ� ���� int a = 10;
�ν��Ͻ� �޼��� void aa(){}

Ŭ���� ���� static int x = 10;
Ŭ���� �޼��� static void() ..

Ŭ���� ���� �� �޼���(Ŭ���� ���)�� �ν��Ͻ� ���� ���� ����Ǳ� ������ �ν��Ͻ� ��� �Ұ���

��ü����: �޸𸮿� �÷� ���� �� -> static:�׻� �� �� �����Ƿ� �޸𸮿� ����, ��ü: �ʿ� �� �� �޸𸮿� �÷� ��

*/

class Kor
{
	//�̷������� �ٸ� Ŭ���� ���� ������ �� ����
	static String name = "korea";
	static int aaa = clmt.y;


}
class clmt 
{
	int x=10; //�ν��Ͻ� ����
	static int y = 20; //Ŭ���� ���
	//static int y = new clmt().x; 1ȸ�� ��ü
	int h = y;//�̰ǵ� -> static���� ���� ���� �ڵ�


	void add(){
		System.out.println(this.x);
		System.out.println(y);
	}

	static void print(){
		System.out.println("hi");
	}

	public static void main(String[] args) 
	{
		//System.out.println(x);  ����
		System.out.println(clmt.y);
		clmt.print();//�޼ҵ� �տ� Ŭ���� �����ص� �Ǵµ� �ظ��ϸ� ���ϴ°� ����


		//Ŭ�������� �ν��Ͻ� ����Ϸ��� ��ü�� �����ϰ� ����ؾ���
		clmt test = new clmt();
		System.out.println(test.x);
		System.out.println(Kor.name);

		//add�޼ҵ� ȣ��
		new clmt().add();
		clmt c = new clmt();
		c.add();

	}
}


