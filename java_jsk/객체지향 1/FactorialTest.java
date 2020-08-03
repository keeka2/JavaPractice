class FactorialTest {
	public static void main(String args[]) {
		System.out.println(factorial(4)); 
	}
	static long factorial(int n) {
		long result=0;
		if ( n == 1) {
			result = 1;		
		} else {
			result = n * factorial(n-1);	
		}
		return result;
	}
}

// f(1) = 1
1
2* f(1)
3* f(2)
4* f(3)
