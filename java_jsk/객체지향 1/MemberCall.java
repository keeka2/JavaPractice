class MemberCall {
	int iv = 10;
	int iv2 = cv;//cv가 iv2보다 먼저 만들어지기 때문에 가능
	static int cv = 20;
	static int cv2 = new MemberCall().iv;//객체 생성 후 대입 가능 - 객체는 바로 삭제 됨

	static void staticMethod1() {
		System.out.println(cv); //
		MemberCall c = new MemberCall();	
		System.out.println(c.iv); //  
	}

	void instanceMethod1() {
		System.out.println(cv);		
		System.out.println(iv); 
	}
	public static void main(String [] args){
		MemberCall mc = new MemberCall();
		mc.instanceMethod1();
		staticMethod1();		
	
	}
}