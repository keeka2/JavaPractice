class User
{
	//그냥 접근 가능
	String name;
	int age;//0-100
}

class User2
{
	//메소드를 통해 접근 - 유효 값인지 검사 가능
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
