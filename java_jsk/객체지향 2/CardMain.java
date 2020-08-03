class Card{
	String kind;
	int num;
	static int width;
	static int height;
}
class CardMain {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		c1.kind="heart";
		c1.num=7;
		c2.kind="spade";
		c2.num=5;
		Card.width=100;
		c1.height=150;
		System.out.println(c1.kind+" "+c1.num+" "+c1.width+" "+c1.height);
	}
}
