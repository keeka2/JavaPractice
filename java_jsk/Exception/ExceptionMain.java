//����ó���� �޼ҵ峪 ������ �������� Ȱ��
//try-catch-finally
//�Ϲݿ���: �ݵ�� �ۼ��ؾ� ������ ����
//���࿹��: �׳� ������ ����
//���Ʒ� ���� �߿� Exception e -> NullPointerException �� ������ �ϸ� �ȵ�
//API���� ���� Ȯ�� �ʿ�
//main���� ����ó�� �ϸ� ������
//throws exception ���� ����ó���Ѱ� �ƴ϶� ����ó�� �Ѱ��ִ� ����
import java.nio.channels.Channel;

//public class XXXException extends [Exception|...]
//{
//}
class ExceptionMain
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4};

		try{
			System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(a[3]);
		}finally{//Word ������ �ڵ� ����
			System.out.println("����");
		}


		try{
		Channel ch2 = System.inheritedChannel();
		}catch(Exception e){
			System.out.println("����ó��");
		}

		int number = 100;
		int result = 0;
		try{
			for(int i=0;i<10;i++){
				result = number/(int)(Math.random()*10);
				System.out.println(result);
			}
		}catch(Exception e){
			System.out.println("0");
		}
		//throw ���� ���� �߻�
		//throw new RuntimeException();
		//throw new InterruptedException(); ��� �������� �ȵ�

		try{
			method1();
		}catch(Exception e){
			e.printStackTrace();//���� ����
			System.out.println(e.getMessage());
		}
	}

	static void method1() throws Exception{
		method2();
	}
	
		
	static void method2() throws Exception{//���ܰ� �߻��� �� �ִٰ� �˸�
		System.out.println(0/0);
	}
}
