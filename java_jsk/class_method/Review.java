class Tv
{
	static int ch = 10;
	boolean power = false;

}

class Review 
{
	public static void main(String[] args) 
	{
		Tv t1 = new Tv();
		Tv t2 = new Tv();

		//�� �� �ٲ� �Ǳ� �ϴµ� ���� ������
		t1.ch = 50;
		t1.power = true;
		System.out.println(t1.ch+" "+t1.power);
		System.out.println(t2.ch+" "+t2.power);

		//�̷��� �ؾ� ��
		Tv.ch = 100;
		t1.power=true;
		System.out.println(t1.ch+" "+t1.power);
		System.out.println(t2.ch+" "+t2.power);
	}
}
