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
			//read()�� return�� int��
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

/* �ѱ� ���� (encoding)
 * -UTF8 : �뻧
 * -ISO 8859-1 : ����ǥ��
 * -KST 5607 : �ѱ� ǥ��(�Ⱦ�) �ѱ� ���ǽ� ����
 *  
 * -MS949 : ������
 * -ANSI : 
 * 
 * */
