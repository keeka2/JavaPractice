class Tv{
	String color;
	static int channel;
}
class TvMain {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();

		System.out.println(t1.channel);
		System.out.println(t2.channel);

	}
}
