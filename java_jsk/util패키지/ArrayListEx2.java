import java.util.*; 
class ArrayListEx2 { 
	public static void main(String[] args) { 
		//상수 10
		final int LIMIT = 10;
		//문자열
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		//문자열 길이 - 43
		int length = source.length();
		System.out.println(source.length());
		// 길이 나누기 10 +10 ==14
		//List로 선언하여도 마찬가지 같은 기능 확장면에서 유리
		List list = new ArrayList(length/LIMIT + 10);
		for(int i=0; i < length; i+=LIMIT) { 
			if(i+LIMIT < length ) 
				//10글자씩 나눔
				list.add(source.substring(i, i+LIMIT)); 
			else 
				//안나눠지면 마지막에는 i에서 마지막까지
				list.add(source.substring(i));
		} 

		for(int i=0; i < list.size(); i++) { 
			System.out.println(list.get(i)); 
		} 
	}
} 
 