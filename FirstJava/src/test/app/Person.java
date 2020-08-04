package test.app;

public class Person {
	long id;
	//오버라이딩
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return this.id == ((Person)obj).id;
		} else {
			return false;
		}
	}
	Person(long id){
		this.id = id;
	}

}
