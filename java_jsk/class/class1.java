//Ŭ���� = ���赵
class Tv
{
	//�Ӽ� = ����
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

	//������
	//�Ű����� ���� ������(�⺻������) - ��ü�� ó�� ���� �� �ʱ� �����ϴ� ��
	//������ �˾Ƽ� ������
	//Integer i1  new Integer(); - ������
	Person(){
		name = "ȫ";
	}

	//�Է¹��� - ������ ������ �⺻�����ڰ� �˾Ƽ� �Ȼ���
	Person(String n){
		name = n;
	}
}

class class1{
	public static void main(String[] args) 
	{
		//new�������� �޸� Ŀ��.. ������� �ʴ� ��ü ������
		Tv tv1 = new Tv();
		//�ּ�
		System.out.println(tv1);
		//t1.���� - ��������
		System.out.println(tv1.channel);


		Person p1 = new Person();
		Person p2 = new Person("jsk");
		System.out.println(p1.name);
		System.out.println(p2.name);

		
	}
}