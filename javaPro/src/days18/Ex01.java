package days18;

import java.time.LocalDate;
import java.util.Date;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 20. - 오전 9:04:17
 * @subject   날짜 (date), 시간 (time), 형식화(formatting)
 * @content   컬렉션 프레임워크
 *            제네릭과 어노테이션
 *            자바 IO
 *            ----
 *            스레드 + 네트워크
 *            람다식 +  스트림
 */
public class Ex01 {

	public static void main(String[] args) {
		
		
		/*
		 *  1. Jdk 1.0 - java.util.Date 클래스
		 *  2. Jdk 1.1 - java.util.Calender 클래스
		 *                      ㄴ GregorianCalender  클래스
		 *  3. Jdk 1.8 - java.time 패키지 안에 여러 하위 패키지 
		 *                   ㄴ 다양한 클래스 추가....                 
		 */
		
		
		Date d = new Date(); // 현재 시스템이 날짜 + 시간 
		// Mon Jan 20 09:10:16 GMT+09:00 2025  ->   GMT 그리니치 천문대에서 정의한 시간 값을 제공
		System.out.println(d.toString()); // 기존 toString과는 다른 출력 구조 -> 오버라이딩 된 것.

		//System.out.println(d.toGMTString());
		System.out.println(d.toLocaleString()); // 우리가 원하는 시간대 출력 Local 2025. 1. 20. 오전 9:14:32 
		
		// 년
		System.out.println(d.getYear() + 1900); 
		// 월
		System.out.println(d.getMonth() + 1); 
		
		// 일
		System.out.println(d.getMinutes());
		
		// 시간
		System.out.println(d.getHours());
		// 분
		System.out.println(d.getMinutes());
		// 초
		System.out.println(d.getSeconds());
		// 밀리초
		// 밀리초는 없음
		
		System.out.println("일월화수목금토".charAt(d.getDay()));
		// 요일
		
		
       // 앞으로 쓴다면 이걸 쓰는게 더 효율적 
		
       // boolean d.after(Date when);
	   // boolean d.before(Date when);
		
	   // d.equals(d)
	   // d.compareTo(Date anotherDate);
		
	   // set으로 된 이름들은 직접 설정하는 것이다 
	   // setter  // getter
		
	}

}
