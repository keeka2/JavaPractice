//final�� ������ ������ ���� �� �� ���� �� - ���
//Ŭ������ final������ ����� �Ұ�����
//����� �̸��� ���� �빮�ڷ� �ۼ��Ѵ�

final class T2
{

	int x=10;

	//�̷������� ó�� ������ �ʱ�ȭ ���� ���� �Ұ���
	final int XX;
	T2(int s){
		XX=s;
	}
}
//class Test extends T2 �ȵ�
class Test
{
	final int X = 10;
	final static int A = 20;
	static final int B = 30;


	public static void main(String[] args) 
	{
		final int Z = 10;
		System.out.println(Z);
		//Z=200; X
		//Test.A=100; X

		T2 t = new T2(100);
		System.out.println(t.XX);
	}
}
