package test.util;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) {
		//java.util.Date day = new java.util.Date();
		Date day = new Date();
		System.out.println(day);
		//Calendar calendar = new Calender(); - ������ protected���� ��ü ���� �ȵ�
		//�׷��� Ŭ���� �޼ҵ� ������
		//calendar�� �� ����
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		System.out.println(sdf.format(day));
		
		int y = cal.get(Calendar.YEAR);
		int yy = day.getYear()+1900;
		System.out.println(y+"��\n"+yy+"��");
		
		
	}

}
