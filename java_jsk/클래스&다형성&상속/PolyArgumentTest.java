import java.util.ArrayList;
class Product {
	int price;			
	int bonusPoint;		

	//��ü ������ price�� �޾ƾ� �ϰ� 10����1�� ���ʽ� ����Ʈ
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

	//�������̵�
	public String toString() {	
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	//�������̵�
	public String toString() {
		return "Computer";
	}
}

class Buyer {			
	int money = 100;		
	int bonusPoint = 0;	


	void buy(Product p, Market m) {
		//����Ȯ��
		if(!m.productList.contains(p)){
			System.out.println(p.toString()+"�� �����ϴ�.");
			return;
		}
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}

		m.cash+=p.price;
		money -= p.price;			
		bonusPoint += p.bonusPoint;	
		System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�.");
	} 
}

class PolyArgumentTest {
	public static void main(String args[]) {

		//Buyer ��ü ����
		Buyer b = new Buyer();
		Market m = new Market();

		//Product - Tv ����
		Tv tv = new Tv();
		m.addProduct(tv);

		Computer com = new Computer();
		m.addProduct(com);

		//b��ü�� buy�޼ҵ� ȣ��
		b.buy(tv,m);
		b.buy(com,m);

		System.out.println(m.productList);

		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
		System.out.println("������ " + m.cash + "�����Դϴ�.");
	}
}