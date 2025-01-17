package days16;

import java.util.Arrays;

/**
 * 
 * @author kenik
 * @date 2025. 1. 16. - 오전 11:48:44
 * @subject String 클래스 메서드
 * @content 
 * 
 * 
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		String str = "public static void main(String[] args) {";
		// 1. 문자열 길이
		int len = str.length();
		System.out.println(len); // 40
		// 2. 문자열 속에서 특정 위치의 한 문자를 반환하는 메서드 charAt(index)
	    System.out.println(str.charAt(0));
	    // 가장 마지막 한 문자.
	    
	    /*
	    str = reverse(str);
	    System.out.println(str.charAt(0));
	    */
	    System.out.println(str.charAt(len-1));
	    
	    /*
	    // 3. 대문자로 변환하는 메서드
	    str = str.toUpperCase();
	    System.out.println(str);
	    */
	    
	    /*
	    // 4. 소문자로 변환하는 메서드
	    str = str.toLowerCase();
	    System.out.println(str);
	    
	    */
	    
	    // 5. true/false str.matches(String regex)
	    
	    // 6. String  -> char[] 변환해서 사용할 일이 많이 있다.
	    char [] strArr = str.toCharArray();
	    System.out.println(Arrays.toString(strArr));
	    
	    
	    // 7. str.trim() 앞뒤 공백을 제거하는 메서드 ltrim() rtrim() 왼쪽 오른쪽
	 
	    // 8. str 문자열 속에 main 문자를 찾아서 MAIN으로 변경.
	    
	    // 9. concat() 두 문자열을 연결해서 연결된 문자열을 반환하는 메서드
	    // String result = "aaa".concat("bbb").concat("ccc");
	    String result = "aaa" +"bbb" + "ccc";
	    System.err.println(result);
	    
	    // 10. 두 문자열 비교 equals()
	    
	    String a = "abc";
	    String b = "aBc";
	     System.out.println(a.equals(b));
	     // 대소문자 구분하지 않고 같다, 다르다
	    
	    System.out.println(a.equalsIgnoreCase(b));
	    // 대소문자 상관없는 main
	    String searchWord = "MaiN";
	   
	  
	    int index = str.toUpperCase().indexOf(searchWord.toUpperCase());
	   
	    System.out.println(str.substring(0, index) + searchWord.toUpperCase() + str.substring(index + searchWord.length())); // 0 <=   < index
	   
	    /*
	    System.out.println(str.contains("main")); // true
	    
	    
	    System.out.println(str.contains("kenik")); // false
	    
	    // 있는 위치 : int indexOf, lastIndexOf()
	    
	    System.out.println(str.indexOf("main")); // 19
	    System.out.println(str.indexOf("kenik")); // 문자열이 없으면 -1을 돌린다
	    
	    //Indexof랑 lastIndexof는 앞에서 찾냐 뒤에서 찾냐의 차이인데 중복되는 것이 있으면 먼저 찾는 쪽을 출력한다
	    System.out.println(str.lastIndexOf("main")); // 19 
	    System.out.println(str.lastIndexOf("kenik")); // 문자열이 없으면 -1을 돌린다
	    */
	} // main

	private static String reverse(String str) {
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			str.charAt(i);
			result = str.charAt(i) + result;
			
		}
		System.out.println(result);
		return result;
	}

} // class
   