package test.app;

public class Person {
	long id;
	//�������̵�
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
