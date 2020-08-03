class Test{
	double add(int a, double b){
		return a+b;
	}
	void hello(){
		System.out.println("æ»≥Á«œººø‰");
		return;
	}
}
class TestMain {
	public static void main(String[] args) {
		Test t = new Test();
		int i = t.add(10.5,20);
		System.out.println(i);
		t.hello();
	}
}
