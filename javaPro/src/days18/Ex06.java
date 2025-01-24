package days18;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex06 {

	public static void main(String[] args) {
		
		// [2.  SimpleDateFormat 클래스]
		// Date, Calendar -> ? 내가 원하는 날짜/ 시간 형식으로 변환하는 클래스
		Calendar c = Calendar.getInstance();
		
		
	
		// System.out.println(c);
		// String pattern = "yyyy년 MM월 dd일 E요일";
		// 년도 두 자리, 월 한자리, 일 한자리, 밀리세컨드 3자리 , 월
		String pattern = "yy년 M월 d일 hh:mm:ss.SSS E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// Calendar -> Date 형변ㅇ환
		
		String s  = sdf.format(c.getTime());
		System.out.println(s);
		System.out.println("end");
	}
}
