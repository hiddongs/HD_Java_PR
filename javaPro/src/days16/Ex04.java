package days16;
/**
 * 
 * @author kenik
 * @date 2025. 1. 16. - 오전 11:28:18
 * @subject 문자열을 다루는 클래스
 * @content  *** 1) String 클래스
 * 
 * 
 *          2) StringBuffer 클래스
 *          3) StringBuilder 클래스
 *          
 *          
 *          4) StringTokenizer 클래스
 * 
 *          java.util 패키지 안의 클래스 정리...
 *          날짜/시간 다루는 클래스
 *          컬렉션 프레임워크 ( JCF )
 *          :
 */

public class Ex04 {

	public static void main(String[] args) {
		
		// [String 클래스]
		// 다른 언어에서는 문자열 : 문자의 나열 char[]
		// 자바 : String 클래스 사용.
		// (암기) " 변경 불가능한(immutable) 클래스 "
        // String name = new String(); 
		 String name = "양희동";
		 // -> 문자열 값이 name에 들어간 것이 아니다 문자열은 주소고 주소를 넘겨준 것이다. 메모리에 올라가서 
		 String name2 = "양희동";
		 System.out.println(name == name2);
		 
		 name  = "양호동"; // 값이 바뀌는게 아니라 새로운 인스턴스가 만들어지는 것.
		 // 다른 객체일지라도 같은 주소값이기 때문에 true
		 
        System.out.println(name.toString());
        System.out.println(name);
		
		
		
	} // main

} // class
