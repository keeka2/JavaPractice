package st.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Event {
	private static Connection connection;
	private static ResultSet resultSet;
	private static PreparedStatement preparedStatement;
	private static String sql;
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void inputRecord() {
		sql="insert into student values(student_seq.nextval,?,?,?,?,?)";
		try {
			connection=DBConnection.getConnection();
			System.out.println("1. �л����� �Է��ϱ�"); 
			System.out.println("�̸�,�й�,�����,�����,���м���'�� ������ ������� �Է��ϼ���."); 
		    System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		    while(true) {
		    	System.out.println(">>");
		    	String inputString = scanner.nextLine().trim();
		    	if(inputString.equals("q")) {
		    		return;
		    	}
		    	
		    	try {
		    		String[] is = inputString.split(",");
		    		preparedStatement = connection.prepareStatement(sql);
		    		preparedStatement.setString(1,is[0]);
		    		preparedStatement.setInt(2,Integer.parseInt(is[1]));
		    		preparedStatement.setInt(3,Integer.parseInt(is[2]));
		    		preparedStatement.setInt(4,Integer.parseInt(is[3]));
		    		preparedStatement.setInt(5,Integer.parseInt(is[4]));
		    		preparedStatement.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("�ٽ��Է����ּ���");
				}

		    }

		} catch (Exception e) {
			System.out.println("�������");
		}finally {
			DBConnection.dbclose(connection, preparedStatement, resultSet);
		}

	}
	
	public static void deleteRecord() {
		showRecord();
		sql = "delete from student where studentID = ?";
		System.out.println("�����ϰ��� �ϴ� �������� �й��� �Է��ϼ���.(q:����ȭ��)"); 
		System.out.print(">>");
		String delete_id = scanner.nextLine().trim();
		if(delete_id.equals("q")) {
			return;
		}
		try {
			connection=DBConnection.getConnection();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,Integer.parseInt(delete_id));
			preparedStatement.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ٽ��Է����ּ���");
		}finally {
			DBConnection.dbclose(connection, preparedStatement, resultSet);
		}
	}
	
	
	public static void showRecord() {
		sql="select * from student";
		try {
			connection=DBConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				String name = resultSet.getString("name");
				int stid = resultSet.getInt("studentID");
				int kor = resultSet.getInt("korean");
				int mat = resultSet.getInt("math");
				int eng = resultSet.getInt("english");
				System.out.println("�̸�: "+name+" �й�: "+stid+" ����: "+kor+" ����: "+eng+" ����: "+mat);
			}
		} catch (Exception e) {
			System.out.println("�������");
		}finally {
			DBConnection.dbclose(connection, preparedStatement, resultSet);
		}
	}
}
