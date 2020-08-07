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
	               System.out.println("프로그램을 종료합니다."); 
	               System.exit(0); 
	         } 
	      } // while(true)
	}
	   // menu를 보여주는 메서드 
	static int displayMenu(){ 
		System.out.println("**************************************************"); 
	    System.out.println("*                성적 관리 프로그램              *"); 
	    System.out.println("*                   version 1.0                  *"); 
	    System.out.println("*             excerpt from Java의 정석           *"); 
	    System.out.println("**************************************************"); 
	    System.out.println(); 
	    System.out.println(); 
	    System.out.println(" 1. 학생성적 입력하기 "); 
	    System.out.println(); 
	    System.out.println(" 2. 학생성적 삭제하기 "); 
	    System.out.println(); 
	    System.out.println(" 3. 학생성적 보기(순서순)"); 
	    System.out.println(); 
	    System.out.println(" 4. 프로그램 종료 "); 
	    System.out.println(); 
	    System.out.println(); 
	    System.out.print("원하는 메뉴를 선택하세요.(1~4) : "); 

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
	            System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요."); 
	            System.out.print("원하는 메뉴를 선택하세요.(1~4) : "); 
	         } 
	      } while(true); 

	      return menu; 
	   }
	static void inputRecord() {
		System.out.println("1. 학생성적 입력하기"); 
		System.out.println("이름,학번,국어성적,영어성적,수학성적'의 순서로 공백없이 입력하세요."); 
	    System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다."); 
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
	    				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
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
			System.out.println("삭제하고자 하는 데이터의 학번을 입력하세요.(q:메인화면)"); 
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
					System.out.println("잘못된 입력입니다");
				}
			}catch(Exception e) {
				System.out.println("잘못된 입력입니다");
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
			System.out.println("이름: "+n+" 학번: "+i+" 국어: "+k+" 영어: "+e+" 수학: "+m);
		}
	}
}
