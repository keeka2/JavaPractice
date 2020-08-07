package ex.scoreboard;
import java.util.*;
import java.awt.Frame;
import java.io.*;
public class ScoreEvaluation {
	static List<Data> record = new ArrayList<Data>(); 
	static HashMap<String, Integer> nameList = new HashMap<String,Integer>();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) { 
	         switch(displayMenu()) { 
	            case 1 : 
	               inputRecord(); 
	               break;
	            case 2 :
	            	deleteRecord();
	            	break;
	            case 3 :
	            	showRecord();
	            	break;
	            case 4 : 
	               System.out.println("���α׷��� �����մϴ�."); 
	               System.exit(0); 
	         } 
	      } // while(true)
	}
	   // menu�� �����ִ� �޼��� 
	static int displayMenu(){ 
		System.out.println("**************************************************"); 
	    System.out.println("*                ���� ���� ���α׷�              *"); 
	    System.out.println("*                   version 1.0                  *"); 
	    System.out.println("*             excerpt from Java�� ����           *"); 
	    System.out.println("**************************************************"); 
	    System.out.println(); 
	    System.out.println(); 
	    System.out.println(" 1. �л����� �Է��ϱ� "); 
	    System.out.println(); 
	    System.out.println(" 2. �л����� �����ϱ� "); 
	    System.out.println(); 
	    System.out.println(" 3. �л����� ����(������)"); 
	    System.out.println(); 
	    System.out.println(" 4. ���α׷� ���� "); 
	    System.out.println(); 
	    System.out.println(); 
	    System.out.print("���ϴ� �޴��� �����ϼ���.(1~4) : "); 

	    int menu = 0; 
	    do { 
	       try { 
	          menu = s.nextInt();
	          s.nextLine();
	          if(menu >= 1 && menu <= 4) { 
	             break; 
	           } 
	          else { 
	             throw new Exception(); 
	           } 
	         } catch(Exception e) { 
	            System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���."); 
	            System.out.print("���ϴ� �޴��� �����ϼ���.(1~4) : "); 
	         } 
	      } while(true); 

	      return menu; 
	   }
	static void inputRecord() {
		System.out.println("1. �л����� �Է��ϱ�"); 
		System.out.println("�̸�,�й�,�����,�����,���м���'�� ������ ������� �Է��ϼ���."); 
	    System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�."); 
	    while(true) {
	    	System.out.println(">>");
	    	do {
	    		try {
	    			String input = s.nextLine().trim();
	    			if(input.equals("q")) {
	    				return;
	    			}
	    			
	    			String[] res = input.split(",");
	    			try {
	    				Integer.parseInt(res[1]);
	    				Integer.parseInt(res[2]);
	    				Integer.parseInt(res[3]);
	    				Integer.parseInt(res[4]);
	    			}catch(Exception e) {
	    				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
	    				continue;
	    			}
	    			String name=res[0];
	    			int id = Integer.parseInt(res[1]);
    				int korean = Integer.parseInt(res[2]);
    				int english = Integer.parseInt(res[3]);
    				int math = Integer.parseInt(res[4]);
    				Data data = new Data(name, id, korean, english, math);
    				record.add(data);
    				
	    		}catch(Exception e) {
	    			e.printStackTrace();
	    		}
	    	} while(true);
	    }
	}
	
	static void deleteRecord() {
		while(true) {
			showRecord();
			System.out.println("�����ϰ��� �ϴ� �������� �й��� �Է��ϼ���.(q:����ȭ��)"); 
			System.out.print(">>"); 
			String temp_id = s.nextLine().trim();
			if(temp_id.equals("q")) {
				return;
			}
			try {
				boolean check = false;
				int student_id = Integer.parseInt(temp_id);
				for(int p=0; p<record.size();p++) {
					if(record.get(p).getId()==student_id) {
						record.remove(p);
						check=true;
					}
				}
				if(!check) {
					System.out.println("�߸��� �Է��Դϴ�");
				}
			}catch(Exception e) {
				System.out.println("�߸��� �Է��Դϴ�");
			}
		}
	}
	
	static void showRecord() {
		Iterator<Data> iterator = record.iterator();
		while(iterator.hasNext()) {
			Data data = iterator.next();
			String n = data.getName();
			int i = data.getId();
			int k = data.getKorean();
			int e = data.getEnglish();
			int m = data.getMath();
			System.out.println("�̸�: "+n+" �й�: "+i+" ����: "+k+" ����: "+e+" ����: "+m);
		}
	}
}
