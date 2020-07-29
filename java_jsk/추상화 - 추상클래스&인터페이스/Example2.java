interface I2
{
	public abstract void methodB();
}
class A3
{
	void methodA(){
		I2 i = InstanceManager.getInstance(); // I2 i = new B3();
		i.methodB(); //오버라이드된 methodB호출 됨
	}
}
class B3 implements I2
{
	int x = 0;
	public void methodB(){
		System.out.println("methodB in B class");
	}
}

class InstanceManager
{
	public static I2 getInstance(){// I2<B3 이므로 가능
		return new B3();
	}
}
class Example2 
{
	public static void main(String[] args) 
	{
		A3 a = new A3();
		a.methodA();
		I2 i2 = new B3();
		//System.out.println(i2.x); 안됨

	}
}
