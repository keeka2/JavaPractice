//finally�� �߰��� ������ ������ ������ �ϰ� �Ѿ
//=> DB���� ���ų�, ������ ����� �α׾ƿ� ���� ��� ���� �� ��
class FinalTest 
{
	public static void main(String[] args) 
	{
		method1();
		System.out.println("method1 ������ ��ġ�� main�޼ҵ�� ���ƿԽ��ϴ�");
	}
	static void method1(){
		try{
			System.out.println("method1�� ȣ���");
			return ;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("method1�� finally���� ����Ǿ����ϴ�");
		}
	}
}
