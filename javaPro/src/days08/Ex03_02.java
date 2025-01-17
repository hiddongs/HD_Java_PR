package days08;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오전 10:30:46
 * @subject
 * @content 
 */
public class Ex03_02 {

	public static void main(String[] args) {
		 
		String rrn = "990412-9700001";
		System.out.println(rrn); 
		// 주민등록번호로 부터 생년월일 얻어와서 출력.
		// "????년 ??월 ??일"
		String birthday = getBirthday(rrn);
		System.out.println(birthday);

	} // main

	// "990412-9700001"
	public static String getBirthday(String rrn) {
		int year = Integer.parseInt( rrn.substring(0, 2) );
		int month = Integer.parseInt( rrn.substring(2, 4) );
		int day = Integer.parseInt( rrn.substring(4, 6) );
		
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9': case '0':
			year += 1800;
			break;
		case '1': case '2': case '5': case '6':
			year += 1900;
			break;
		default:
			year += 2000;
			break;
		}
		
		return String.format("%d년 %02d월 %02d일", year, month, day);
	}
	
 
	
} // class










