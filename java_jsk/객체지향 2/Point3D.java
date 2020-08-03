class Point4D {
	int x;
	int y;
	String getLocation(){
		return "x :"+x+", y :"+y;
	}}
class Point1D extends Point4D{
	int z;
	String getLocation(){
		return "x :"+x+", y :"+y+", z : "+z;
	}}
class Point3D extends Point1D{
	public static void main(String[] args) 
	{
		Point1D pd = new Point1D();
		System.out.println(pd.x);
		System.out.println(pd.getLocation());
	}
}
