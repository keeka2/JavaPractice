/*
변수 - 클래스변수 - 언제든 사용가능 (클래스.변수명)
*/

class Mart
{
	String name;
	String addr;
	int product_num;
	int time;
	//Date date;

	void setName(String name){
		//변수이름 아페 this 붙이면 인스턴스 변수 사용
		//this - 인스턴스 메서드 / 생성자에서만 사용가능
		//     - 인스턴스 변수와 지역변수 구별할때 사용, 자기 자신의 주소를 갖고 있음
		this.name = name;
	}

	//같은거 위랑
	/*
	void setName(String n){
		//구별 되기 때문에 this 안 붙여도 됨
		name = n;
	}*/
}

 class Abc
 {
	 static int num = 100;
	 double x = review.avg;//이런식으로 클래스변수는 클래스.변수이름을 사용하여 어디서든 쓸 수 있음
	 //int k = Main.hi; 이건 에러남(static붙은거만)
 }

//클래스변수 및 클래스메소드
 class Test
 {
	 static int x = 500;

	 /*생성자나 메소드에서 만들 수 없다...클래스 변수는 클래스 영역에서만 선언 할 수 있음
	 Test(){
		static String ss = "hello";
	 }//X

	 void add(){
		static int a = 100;
	 }//X
	 */

	 static void aaa(){
		System.out.println("실행");
		Test.bbb();
		System.out.println("종료");
	 }
	 static void bbb(){
		Test.ccc();
	 }
	 static void ccc(){
		System.out.println("ccc");
	 }
 }

//인스턴스 변수 - 객체 생성 후 사용 가능
 class Test2
 {
	 void aaa2(){
		
	 }
	 void bbb2(){
		
	 }
	 void ccc2(){
		
	 }
 }

class review
{
	static double avg = 99.9;
	int instance = 10;

	void print(){
		//이건 됨
		System.out.println(instance);
	}
	public static void main(String[] args) 
	{
		Abc a = new Abc();

		//둘 다 같은 결과지만 a.num쓰면 안됨
		System.out.println(Abc.num);
		System.out.println(a.num);
		System.out.println(review.avg);

		Mart m1 = new Mart();
		m1.setName("qqq");
		System.out.println(m1.name);

		Test.aaa();
		
		//객체생성 후 사용해야 함(클래스 멤버에서 인스턴스를 호출 할 때)
		//System.out.println(instance); -> 에러
		review r = new review();
		System.out.println(r.instance);
		r.print();

	}
}
