import java.util.*;
class SetTest
{
	public static void main(String[] args) 
	{
		Set<String> set1 = new HashSet<>();
		boolean flag = set1.add("1");
		boolean flag2 = set1.add("2");
		boolean flag3 = set1.add("3");
		boolean flag4 = set1.add("4");
		boolean flag5 = set1.add("5");
		boolean flag6 = set1.add("5");
		System.out.println(set1.size());
		System.out.println(set1);
		System.out.println(flag6);

	}
}
