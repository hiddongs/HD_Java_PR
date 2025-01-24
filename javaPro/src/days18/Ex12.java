package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex12 {

	public static void main(String[] args) {
		

		// 날짜 + 시간 
		
		LocalDateTime dt = LocalDateTime.now();
		
		// 2025-01-20T16:31:00.861102300
		System.out.println(dt);
//		
//		// LocalDate d = LocalDate.now();
//		// LocalTime t = LocalTime.now();
//		// [1]
//		dt = LocalDateTime.of(d, t);
//		
//		// [2]
//		dt = d.atTime(t);
//		
//		// [3]
//		dt = t.atDate(d);
		
		System.out.println(dt);
		
		// 2025-01-20T16:34:40.980293600
		// 시간부터 분/초/밀초/나초/ 절삭
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		// dt = dt.truncatedTo(ChronoUnit.HOURS);
		
		System.out.println(dt);
		
		// LocalDate + LocalTime = LocalDateTime
		// LocalDateTime -> LocalDate 
		//                  LocalTime
		
		LocalDate d = dt.toLocalDate();
		System.out.println(d);
		
		LocalTime t = dt.toLocalTime();
		System.out.println(t);
	} // main

} // class
