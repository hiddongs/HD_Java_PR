package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 20. - 오후 5:17:51
 * @subject
 * @content
 */
public class Ex14_02 {

	public static void main(String[] args) {
	
		
	
		LocalDate d1 = LocalDate.of(2014, 1, 1);
		LocalDate d2 = LocalDate.of(2015,12,31);
		
		Period p = Period.between(d1, d2); // d1 포함 O d2 포함 X
		
		System.out.println(p); // P1Y11M30D P 1년 11개월 30일 날짜 간격
		
		// 총 개월 수 : 23개월 차이  ( 일 무시 )
		System.out.println(p.toTotalMonths());
	
		System.out.println("-".repeat(60));
		// 오늘 아침에 수업 시작한지 지금 몇초가 지났나?
		
		LocalTime s = LocalTime.of(9,0);
		LocalTime t = LocalTime.now();
		Duration d = Duration.between(s, t);
		System.out.println(d); // PT8H25M4.7536936S
		System.out.println(d.toHours());
		System.out.println(d.toMinutes()); // 8 * 60 + 24 = 505 분으로 바꾼 것
		
		System.out.println(d.toSeconds()); // 30338 초로 바꾼 것

		

		
		

		
		
		
	}

}
