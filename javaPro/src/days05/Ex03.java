package days05;
/**
 * 
 * @author kenik
 * @date 2024. 12. 30. - 오후 3:15:02
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제어문 - 반복문 ASCII C 출력
		// 256가지 문자 출력
		// 'A' 65
		// 'a' 97
		// '0' 48
		// 0 ~ 31 제어문자
		// 32 ~ 127 일반문자 (대소문자, 숫자 등등)
		// 128 ~ 
		for (int i = 0; i < 256; i++) {
	    	System.out.printf("[%d('%c')]\n", i, (char)i);
	    }

	}

}
