import java.util.*;
class ListArray 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		

		Map<String, Double> prduct = new LinkedHashMap<>();
		
		prduct.put("Rice1",6.9);
		System.out.println(prduct);
		prduct.put("Rice2",6.9);
		System.out.println(prduct);
		prduct.put("Rice3",6.9);
		System.out.println(prduct);
		prduct.put("Rice4",6.9);
		System.out.println(prduct);
		prduct.put("Rice5",6.9);
		System.out.println(prduct);
		prduct.put("Rice1",7.9);
		System.out.println(prduct);

		System.out.println(prduct.get("Rice1"));

		prduct.forEach((key, value) -> {
			System.out.println(key+" "+value);
		});



	}
}
