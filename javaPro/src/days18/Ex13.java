package days18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 20. - 오후 4:40:12
 * @subject 
 * @content 
 */
public class Ex13 {

	public static void main(String[] args) {
		/*
		 * 
		 * [TemporalAdjusters 클래스]
		 * == Temporal( 시간 상의 ) + Adjusters(조정자)
		 * 
		 * 날짜, 시간을 변경할 때 메서드 : plus(), plusXXX()
		 *                          minus(), minusXXX()
		 *                          with(), withXXX()
		 *                          
		 *                          
		 * 자주 사용되는 날짜, 시간의 수정 관련 메서드를 미리 구현해 놓은 클래스
		 * 예 ) 다음 주 금묘일 휴강 ~
		 * 
		 * 
		 */
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		// 이번 달의 첫 번째 월요일 
	    d = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		
	    
	    // [문제] 이번 달 마지막 토요일 휴강
	    
	    d = d.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
		System.out.println(d);

	} // main

} // class