package days10;

import java.util.Date;
import java.util.Scanner;

import days07.Sample;
import util.MyCalender;

public class Ex01 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub 

		Scanner sc = new Scanner(System.in);
		System.out.print("> year, month input ? ");
		int year = sc.nextInt();
		int month = sc.nextInt();


		//printCaleendar(year,month);

		
		for(int i = 1; i <= 12; i++)
		{
			printCaleendar(year,i);
		}

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
		for(int i = 0; i < dayOfWeek; i++)
		{
			System.out.print("\t");
		}
		for(int i = 1; i <= lastDay; i++) {
			
			if(isToday(year,month,i)) {
				System.out.printf("\t[%d]",i);
				
			}
			else {
				System.out.printf("\t%2d", i);
			}
			if((dayOfWeek + i) % 7 == 0)
			{
				System.out.println();
				Sample.drawLine("-", 60);
			}
			
		}

		//이렇게 하면 수요일 앞에는 공백이 생긴다 \t 때문이다
		System.out.println();
		Sample.drawLine("-", 60);
		System.out.printf("\t");
		
		
		
	}
	
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

		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};  

		int lastDay = months[month - 1];


		//윤년일 때
		if(MyCalender.isLeapYear(year) && month == 2) lastDay = 29;

		return lastDay;
	}


	private static int getDayOfWeek(int year, int month, int day) {


		int totalDays  = getTotalDays(year, month, day);
		System.out.printf("1.1.1 ~ %d.%d.%d 총 날짜수 = %d일\n", year,month,day,totalDays);

		int dayOfWeek = totalDays % 7;




		return dayOfWeek;



	}

	/*
	private static int getTotalDays(int year, int month, int day) {


		//year = 2025
		//month = 4
		//days = 1
		int totalDays = 0;



		// 전년도 까지의 총 날짜수 계산
		for(int i = 1; i < year; i++) {
			if(MyCalender.isLeapYear(i)) {

				totalDays += 366;

			}else {
				totalDays += 365;
			}

		}
		// +1 
		// 1월 + 1
		// 1월 + 2월 + 3월 + 1
		// 1월 ~ 11월 + 1




		/*
		switch (month) {
		case 1 :
			totalDays += 1;
			break;
		case 2 :

			totalDays += 31 + 1;
			break;
		case 3 :
			totalDays += 31 + 28/29 + 1;


		case 4 :,,,,


		}



		//               1월                                         12월
		//               [0]                                         [11]
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};

		for(int i = 0; i < month - 1; i++) {
			totalDays += months[i];
		}

		if(MyCalender.isLeapYear(year) && month >= 3) totalDays++;

		totalDays += day;
		//totaDays += 1;






		return totalDays;

	 */
	private static int getTotalDays(int year, int month, int day) {
		int totalDays = 0;

		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};   


		/*

	      for (int i = 1; i < year ; i++) {
	         totalDays += MyCalender.isLeapYear(i)? 366 : 365 ;
	      }
		 */

		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		for (int i = 0; i < month-1 ; i++) {
			totalDays += months[i];
		}

		totalDays += day;

		if (MyCalender.isLeapYear(year) && month >= 3) {
			totalDays += 1;
		}

		return totalDays;




	}




}
