/*
���� - Ŭ�������� - ������ ��밡�� (Ŭ����.������)
*/

class Mart
{
	String name;
	String addr;
	int product_num;
	int time;
	//Date date;

	void setName(String name){
		//�����̸� ���� this ���̸� �ν��Ͻ� ���� ���
		//this - �ν��Ͻ� �޼��� / �����ڿ����� ��밡��
		//     - �ν��Ͻ� ������ �������� �����Ҷ� ���, �ڱ� �ڽ��� �ּҸ� ���� ����
		this.name = name;
	}

	//������ ����
	/*
	void setName(String n){
		//���� �Ǳ� ������ this �� �ٿ��� ��
		name = n;
	}*/
}

 class Abc
 {
	 static int num = 100;
	 double x = review.avg;//�̷������� Ŭ���������� Ŭ����.�����̸��� ����Ͽ� ��𼭵� �� �� ����
	 //int k = Main.hi; �̰� ������(static�����Ÿ�)
 }

//Ŭ�������� �� Ŭ�����޼ҵ�
 class Test
 {
	 static int x = 500;

	 /*�����ڳ� �޼ҵ忡�� ���� �� ����...Ŭ���� ������ Ŭ���� ���������� ���� �� �� ����
	 Test(){
		static String ss = "hello";
	 }//X

	 void add(){
		static int a = 100;
	 }//X
	 */

	 static void aaa(){
		System.out.println("����");
		Test.bbb();
		System.out.println("����");
	 }
	 static void bbb(){
		Test.ccc();
	 }
	 static void ccc(){
		System.out.println("ccc");
	 }
 }

//�ν��Ͻ� ���� - ��ü ���� �� ��� ����
 class Test2
 {
	 void aaa2(){
		
	 }
	 void bbb2(){
		
	 }
	 void ccc2(){
		
	 }
 }

class review
{
	static double avg = 99.9;
	int instance = 10;

	void print(){
		//�̰� ��
		System.out.println(instance);
	}
	public static void main(String[] args) 
	{
		Abc a = new Abc();

		//�� �� ���� ������� a.num���� �ȵ�
		System.out.println(Abc.num);
		System.out.println(a.num);
		System.out.println(review.avg);

		Mart m1 = new Mart();
		m1.setName("qqq");
		System.out.println(m1.name);

		Test.aaa();
		
		//��ü���� �� ����ؾ� ��(Ŭ���� ������� �ν��Ͻ��� ȣ�� �� ��)
		//System.out.println(instance); -> ����
		review r = new review();
		System.out.println(r.instance);
		r.print();

	}
}
