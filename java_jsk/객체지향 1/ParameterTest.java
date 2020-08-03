class Data {	int x; }
class ParameterTest {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("change() : x = " + d.x);
		change(d);
		System.out.println("main() : x = " + d.x);
	}
	static void change(Data a) {  
		a.x = 1000;
		System.out.println("change() : x = " + a.x);
	}
	static void change(int x) {  
		x = 12000;
	}
}