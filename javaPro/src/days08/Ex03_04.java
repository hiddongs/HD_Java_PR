package days08;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오후 12:05:35
 * @subject
 * @content 
 */
public class Ex03_04 {

	public static void main(String[] args) {
		// 올해 년도 
		Date d = new Date();
		int currentYear = d.getYear() + 1900;
		System.out.println(currentYear);
		
		System.out.println( d.getMonth()+1 );  // 월
		System.out.println( d.getDate() ); // 일
		
		// 생일 -> Date d
		
		// d.after(Date when);
		// d.before(when);
		// d.compareTo(d);
		
		/*
		Calendar c = Calendar.getInstance();
		currentYear =  c.get(Calendar.YEAR);
		System.out.println(currentYear);
		
		LocalDate ld = LocalDate.now();
		currentYear =  ld.getYear();
		System.out.println(currentYear);
		*/
		
	} // main

} // class










