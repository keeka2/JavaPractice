class MemberCall {
	int iv = 10;
	int iv2 = cv;//cv�� iv2���� ���� ��������� ������ ����
	static int cv = 20;
	static int cv2 = new MemberCall().iv;//��ü ���� �� ���� ���� - ��ü�� �ٷ� ���� ��

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