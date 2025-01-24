package days18;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 20. - 오후 12:05:39
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		String strMoney = "1,234,567";
		int money = 1234567;
		
//		[1]
//		money = Integer.parseInt(strMoney.replaceAll(",", ""));
//		System.out.println(money);
		
		
//      [2] DecimalFormat
//      형식화된 문자열 -> 숫자 변환 : parse() 메서드
//      숫자 -> 형식화된 문자열 변환 : format() 메서드
		
		
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number n = df.parse(strMoney);
			
			// Number -> int 변환
			money = n.intValue();
			
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
