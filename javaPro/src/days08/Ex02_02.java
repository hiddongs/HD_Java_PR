package days08;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오전 10:10:06
 * @subject
 * @content 
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		String rrn = "830412-1700001";		
		// String.substring() 메서드 사용 처리
		// 1. 기능
		// 2. 매개변수
		// 3. 리턴값(리턴자료형)
		
		// [문제] 주민등록번호 뒷자리 7개를 필요..
		System.out.println( rrn.split("-")[1] );
		System.out.println( rrn.substring(7, rrn.length()) );
		System.out.println( rrn.substring(7) );
		
		
		/*
		int beginIndex = 0;
		int endIndex = 8;
		String result = rrn.substring(beginIndex, endIndex);
		System.out.println( result + "******" );
		
		beginIndex = 0;
		endIndex = 7;
		result = rrn.substring(beginIndex, endIndex);
		System.out.println( result + "*******" );
		*/
		
	} // main

} // class










