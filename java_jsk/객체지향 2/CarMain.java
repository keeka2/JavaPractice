class Car{
	String color;
	String type;
	int door;
	Car(){
		this("white","auto",4);
	}
	Car(String color, String type, int door){
		this.color=color;
		this.type= type;
		this.door=door;
	}
	Car(Car c){			  //  Car c = c1`1
		color = c.color;
		type = c.type;
		door = c.door;
	}}
class  CarMain{
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		System.out.println(c1.color+" "+c1.type+" "+c1.door);
		System.out.println(c2.color+" "+c2.type+" "+c2.door);
		c2.color="red";
		System.out.println("===============================");
		System.out.println(c1.color+" "+c1.type+" "+c1.door);
		System.out.println(c2.color+" "+c2.type+" "+c2.door);

	}
}
