interface I{
	public abstract void play();
}

class A2
{
	//매개변수 - 참조형(인터페이스)
	//I를 구현 한 모든 클래스가 들어갈 수 있음
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
		a2.autoPlay(new B2()); // I i = new B(); => B에 있는 play메소드 호출
		a2.autoPlay(new C2());
	}
}
