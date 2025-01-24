package days18;

import java.security.MessageDigest;
import java.text.MessageFormat;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 20. - 오후 2:11:08
 * @subject 4. MessageFormat 클래스
 * @content  ㄴ 어떤 값을 정해진 형식에 맞게 출력...
 *      
 *           Systen.out.printf("출력 형식", 값...);
 *           String 출력 형식 문자열 = String.format
 * 
 *          
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		boolean gender = false;
		
		// 출력형식 :        이름 : 홍길동, 나이 20살, 성별 여자

		// String str = String.format("이름:%s, 나이:%d살, 성별:%s",name,age,gender ? "남자" : "여자");
		
		
//		String Pattern = "이름 : {0}, 나이 {1}살, 성별 : {2}";
//		MessageFormat mf = new MessageFormat(Pattern);
	    String str = MessageFormat.format("이름:%s, 나이:%d살, 성별:%s",name,age,gender ? "남자" : "여자");
		System.out.println(str);
	} // main

} // class
