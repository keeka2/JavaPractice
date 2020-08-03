class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add1(3,5);
		System.out.println(result);

		int [] result2 = {0};
		r.add2(3,5,result2);
		System.out.println(result2[0]);
	}
	int add1(int a, int b) {		return a + b;	}
	void add2(int a, int b, int[] result) {
		result[0] = a + b;
	}
}