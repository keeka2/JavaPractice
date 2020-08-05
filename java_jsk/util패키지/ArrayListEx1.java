import java.util.*;
class ArrayListEx1{
	public static void main(String[] args) {
		//ũ�� 10, 5 4 2 0 1 3 ����� �߰�
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		//list2�� list1�� idx(1~3)
		ArrayList list2 = 
			new ArrayList(list1.subList(1,4)); 
		print(list1, list2);
		//����
		Collections.sort(list1);	
		Collections.sort(list2);	
		print(list1, list2);

		//list2�� list1�� sublist�̹Ƿ� ���� ��
		System.out.println(list1.containsAll(list2));

		//list2�� B C ���� �� 3�� idx�� A, 3�� idx�� AA�� ����
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		list2.set(3, "AA");
		print(list1, list2);

		//list1���� list2�� ���� ���� ����(������)
		System.out.println(list1.retainAll(list2));	
		print(list1, list2);
		System.out.println(list1.size());
		System.out.println(list2.size());
	
		for(int i= 5; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	} 

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class