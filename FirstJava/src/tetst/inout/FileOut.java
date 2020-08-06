package tetst.inout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
public class FileOut {
	public static void main(String [] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("d:\\test.txt");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			byte w[] = str.getBytes();
			fileOutputStream.write(w);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("d:\\test.txt");
			//read()의 return이 int임
			int i = 0;
			while((i=fis.read()) != -1) {
				System.out.println((char)i);
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}

}

/* 한글 깨짐 (encoding)
 * -UTF8 : 대빵
 * -ISO 8859-1 : 국제표준
 * -KST 5607 : 한국 표준(안씀) 한글 오피스 정도
 *  
 * -MS949 : 윈도우
 * -ANSI : 
 * 
 * */
