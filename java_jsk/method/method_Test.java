class Test
{
	int x = 10;
	void add(){
		x += 10;
	}

	int getNum(){
		return x;
	}

	int getNum(int a, int b){
		return a+b;
	}
}

class Ovld
{
	void sumInt(int a, int b){
		System.out.println(a+b);
	}

	void sumDouble(double a, double b){
		System.out.println(a+b);
	}

	//�����ε�
	void sum(int a, int b){
		System.out.println(a+b);
	}
	void sum(double a, double b){
		System.out.println(a+b);
	}
	void sum(double a, int b){
		System.out.println(a+b);
	}
	void sum(int a, double b){
		System.out.println(a+b);
	}
	void sum(long a, double b){
		System.out.println(a+b);
	}

}

class method_Test 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		for (int i = 0; i<10 ;i++)
		{
			System.out.println(t1.x);
			t1.add();
		}

		int num = t1.getNum();
		System.out.println(num);
		System.out.println(t1.getNum(10,20));

		Ovld o = new Ovld();
		o.sum(1,2);
		o.sum(1.1,2.2);
		o.sum(10L,2.2);





	}
}
