class User
{
	//�׳� ���� ����
	String name;
	int age;//0-100
}

class User2
{
	//�޼ҵ带 ���� ���� - ��ȿ ������ �˻� ����
	private String name;
	private int age;
	public void setAge(int age){
		if(age>0 && age<100){
			this.age = age;
		}
	}
}
class Capsule
{
	public static void main(String[] args) 
	{
		User u1 = new User();
		u1.name="aaaa";
		u1.age=500;
		User2 u2 = new User2();
		//u2.name="aaaa";
		u2.setAge(30);
	}
}
