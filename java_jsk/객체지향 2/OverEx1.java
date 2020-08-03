class OverEx1 {
	public static void main(String[] args) {
		int a = add();
		int b = add(10,20);
		double c = add(10,15.5);
		System.out.println(a+" "+b+" "+c);
	}
	static int add(){
		return 100;
	}
	static int add(int a, int b){
		return a+b;
	}
	static double add(int a, double b){
		return a+b;
	}

}
