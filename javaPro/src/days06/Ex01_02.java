package days06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kenik
 * @date 2025. 1. 2. - 오전 10:44:23
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("이름, 국, 영, 수 입력 ? ");
      String data = br.readLine();
      // 각각 입력값 잘라내기
      
      String regex = "\\s*, \\s*";
      String [] dataArr = data.split(regex);
      
      String name = dataArr[0];
      
      int kor = Integer.parseInt(dataArr[1].trim()); // -> 문자열을 int 값으로 하는 방법 , trim()사용 방법
      int eng = Integer.parseInt(dataArr[2].trim());
      int math = Integer.parseInt(dataArr[3].trim());
     
      
      
      System.out.println(name);
      System.out.println(kor);
      System.out.println(eng);
      System.out.println(math);
      
      /*
       
       이름, 국, 영, 수 입력 ? 홍길동, 90, 38, 84 
Exception in thread "main" java.lang.NumberFormatException: For input string: " 90"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:638)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at javaPro/days06.Ex01_02.main(Ex01_02.java:27)
	
	
	--> 오류가 뜨는 이유 출력 숫자값에 공백이 있어서 그렇다 ex)_90
	---> 해결방법 trim() 사용 -> 앞뒤 공백 제거 함수 ****
       */
	}

}
