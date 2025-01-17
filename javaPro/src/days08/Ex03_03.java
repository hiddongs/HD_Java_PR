package days08;

import java.util.Date;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오전 10:30:46
 * @subject
 * @content 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		 
		String rrn = "830412-1700001";
		System.out.println(rrn); 
		
		// 나이 계산 - 정년퇴임
		// 1) 세는 나이(한국 나이)
		// 2) 만 나이
		
		/*
		 *         2024.12.30  25.1.1  25.12.29  25.12.30
		 * 세는 나이       1        2       2         2
		 * 만 나이        0        0        0         1
		 * 
		 * */ 
		
		
		int age = getCountingAge(rrn);
		// System.out.println("세는 나이 : " + age);
		
		age = getAmericanAge(rrn);
		System.out.println("만 나이 : " + age);
		 

	} // main	 
	
	private static int getAmericanAge(String rrn) {
		// 만나이 = 올해년도 - 생일년도    생일지나지않은경우 -1
		int americanAge = getCountingAge(rrn)-1;
		
		/*
		int currentMonth = 11;
		int currerntDay = 6;
		int birthMonth = 4;
		int birthDay = 12;
		if( birthMonth > currentMonth ) americanAge--;
		else if( birthMonth == currentMonth &&  birthDay > currerntDay) americanAge--;
		*/
		Date d = new Date();  
		int currentMonth = d.getMonth()+1;
		int currerntDay = d.getDate();		
		int currentMonthDay = currentMonth*100 + currerntDay;
		int birthMonthDay = Integer.parseInt( rrn.substring(2, 6) ); // 412
		
		if( currentMonthDay < birthMonthDay) americanAge--;
		
		return americanAge;
	}
	

	private static int getCountingAge(String rrn) {
		
		int birthYear = Integer.parseInt(Ex03_02.getBirthday(rrn).substring(0, 4) );
		
		Date d = new Date();
		int currentYear = d.getYear() + 1900;
		
		return currentYear - birthYear + 1;
	}
	 
	/*
	private static int getCountingAge(String rrn) {
		// 올해년도 : 2025
		// 생일년도 : 2024
		// 세는 나이 = 올해년도 - 생일년도 + 1
		int birthYear = Integer.parseInt( rrn.substring(0, 2) );
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9': case '0':
			birthYear += 1800;
			break;
		case '1': case '2': case '5': case '6':
			birthYear += 1900;
			break;
		default:
			birthYear += 2000;
			break;
		}
		
		return 2025 - birthYear + 1;
	}
	*/
	
	
	
	
	
	
 
	
} // class










