package days12;

import java.util.Arrays;

/**
 * 
 * @author kenik
 * @date 2025. 1. 10. - 오후 4:33:09
 * @subject [가변인자 (variable arguments)]
 * @content jdk1.5 메서드의 매개변수의 갯수가 고정 -> 동적 지정할 수 있다.
 */
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Ex12.sum(1,2));
		
		int [] m = {1,2,3,4,5,6,11,33,3};
		System.out.println(Ex12.sum(m));
	}
	
	// sum() 가변인자 사용한 것
	public static int sum(int...args) {
		/*
		int result = 0;
		for (int i = 0; i < args.length; i++) {
			
			result += args[i];
		}
		return result;
		*/
		
		// JDK 1.5 제네릭
		// JDK 1.8 람다와 스트림
		
		return Arrays.stream(args).sum(); //위에 코드랑 같은 코드임
	}
	
}
