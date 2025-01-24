package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex14 {

	public static void main(String[] args) {
		
		// 날짜와 날짜 사이의 간격 period
		// 시간과 시간 사이의 간격 duration
		
		// 개강일
		LocalDate o = LocalDate.of(2024,12, 23);
		
		// 오늘
		LocalDate t = LocalDate.now();
		
		//    간격      o포함 O     t포함 X
		Period p = Period.between(o,t);
		
		// 개강일로부터 오늘일까지의 간격 p
		long year = p.get(ChronoUnit.YEARS);

		System.out.println(year);


		long month = p.get(ChronoUnit.MONTHS);

		System.out.println(month);

		long day = p.get(ChronoUnit.DAYS);

		System.out.println(day);
		
		System.out.println("-".repeat(60));
		
		
		// 수업시작 시간
		LocalTime ot = LocalTime.of(9, 0, 0);
		// System.out.println(ot);
		LocalTime tt = LocalTime.now();
		
		// 시간 - 시간  = 간격 Duration
		Duration d =Duration.between(ot, tt);
		
		// 시
		// Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Hours
		// long hour = d.get(ChronoUnit.HOURS); //duration에서 hours는 사용 X 분도 마찬가지
        //	System.out.println(hour);
		
		System.out.println(d.getSeconds());
		System.out.println(d.get(ChronoUnit.SECONDS));
		System.out.println(d.getNano());
		
		// Period 날짜 - 날짜의 간격
		// between() / until() 차이점
		// static메서드 / 인스턴스 메서드
	
	} // main

} // class
