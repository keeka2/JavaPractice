class MemberInner{
	int a = 10;
	private int b = 100;
	static int c = 200;
	class Inner {
		public void printData(){
			System.out.println("int a : "+a);
			System.out.println("private int b : "+b);
			System.out.println("static int c : "+c);
		}
	}
	public static void main(String[] args){
	
		MemberInner outer = new MemberInner();
		MemberInner.Inner inner = outer.new Inner();
		inner.printData();
	}
}