package days18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import days07.Sample;
import util.MyCalender;

public class Ex03_02 {

	public static void main(String[] args) {

		
		// 오늘 날짜인 경우 오늘 날짜에 대괄호 붙혀서 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("> year, month input ? ");
		int year = sc.nextInt();
		int month = sc.nextInt();


		
		printCaleendar(year,month);
		

	}


	private static void printCaleendar(int year, int month) {

		int dayOfWeek = getDayOfWeek(year,month,1);

		//System.out.println("일월화수목금토".charAt(dayOfWeek) +"요일");


		//마지막 날짜 몇일?? 28/29/30/31
		int lastDay = getLastDay(year, month);

		//System.out.printf("마지막 날짜 : %d일\n, lastDay");


		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		Sample.drawLine("-", 60);
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		}


		System.out.println();
		Sample.drawLine("-", 60);
		// 1의 위치를 잡기 위해서 \t for 문
		Calendar c = new GregorianCalendar(year,month-1,1);
		c.add(Calendar.DATE, -dayOfWeek); // 시작날짜를 확인해야한다
		
		int c_month = 1;
		for(int i = 1; i <= 42; i++) {
			
			
			c_month = c.get(Calendar.MONTH) + 1;
			System.out.printf(month == c_month ? "\t%2d" : "\t(%2d)", c.get(Calendar.DATE));
			c.add(Calendar.DATE, 1);
		
			// 앞 뒤 날짜 비교?
			
			
			if(i % 7 == 0) // 7번째마다 개행 
				System.out.println();
			
		} // for i 

		//이렇게 하면 수요일 앞에는 공백이 생긴다 \t 때문이다
		System.out.println();
		Sample.drawLine("-", 60);
		System.out.printf("\t");
		
		
		
	}
	// 수정을 내가 직접 할 내용 함수 써서 고치기 ************************************************
	
	public static boolean isToday(int year, int month, int day) {
		
		Date d = new Date();
		int todayYear = d.getYear() + 1900;
		int todayMonth = d.getMonth() + 1;
		int todayDay = d.getDate();
		
		
		if(todayYear == year && todayMonth == month && todayDay == day)
			return true;
		else
			return false;
		
	}





	private static int getLastDay(int year, int month) {

		Calendar c = new GregorianCalendar(year,month-1,1);
		int lastDay = c.getActualMaximum(Calendar.DATE);
		return lastDay;
	}


	
	// 0(일) 1(월) ~ 6(토)
	private static int getDayOfWeek(int year, int month, int day) {

		Calendar c = new GregorianCalendar(year,month-1,day);

		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		return dayOfWeek-1;




	}

	



}