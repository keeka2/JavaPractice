package test.app;
import ex.java.TV;
//Ǯ���� : test.app.Main

//API ���� Ȯ��
//1. �ʵ�(���) Ȯ��
//2. ������ Ȯ��
//3. ��ü ���
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public �׳� �� ��
		System.out.println(TV.a);//public
		//System.out.println(TV.b);//protected
		//System.out.println(TV.c);//default
		//System.out.println(TV.d);//private
		
		//protected ��� or ���� ��Ű��
		//System.out.println(TV.b);//protected
		
		
		//System.out.println(TV.c);//default
		//System.out.println(TV.d);//private		
		
		System.out.println();
		Integer i1 = new Integer(10);
		Integer i2 = 11;
		int i3 = 10;
		System.out.println(i1+" "+i2+" "+i3);
		System.out.println(i1.compareTo(i2));
		System.out.println("APIȮ��");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.TYPE);
		
		//����: sw�� hw �ӵ����̸� �غ��ϱ� ���� ���� ��
		//���� ���� �������� String���� StringBuffer / StringBuilder ����
		/*
		 * String - �Ź� ó������ �ٽ� �� : ���ڿ� ������ ������ �������� ������
		 * EX) 1 -> 12 -> 123 �޿��� ���� ����
		 * 
		 * StringBuffer - 1���� 1000���� �ᵵ 1byte�� ��
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
