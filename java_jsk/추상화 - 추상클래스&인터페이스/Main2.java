//Ŭ���� ��Ӻ��� �������̽� Ȱ���� �߿�
interface Super
{
	int MAX = 100;
	int count();
}

class Sub implements Super
{
	int members = 0;
	public int count(){
		return members;
	}
}
class Main2 
{
	public static void main(String[] args) 
	{
		Sub sub = new Sub();
		int c = sub.count();
		System.out.println(c);
		System.out.println(Super.MAX);

		Super s = new Sub();
		//System.out.println(s.members); �̰� ����
		System.out.println(s.count());//�̷��� members�������°� ���� ��(���� ������ ���� ������ �޼ҵ带 ���� ������ ����)
	}
}