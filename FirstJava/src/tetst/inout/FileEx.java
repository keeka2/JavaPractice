package tetst.inout;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
public class FileEx {
	public static void main(String[] args) {
		File file = new File("D:\\java_jsk\\final\\Test.java");
		System.out.println(file.toString());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		//File file2 = new File("D:\\java_jsk\\123.txt");
		//file2.delete();
		System.out.println();
		//....
		
		File file3 = new File("C:\\");
		String[] fileList = file3.list();
		ArrayList<String> list = new ArrayList<String>();
		for(String name : fileList) {
			System.out.println(name);
		}
	}
}
