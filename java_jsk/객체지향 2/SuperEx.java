class Parent{
	public Parent(int var){
		System.out.println("Parent Ŭ����");
	}
}
class SuperEx extends Parent {
	public SuperEx() {
		super(1);  
		System.out.println("SuperEx Ŭ����"); 
	}
	public static void main(String[] args) {
		SuperEx se = new SuperEx(); 
		System.out.println("MainŬ����");
	}
}
