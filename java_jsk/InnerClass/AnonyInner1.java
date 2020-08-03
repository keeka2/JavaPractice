abstract class TestAbst{
	int data = 10000;
	public abstract void printData();
  }
 class Test extends TestAbst{
	public void printData(){
			System.out.println("data : "+data);
		}
 }
  class  AnonyInner1{
	public static void main(String[] args){
		TestAbst ta = new Test();
		ta.printData();
	}
  }