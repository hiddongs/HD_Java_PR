package days10;
import util.*;

import java.util.Date;
import java.util.Scanner;

public class Ex01_PR {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.println("Year Month ?");
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		
	}
	
	public static int getLastDay(int year, int month) {
		
		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int lastDay = months[month - 1];
		
		//윤년 계산 윤년이면서 월이 2월이면 29일 출력
		if (MyCalender.isLeapYear(year) && month == 2)
			lastDay = 29;
		
		return lastDay;
	

	}
	
	public static int getTotalDay(int year, int month, int day) {
		
	   int totalDays = 0;
	   
	   int [] months = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	   
	   //총 일수 그러나 윤년이 들어가는 날과 안 들어가는 년도를 반영한 값
	   totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
	
	   
	   //입력값이 4월이면 3월까지의 일수만 계산해준다 그렇기에 4월에 해당하는 일수도 더해줘야한다
	   for(int  i = 0; i < month - 1; i++) {
		   totalDays += months[i];
	   }
	   
	   //ex 입력한 일수 더하기
	   totalDays = day;
	   ;
	   
	   //만약 현재 입력한 년도가 윤년이고 2월이 지났다면 윤년에 맞춰 하루를 더해준다
	   if(MyCalender.isLeapYear(year) && month >= 3) {
		   totalDays += 1;
	   }
	   return totalDays;
	}
	
	public static int getDayOfWeek(int year, int month, int day) {
		
		
		int totalDays = getTotalDay(year,month,day);
		System.out.printf("1.1.1 ~ %d.%d.%d 총 날짜수 = %d일 \n", year,month,day);
		
		
		int dayOfWeek = totalDays % 7;
		return dayOfWeek;
		
	}
	
	public static Boolean isToday(int year, int month, int day) {
		
		Date d = new Date();
		int todayYear = d.getYear() + 1900;
		int todayMonth = d.getMonth() + 1;
		int todayDay = d.getDate();
		
		
		if(todayYear == year && todayMonth == month && todayDay == day) {
			return true;
			}
		else {
		   return false;
		}
		}
	}



