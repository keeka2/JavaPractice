class Data { int x; }
class ParameterTest2 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;//<-
		System.out.println("main() : x = " + d.x);
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	static void change(Data a) { // 참조형 매개변수
		a.x = 1000;
		System.out.println("change() : x = " + a.x);
	}
}
