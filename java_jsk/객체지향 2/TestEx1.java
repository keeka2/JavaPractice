class TestEx1 {
	public static void main(String[] args) {
		System.out.println("main()실행");
		a();
		System.out.println("main()종료");
	}
	static void a(){
		System.out.println("a()실행");
		b();
		System.out.println("a()종료");
	}
	static void b(){
		System.out.println("b()실행");
		System.out.println("b()종료");
	}
}
