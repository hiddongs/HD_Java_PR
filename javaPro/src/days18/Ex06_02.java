package days18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06_02 {
	
	
	public static void main(String[] args) throws ParseException {


		String s = "2025.01.20(월)";
		
		// 문자열 s -> 날짜( Date, [Calendar] ) 변환
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		
		Date d = sdf.parse(s);
		
		System.out.printf(sdf.format(d));
		
	}
}
