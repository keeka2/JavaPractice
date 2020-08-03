package test.app;
import ex.java.TV;
//풀네임 : test.app.Main

//API 사용시 확인
//1. 필드(상수) 확인
//2. 생성자 확인
//3. 객체 출력
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public 그냥 다 됨
		System.out.println(TV.a);//public
		//System.out.println(TV.b);//protected
		//System.out.println(TV.c);//default
		//System.out.println(TV.d);//private
		
		//protected 상속 or 같은 패키지
		//System.out.println(TV.b);//protected
		
		
		//System.out.println(TV.c);//default
		//System.out.println(TV.d);//private		
		
		System.out.println();
		Integer i1 = new Integer(10);
		Integer i2 = 11;
		int i3 = 10;
		System.out.println(i1+" "+i2+" "+i3);
		System.out.println(i1.compareTo(i2));
		System.out.println("API확인");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.TYPE);
		
		//버퍼: sw와 hw 속도차이를 극복하기 위해 나온 것
		//글자 양이 많아지면 String말고 StringBuffer / StringBuilder 쓰셈
		/*
		 * String - 매번 처음부터 다시 씀 : 문자열 적으면 빠르나 많아지면 느려짐
		 * EX) 1 -> 12 -> 123 메오리 낭비도 심함
		 * 
		 * StringBuffer - 1부터 1000까지 써도 1byte면 됨
		 * 
		 * 
		 * */
		String s1 = new String("abc");
		String s2 = "abc";
		
		if(s1==s2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(s1.equals(s2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String str1 = " a b c ";
		String msg = null;
		str1.replace("a","b");
		System.out.println("msg :"+msg);
		msg=str1.toUpperCase();
		System.out.println("msg :"+msg);
		msg=str1.trim();
		System.out.println("msg :"+msg);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("qweqwe");
		System.out.println(sb);
		
	}

}
