package days18;

import java.util.Calendar;

public class Ex02_02 {

	public static void main(String[] args) {

		
		// 수료일  25/07/21 무슨 요일인지
		
		// Calender 
		
		Calendar c = Calendar.getInstance();
		
		/* [1]
		c.set(Calendar.YEAR, 2025);
		c.set(Calendar.MONTH, 7-1);
		c.set(Calendar.DATE, 21);
		    
		   [2]
		   
		c.set(2025, 7-1, 21);
		
		
		   [3]
		   
		Calendar c = new GregorianCalendar(2025,7-1,21);
		c.get(Calendar.DAY_OF_WEEK);
		
		*/
		
		char dayOfWeek ="_일월화수목금토".charAt(c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(dayOfWeek);
	} // main

} // class 
