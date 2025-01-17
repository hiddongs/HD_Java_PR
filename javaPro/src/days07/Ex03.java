package days07;
import util.*;
import java.util.Scanner;

/**
 * 
 * @author kenik
 * @date 2025. 1. 3. - 오후 12:01:56
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// 년도 입력받아서 윤년 평년 체크해서 출력 
		// 해당 연도가 4로 나누어떨어지면 윤년입니다.
		// 그러나, 100으로 나누어떨어지면 윤년이 아닙니다.
		// 단, 400으로 나누어떨어지는 경우 윤년입니다.
		
//		 *      [치윤법]
//		 *      ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고
//                     year % 4 == 0
//		 *      ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,    
//                     year % 100 != 0
//		 *      ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다
//                     year % 400 == 0
		
		
		Scanner sc = new Scanner(System.in);
		int year = getYear(sc);
		
		if (isLeapYear(year)) { //if문 안에 함수가 오면 그 함수는 bool형 함수이다.
			
			System.out.println("윤년(leap year)");
			
		}else {
			System.out.println("평년(common year");
			
		}
		
		
		
	}
	private static boolean isLeapYear(int year) {
		
		
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	private static int getYear(Scanner sc) {
		
		
		String regex = "\\d+"; // \\d+ -> 한자리 이상
		String year;
		do {
			System.out.print("년도 입력 ? ");
			year = sc.next();
				
		}while( !year.matches(regex));
		return Integer.parseInt(year);
		
		
		
	}
	

}
