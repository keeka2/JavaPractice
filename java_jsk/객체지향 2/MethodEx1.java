class MethodEx1 {
	public static void main(String[] args) {
		System.out.println(add(4));
	}
	static long add(int x){
		long result = 0;
		if(x == 1){
			System.out.println(x);
			result = 1;
		}else{
			System.out.println(x);
			result = x * add(x-1);
		}
		return result;
	}
}
