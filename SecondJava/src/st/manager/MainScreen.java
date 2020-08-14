package st.manager;

import java.util.Scanner;

import oracle.net.aso.s;

public class MainScreen {
	public static int screen() {
		Scanner scanner = new Scanner(System.in);
		
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
	    
	    int menu=0;
	    while(true) {
	    	try {
				menu = scanner.nextInt();
				scanner.nextLine();
				if(menu>=1 && menu<=4) {
					return menu;
				}else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요."); 
				System.out.print("원하는 메뉴를 선택하세요.(1~4) : "); 
			}
	    }
	    
	    
	}

}
