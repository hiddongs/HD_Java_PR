package days18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 20. - 오후 3:29:57
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		// 1. 날짜 클래스 : LocalDate
		LocalDate d = LocalDate.now();
		System.out.println(d); // 2025-01-20
		
		// getXXXX
		System.out.println(d.getYear());
		
		// [e]num 열거형 
		System.out.println(d.getMonth());
		
		
		// int로 출력
		System.out.println(d.getMonthValue());
		
		
		System.out.println(d.getDayOfMonth());
		
		// 열거형으로 출력
		System.out.println(d.getDayOfWeek());
		DayOfWeek dow = d.getDayOfWeek();
		System.out.println(dow);
		
		// get(Filed)
		
		System.out.println(d.get(ChronoField.YEAR));;
		System.out.println(d.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(d.get(ChronoField.DAY_OF_MONTH));
		System.out.println("일월화수목금토".charAt(d.get(ChronoField.DAY_OF_WEEK)));
		
		
	}

}
