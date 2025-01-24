package days18;

import java.text.DecimalFormat;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 20. - 오전 11:34:09
 * @subject [형식화 클래스 4가지]
 * @content 1. DecimalFormat 클래스
 *          2. SimpleDateFormet 클래스
 *          3. ChoiceFormat 클래스
 *          4. MessageFortat클래스
 */

public class Ex05 {

	public static void main(String[] args) {
		
//		
//		 // 1. DecimalFormat 클래스
//		 //        ㄴ 슛저룰 형식화(내가 원하는 형식) 하는데 사용되는 클래스
//		
//		int money = 3257600;
//		// 3,257,600
//		// 1) 로직으로 구현하기
//		// 2) Strginformat 함수 써서 구현하기
//		
//		System.out.println(String.format("%,d", money));
//		
//		String pattern = "#,###";
//		DecimalFormat df = new DecimalFormat(pattern);
//		System.out.println(df.format(money));
//		
		
		String pattern = "\u00A4 #,###.00";
		double money = 3257600.8;
		// 화폐단위 붙이고,  Wu00A4
		// 천 자리마다 콤마 붙이고, 
		// 소수점은 무조건 2자리 까지 출력~ 
		//            \  3,257,600,80
		
		// 12 : 00 + 5분
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println(df.format(money));
		
		
	}

}
