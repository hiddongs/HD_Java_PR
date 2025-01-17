package days15;

import java.io.IOException;
import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {
		
		 
		
		int kor = 0;
		try {
			kor = getScore();
			System.out.println("국어 = " + kor);
			// 다중 catch나 멀티 catch 중 선택
		} catch (IOException | ScoreOutOfBoundExceiotion e) {
		
			System.out.println(e.getMessage());
			
		}
		
		
		System.out.println(" end ");
		
		
		
	} // main

	private static int getScore() throws IOException, ScoreOutOfBoundExceiotion {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		System.out.printf("정수 입력");
		String input = sc.next();
		
		String regex = "100|[1-0]?||d";
		if(input.matches(regex)) {
			score = Integer.parseInt(input);
		}else {
			// InputOutput
			// 입력/출력 예외 발생
			throw new ScoreOutOfBoundExceiotion("점수 범위  (0 ~ 100) !!!");      
		}
		
		return score;
	}
	
	
} // class 

// [ 사용자 정의 예외 클래스 선언 ] - 잠수 0 ~ 100점 범위 ... 발생시킬 예외 클래스

class ScoreOutOfBoundExceiotion extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7819348008203934016L;
	
	// 예외 코드 번호
	private final int ERROR_CODE;
	
	// 디폴트 생성자
	public ScoreOutOfBoundExceiotion(String message) {
		
		super(message);
		this.ERROR_CODE = 1004;
	}

	
    // 생성자
	public ScoreOutOfBoundExceiotion(int eRROR_CODE, String message) {
		super();
		ERROR_CODE = eRROR_CODE;
	}
	// setter X
		public int getERROR_CODE() {
			return ERROR_CODE;
		}

	
	
}