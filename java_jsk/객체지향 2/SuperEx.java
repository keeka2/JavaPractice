class Parent{
	public Parent(int var){
		System.out.println("Parent 클래스");
	}
}
class SuperEx extends Parent {
	public SuperEx() {
		super(1);  
		System.out.println("SuperEx 클래스"); 
	}
	public static void main(String[] args) {
		SuperEx se = new SuperEx(); 
		System.out.println("Main클래스");
	}
}
