class  DataMain{
	public static void main(String[] args) {
		int [] x = {10};
		System.out.println(x[0]);
		change(x);
		System.out.println(x[0]);
	}
	static void change(int [] a){
		a[0] = 1000;
		System.out.println("change() : "+a[0]);
	}
}
