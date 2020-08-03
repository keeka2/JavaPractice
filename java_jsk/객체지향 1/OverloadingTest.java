class OverloadingTest {
	public static void main(String args[]) {
		MyMath3 mm = new MyMath3();
		System.out.println("결과:" + mm.add(3,3));
		System.out.println("결과: " + mm.add(3L,3));
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
   }}
class MyMath3 {
	int add(int a, int b) {
		return a+b;
	}
	long add(long b,int a) {
		return a+b;
	}
	int add(int[] a) {		
		int result = 0;
		for(int i=0; i < a.length;i++) {
			result += a[i];
		}	
		return result;
	}}
