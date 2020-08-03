class Card {
	String kind ;				
	int number;				   
	static int width = 100;		
	static int height = 250;		
}
class CardTest{
	public static void main(String args[]) {
		System.out.println(Card.width);
		System.out.println(Card.height);
		//  메모리는 2개 새성 - static은 메인 메소드 실행 전 미리 만들어짐
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println(c1.kind + "," + c1.number + "," + c1.width + ", " + c1.height);
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		System.out.println("c1의 width와 height를  50, 80으로 변경.");

		c1.width = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
	}
 }

