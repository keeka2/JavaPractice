/*
this �޼ҵ�� super �޼ҵ�� ������ �ȿ����� ����
�԰� ������� ����(�� �� ù��°�� ����Ǿ�� �ϱ� ����)

super - ������ ������ ȣ��
this - 

��ӽ� - ������ ������ Ŭ�������� �ʱ�ȭ �ϴ°��� ����
*/

class AA extends Object
{
	int x = 10;
	AA(){
		x=1000;
		System.out.println("A�� ������");
	}
}

class BB extends AA
{
	int y = 20;
	BB(){
		//super(); //�θ��� ������ ȣ��
		//x=1000;
		y=2000;
		System.out.println("B�� ������");
	}
}

class ThisSuper 
{
	public static void main(String[] args) 
	{
		BB b = new BB();
		System.out.println(b.x);
		System.out.println(b.y);

	}
}