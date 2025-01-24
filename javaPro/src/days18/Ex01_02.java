package days18;

import java.util.Date;


public class Ex01_02{

	public static void main(String[] args) {
		
		// 개강일 24/12/23 이 무슨 요일인지 ? -> 월
		
		//Date d = new Date();
		
		
		// [1]
		//d.setYear(2024-1900);
		//d.setMonth(12-1);
		//d.setDate(23);
	
		//System.out.println(d.toLocaleString());
	
		//System.out.println("일월화수목금토".charAt(d.getDay()) + "요일");
		
		
		// [2] 제일 쉬운 방법
		
		Date d = new Date(2024-1900,12-1,23);
		System.out.println("일월화수목금토".charAt(d.getDay()) + "요일");
		
		/*
		 
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.printf("년도 입력 ");
		int year = sc.nextInt();
		System.out.printf("월 입력 ");
		int month = sc.nextInt();
		System.out.printf("일 입력 ");
		int day= sc.nextInt();
	
		System.out.println(year);
		System.out.println();
		System.out.println(year);

        */
	} // main

} // class