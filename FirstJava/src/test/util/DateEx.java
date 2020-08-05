package test.util;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) {
		//java.util.Date day = new java.util.Date();
		Date day = new Date();
		System.out.println(day);
		//Calendar calendar = new Calender(); - 생성자 protected여서 객체 생성 안됨
		//그래서 클래스 메소드 봐야함
		//calendar가 더 빠름
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(sdf.format(day));
		
		int y = cal.get(Calendar.YEAR);
		int yy = day.getYear()+1900;
		System.out.println(y+"년\n"+yy+"년");
		
		
	}

}
