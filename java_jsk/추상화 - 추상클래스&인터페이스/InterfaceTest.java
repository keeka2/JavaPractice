/*
객체 생성 불가능
추상메소드만 사용가능
여러개 붙이기 가능
public static final 상수 만 사용 가능
public abstract 메소드
*/
interface Test2
{
	public static final int NUM = 10;
	String NAME = "LG";//생략해도 public static final이 자동으로 붙음
	public abstract void add();
	public abstract int sum(int a, int b);
	String getName();//생략해도 됨
}

interface Test3
{
	public abstract void oodd();
}

abstract class AA extends Test implements Test2, Test3
{

}
class InterfaceTest 
{
	public static void main(String[] args) 
	{
		AA aa = new AA();
	}
}
