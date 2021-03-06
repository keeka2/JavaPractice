class Naver
{
	String id = "네이버";
	//자기 자신에 대한 객체 하나 생성
	//그러나 na도 priavte이기 때문에 사용은 불가능
	private static Naver na = new Naver();

	//생성자 private -> 외부에서 객체 생성 불가
	private Naver(){}

	//참조타입: Naver - 위에 만들어진 객체의 주소 return
	public static Naver getInstance(){
		return na;
	}
	
}
//=>싱글인스턴스 or 전부 다 클래스멤버일 때

class TypeTest
{
	int a = 100;//인스턴스 기본
	Tv t2 = new Tv();//인스턴스 참조

	static int s = 1000;//클래스 기본
	static Tv t1 = new Tv();//클래스 참조
}

class SamTv
{
	int ch = 20;
	void add(int a){
		//...
	}
	void add(LgTv lt){
		//...
	}
}

class LgTv
{
	int ch = 10;
	LgTv add(){
		//return new LgTv(); 가능
		LgTv t1 = new LgTv();
		return t1;
	}
}

/*
LgTv lg = new LgTv();
SamTv sm = new SmTv();
lg = sm; -> 이건 불가능
lg.ch = sm.ch; -> 이건 가능함(타입만 보면 됨)

-->LgSamTv.java
*/
class NaverMain 
{
	public static void main(String[] args) 
	{
		//Naver n1 = new Naver(); 생성자 접근 불가
		Naver n2 = Naver.getInstance();
		Naver n3 = Naver.getInstance();
		System.out.println(n2.id);
		System.out.println(n2);
		System.out.println(n3.id);
		System.out.println(n3);


		n2.id = "naver";
		//둘 다 바뀜
		System.out.println(n2.id);
		System.out.println(n3.id);

	}
}

//변수
/*
	선언된 위치에 따른 종류
		지역 / 인스턴스 / 클래스
	변수의 타입에 따른 종류
		기본형(논리형, 문자형, 정수, 실수 ...) / 참조형(클래스)

	Tv t1;
	Tv t2=t1; 가능 함

*/