package days15;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오전 11:32:21
 * @subject try~ catch 문
 * @content
 */

public class Ex03_02 {

	public static void main(String[] args) {

		int number = 100;
		int result  = 0;
		Random rnd = new Random();
		int [] m  = new int[5];
		
		// java.lang.ArithmeticException: / by zero

		int n = -1;
		// 다중 catch 블럭
		for (int i = 0; i <10; i++) {

			try{
				n = rnd.nextInt(5); 
				result = number / n;
				System.out.println(result);
				// java.lang.ArrayIndexOutOfBoundsException:
				/* [1] 중첩으로 try catch
				try {
					m[i]  = result;
				}catch()
				{ // 예외 처리 ㅡ m 배열크기 + 5 증가 ...
					m = Arrays.copyOf(m, m.length+5);
					m[5] = result;

				}
				*/ 
				m[i]  = result;
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				// 예외 처리

				// System.out.println(0);
				/*
				e.printStackTrace(); // 에외 추적 코드
				System.out.println(e.toString());
                System.out.println(e.getMessage()); // 에러 메시지
                */
			} 
			catch(Exception e){
				
				// 다중 catch 문을 사용할 때의 주의할 점
				//  ㄴ 부모 exception catch 문을 밑에 코딩한다
				
			} // try

			/*

		try {

		// 1
		// 2
		// 3      예상치 못한 예외 발생...
		// 4
		// 5
		:
		// 100

		} catch (Exception e) { // 모든 예외가 발생하면 처리...
			// 예외 처리... 코딩 ~~
		}

			 */
		} // for

	} // main
} // class
