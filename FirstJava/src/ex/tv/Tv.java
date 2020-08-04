package ex.tv;

public class Tv {
	private String brand;
	public Tv(String brand) {
		this.brand = brand;
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (obj != null && obj instanceof Tv) {
			if(brand.equals(((Tv)obj).brand)) {
				result=true;
			}
		}
		return result;
	}
}
