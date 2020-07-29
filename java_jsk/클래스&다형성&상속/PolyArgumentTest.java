import java.util.ArrayList;
class Product {
	int price;			
	int bonusPoint;		

	//객체 생성시 price를 받아야 하고 10분의1은 보너스 포인트
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);	
	}
}

class Market
{
	ArrayList<Product> productList;
	int cash;

	void addProduct(Product p){
		productList.add(p);
	}
	Market(){
		productList = new ArrayList<Product>();
		this.cash=0;
	}
}

class Tv extends Product {

	Tv() {
		super(100);
	}

	//오버라이드
	public String toString() {	
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	//오버라이드
	public String toString() {
		return "Computer";
	}
}

class Buyer {			
	int money = 100;		
	int bonusPoint = 0;	


	void buy(Product p, Market m) {
		//가격확인
		if(!m.productList.contains(p)){
			System.out.println(p.toString()+"가 없습니다.");
			return;
		}
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}

		m.cash+=p.price;
		money -= p.price;			
		bonusPoint += p.bonusPoint;	
		System.out.println(p.toString() + "을/를 구입하셨습니다.");
	} 
}

class PolyArgumentTest {
	public static void main(String args[]) {

		//Buyer 객체 생성
		Buyer b = new Buyer();
		Market m = new Market();

		//Product - Tv 생성
		Tv tv = new Tv();
		m.addProduct(tv);

		Computer com = new Computer();
		m.addProduct(com);

		//b객체가 buy메소드 호출
		b.buy(tv,m);
		b.buy(com,m);

		System.out.println(m.productList);

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		System.out.println("매출은 " + m.cash + "만원입니다.");
	}
}