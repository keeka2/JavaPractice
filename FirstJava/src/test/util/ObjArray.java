package test.util;

import java.util.ArrayList;

public class ObjArray {

	public static void main(String[] args) {
		// String�ܿ� �ٸ� ���� �� �ִ´�, ������ Ÿ�Ը� ����
		ArrayList list1 = new ArrayList();
		list1.add("dd");
		list1.add("dd2");
		//����ȯ
		String obj = (String)list1.get(0);
		Object obj2 = list1.get(1);
		System.out.println(obj);
		System.out.println(obj2);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("jsp");
		list2.add("java");
		String str = list2.get(0);
		System.out.println(str);
	}

}
