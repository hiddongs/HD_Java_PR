package days05;

import java.util.Scanner;
/**
 * 
 * @author kenik
 * @date 2024. 12. 30. - 오후 3:49:26
 * @subject
 * @content 혼자 집에가서 해봐야할듯
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //256가지
	//[문제]
	//한 라인에 열개에 해당되는 아스키 코드 출력
		
	//	Scanner scanner = new Scanner(System.in);
/*
		//아래 코드는 scanner 예제
		String input = "1 fish 2 fish red fish blue fish";
						
		// '\s' == space(공백)
		// * == 반복횟수 0~여러번 - 띄어쓰기가 몇번이어도 상관안한다.
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); // (input) - 읽어올 대상
		
		*/
		
		//Fisrt
		/*
		for (int i = 0; i < 256; i++) {
			
			//if (i % 0 == 0) System.out.println(); --> 오답
	    	
	    	
	    	if (i % 10 == 0) {
	          	System.out.printf("%d : ", i / 10 + 1);
	    	}
	    	
	    	System.out.printf("[%c]", (char)i);
	    	
	    	
	    	if (i % 10 == 9) {
	    		System.out.println(); //결과를 미리 적어두고 규칙 찾고 코딩
	    	}
	    	//라인 번호를 달고 싶다 앞에다가
		}*/
		//Second
       for (int i = 0, lineNum = 1; i < 256; i++) {
			
			//if (i % 0 == 0) System.out.println(); --> 오답
	    	
	    	
	    	if (i % 10 == 0) {
	          	System.out.printf("%d : ", lineNum++);
	    	}
	    	
	    	System.out.printf("[%c]", (char)i);
	    	
	    	
	    	if (i % 10 == 9) {
	    		System.out.println(); //결과를 미리 적어두고 규칙 찾고 코딩
	    	}
	    	//라인 번호를 달고 싶다 앞에다가
		}
		
	}
}
		
	


