package days16;
/**
 * 
 * @author kenik
 * @date 2025. 1. 16. - 오후 2:01:43
 * @subject
 * @content
 */

public class Ex04_03 {
	
	
	
	public static void main(String[] args) {

		
		// boolean startWith(접두사)
		//          1234567890123    13
		// index    0123456789012
		String url = "www.naver.com";

		int index = url.lastIndexOf(".com");
		System.out.println(index == (url.length() - ".com".length()));
		
		System.out.println(url.endsWith(".com"));
		
		System.out.println("end");
		}
		
		
		
		
		//------------------------------------------------------------
		
	//	String url = "http://www.naver.com";
		// 입력한 url은 반드시 http:// 문자열로 시작을 해야지 올바른 url이다.
		
	    // url.contains("http://");  X
		// indexOf() lastIndexOf()
		
		/* [1]
		int index = url.indexOf("http://");
		if(index == 0) System.out.println("올바른 url이다.");
		else System.out.println("잘못된 url이다.");
		System.out.println(" end ");
		*/
		
		// [2]
	//	if(url.startsWith("http://")) System.out.println("올바른 url이다");
	//	else System.out.println("잘못된 url이다");
		
		//------------------------------------------------------------
	
	
	
	/* [1]
	public static void main(String[] args) {
		
		// 11.
		String str = "안녕하세요. admin입니다. 안녕 ~";
		// str 문자열 속에서 홍길동을 찾아서 김대원으로 변경
		
		// int index = str.indexOf("홍길동");
		// boolean str.contains("홍길동");
		
		// String result = str.replace('홍', '김');
		// String result = str.replace('안', 'X');
		// String result = str.replace("안녕", "XX");
		// String result = str.replaceAll("[가-힝]|\\.|\\s",""); // String regex 정규표현식
		String result = str.replaceFirst("안녕", "XX");
		System.out.println(result);

	}
    */
}
