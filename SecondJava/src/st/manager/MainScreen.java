package st.manager;

import java.util.Scanner;

import oracle.net.aso.s;

public class MainScreen {
	public static int screen() {
		Scanner scanner = new Scanner(System.in);
		
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
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���."); 
				System.out.print("���ϴ� �޴��� �����ϼ���.(1~4) : "); 
			}
	    }
	    
	    
	}

}
