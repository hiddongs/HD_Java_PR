package days18;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 20. - 오전 10:21:48
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		
		// Ex01_02.java 개강일 요일
		// Ex02_02.java 수료일 요일
		
		
		// 달력
		
		// 1) 2025.5.1 무슨 요일
		// 2) 2025.5   마지막 날짜  Date/     Calender
		
		
		
		
		
		/* Date 사용 [1]
		Date d = new Date(2025-1900, 5-1, 1);
		
		System.out.println(d.toLocaleString());
		d.setMonth(d.getMonth()+1);
		System.out.println(d.toLocaleString());
		d.setDate(d.getDate() - 1);
		System.out.println(d.toLocaleString());
		System.out.println(d.getDate());
		
		/*
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		int month = d.setMonth(m);
		
		d.setYear(2025);
		System.out.println(d.getYear());
		
		d.setMonth(5);
		System.out.println(d.getMonth());
		
		d.
 		*/
		
		
		// [2] Calendar 사용
		
		/*
		Calendar c = new GregorianCalendar(2025,5-1,1);
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DATE, -1);
		
		System.out.println(c.get(Calendar.DATE));
		*/
		
		// [3] Calendar
		
		Calendar c = new GregorianCalendar(2025,5-1,1);
		int lastDay = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
		
	}

	
}
