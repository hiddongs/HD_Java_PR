package days15;

import java.io.IOException;
import java.util.Scanner;



/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오후 12:35:27
 * @subject [예외처리 2번째 방법 : throws 문 설명]
 * @content [사용자 정의 예외 선언 + throw 문 강제로 예외 발생]...
 */
public class Ex06 {

	public static void main(String[] args) {
		
 
		// 국어 점수를 입력받아서 수 ~가 출력.
		int kor = 0;
		try {
			kor = getScore();
			System.out.println("국어 = " + kor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(" end ");
		
		
		
	} // main

	private static int getScore() throws IOException {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		System.out.printf("정수 입력");
		String input = sc.next();
		
		String regex = "100|[1-0]?||d";
		if(input.matches(regex)) {
			score = Integer.parseInt(input);
		}else {
			// 강제로 예외 발생시키도록 하겠다.
			throw new IOException("점수 범위  (0 ~ 100) !!!");            // -> 얘는 왜 오류가 뜨고
			// throw new ArithmeticException("점수 범위  (0 ~ 100) !!!"); // -> 왜 얘는 오류가 안 떴을까? 학인 해보기
		}
		
		return score;
	}

} // class 
