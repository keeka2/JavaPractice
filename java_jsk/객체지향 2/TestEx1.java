class TestEx1 {
	public static void main(String[] args) {
		System.out.println("main()����");
		a();
		System.out.println("main()����");
	}
	static void a(){
		System.out.println("a()����");
		b();
		System.out.println("a()����");
	}
	static void b(){
		System.out.println("b()����");
		System.out.println("b()����");
	}
}
