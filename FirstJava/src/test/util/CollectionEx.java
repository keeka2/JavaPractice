package test.util;
import java.util.*;
//SET - HashSet, TreeSet
//Map - HashMap, Hashtable, TreeMap, Properties
//List - ArrayList, Vector, LinkedList
//Tree붙은거는 정렬 되있는 거임

import javax.lang.model.type.ArrayType;
import javax.print.attribute.Size2DSyntax;

public class CollectionEx {
	public static void main(String[] args) {
		Map<String, Integer> list = new TreeMap<String, Integer>();
		list.put("a",1);
		list.put("b",1);
		list.put("c",1);
		list.put("p",1);
		list.put("aa",1);
		list.put("ba",1);
		list.put("baa",1);
		System.out.println(list);
		
		ArrayList arrayList = new ArrayList();
		ArrayList arrayList2 = new ArrayList();
		arrayList.add(101);
		arrayList.add(105);
		arrayList.add(103);
		arrayList.add(1033);
		arrayList2.add(205);
		arrayList2.add(225);
		arrayList2.add(252);
		System.out.println(arrayList);
		System.out.println(arrayList2);
		arrayList.addAll(arrayList2);
		System.out.println("합치기: "+arrayList);
		ArrayList arrayList3 = (ArrayList)arrayList.clone();
		System.out.println("복사: "+arrayList3);
		
		System.out.println("검색: "+arrayList3.contains(252));
		System.out.println("검색: "+arrayList3.contains(22));
		
		ArrayList arrayList4 = new ArrayList();
		arrayList4.add(252);
		System.out.println("전체검색: "+arrayList.containsAll(arrayList4));
		
		Object object = arrayList.get(0);
		System.out.println("arrayList.get(0): "+object);
		
		for (Object obj : arrayList) {
			System.out.println(obj);
		}
		
		int index = arrayList.indexOf(1033);
		System.out.println("인덱스: "+index);
		
		while (!arrayList.isEmpty()) {
			System.out.println("삭제: "+arrayList.get(arrayList.size()-1));
			arrayList.remove(arrayList.size()-1);
		}
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("v");
		list2.add("d");
		list2.add("w");
		list2.add("s");
		list2.add("z");
		System.out.println(list2);
		
		List<Data> list3 = new ArrayList<Data>();
		for(int i = 0 ; i<10 ; i++) {
			Data data = new Data(i,i+1);
			list3.add(data);
		}
		for(int i = 0 ; i<list3.size() ; i++) {
			System.out.println("X: "+list3.get(i).getX()+" Y: "+list3.get(i).getY());
		}
		
		
		TreeSet set = new TreeSet();
		for (int i = 0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println("TreeSet: "+set);
		
		
	}

}
