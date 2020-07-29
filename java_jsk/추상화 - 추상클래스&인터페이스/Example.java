interface I{
	public abstract void play();
}

class A2
{
	//�Ű����� - ������(�������̽�)
	//I�� ���� �� ��� Ŭ������ �� �� ����
	void autoPlay(I i){
		i.play();
	}
}

class B2 implements I
{
	public void play(){
		System.out.println("play in B class");
	}
}

class C2 implements I
{
	public void play(){
		System.out.println("play in C class");
	}
}

class Example 
{
	public static void main(String[] args) 
	{
		A2 a2 = new A2();
		a2.autoPlay(new B2()); // I i = new B(); => B�� �ִ� play�޼ҵ� ȣ��
		a2.autoPlay(new C2());
	}
}
