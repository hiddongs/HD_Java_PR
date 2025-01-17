package days16;

/**
 * 
 * @author kenik
 * @date 2025. 1. 16. - 오후 4:49:16
 * @subject
 * @content
 *          2) StringBuffer 클래스   - 멀티스레드 X
 *          3) StringBuilder 클래스  - 멀티스레드 O ( 동기화 처리 되어져 있다. )
 * 
 * 
 * 
 */
public class Ex05_02 {

	public static void main(String[] args) {
	
     // 불변		
	    String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";

		
		// "안녕" 문자열 뒤에 (hello) 문자열 삽입
		
		
		StringBuilder sb = new StringBuilder(data);
		// System.out.println(sb);
		
		int fromIndex = sb.indexOf("안녕", 9) + "안녕".length();

		int offset = sb.indexOf("안녕", fromIndex) + "안녕".length();
		sb.insert(offset, "(hello)");
		
		// 홍길동 삭제
		// sb.replace(start, end, "");
		int start = data.indexOf("홍길동");
		int end = start + "홍길동".length();
		sb.delete(start, end);
		
		
		// 추가
		sb.append("~~~");
		
		 System.out.println(sb);
	}

}
