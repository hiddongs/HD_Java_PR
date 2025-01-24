package days20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//6.  java.time 패키지 클래스 사용. ( LocalDateTime 사용)
//1) 설문 시작일 25.12.15  09:00:00
//2) 설문 종료일 25.1.22   09:00:00
//오늘 현재 설문 가능한여부를 출력하세요.


public class Pratice {

	public static void main(String[] args) {
	
		String pattern = "yy.MM.dd hh.mm.ss";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDateTime ldtStart = LocalDateTime.of(24, 12, 15, 9, 0, 0);
		LocalDateTime ldtEnd = LocalDateTime.of(25, 1, 22, 9, 0, 0);
		System.out.println("설문 시작일 ");
		System.out.println(dtf.format(ldtStart));
		
		System.out.println("설문 종료일 ");
		System.out.println(dtf.format(ldtEnd));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.isBefore(ldtEnd));
		
		System.out.println("설문날짜가 종료되어 할 수 없습니다.");
		
		
	}
	
}
