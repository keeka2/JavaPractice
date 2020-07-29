//클래스 상속보다 인터페이스 활용이 중요
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
		//System.out.println(s.members); 이건 오류
		System.out.println(s.count());//이렇게 members가져오는건 가능 함(직접 가져올 수는 없으나 메소드를 통해 접근은 가능)
	}
}