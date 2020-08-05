import java.util.*;

public class StackEx1 {
	public static Stack back    = new Stack();
	public static Stack forward = new Stack();  

	public static void main(String[] args) {
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");

		printStatus();

		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후 =");  
		printStatus();

		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");  
		printStatus();

		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");  
		printStatus();

		goURL("5.javachobo.com");
		System.out.println("= 새로운 주소로 이동 후 =");  
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("현재화면은 '" + back.peek()+"' 입니다.");  
		System.out.println();
	}

	public static void goURL(String url){
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}

	//forward에서 뽑ㅇ back에 푸쉬
	public static void goForward(){
		if(!forward.empty())
		back.push(forward.pop());
	}

	//back에서 뽑아 forward에 푸쉬
	public static void goBack(){
		if(!back.empty())
		forward.push(back.pop());
	}
}
