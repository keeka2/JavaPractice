//1.����� �ʱ�ȭ 2.�� �ʱ�ȭ 3.������ �ʱ�ȭ
//��� ���� ���� ������ ����
class BlockTest
{
	//����� �ʱ�ȭ
	int x = 10;
	static String name = "abc";

	//Ŭ���� ���� �ʱ�ȭ
	static{
		System.out.println("���");
		name = "def";
		}

	//�ν��Ͻ� ���� �ʱ�ȭ
	{
		x=30;
	}
	//->��� ����: if�� for�� ���� ����� �� �� ����(�� �Ⱦ�)
	
	//������ �ʱ�ȭ
	BlockTest(){
		System.out.println("������");
		x=40;
		}
}
class Initialize 
{
	public static void main(String[] args) 
	{
		System.out.println(BlockTest.name);
		BlockTest b = new BlockTest();
		System.out.println(b.x);
	}
}
