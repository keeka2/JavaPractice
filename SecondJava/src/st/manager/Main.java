package st.manager;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(MainScreen.screen()) 
			{
				case 1 :
					Event.inputRecord();
					break;
				case 2 :
					Event.deleteRecord();
					break;
				case 3:
					Event.showRecord();
					break;
				case 4 :
		            System.out.println("���α׷��� �����մϴ�."); 
		            System.exit(0); 
			}
		}
	}

}
