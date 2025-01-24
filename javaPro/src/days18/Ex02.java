package days18;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		
		// Calendar 클래스
		// Calendar c = new Calneder () 로 객체 안 만듦
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.toString());
		
        // 년도 월 일 시간 분 초 밀리초 요일
		
		System.out.println(c.get(1)); // 2025
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));
		
		// Date (0)일 1(월) ~ 6(토)
		// Calendar 1(일) 2(월)....
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // 해당 년의 월
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); // 해당 년의 몇일
		
		System.out.println("일월화수목금토일".charAt(c.get(Calendar.DAY_OF_WEEK)-1));
		

	}

}
