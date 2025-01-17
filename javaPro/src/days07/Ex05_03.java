package days07;

import java.util.Iterator;
import java.util.Random;

/**
 * 
 * @author kenik
 * @date 2025. 1. 3. - 오후 4:28:39
 * @subject 메소드(함수 처리)
 * @content 시험 칠 내용 꼭 복습하기 꼭 구조화 시켜서 하기
 */

public class Ex05_03 {

	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		// 1. 기능 - 로또 번호 출력 메소드
		// 2. 매개변수 출력할 배열 lotto
		// 3. 리턴값 - X, void
		
		fillLotto(lotto);
		dispLotto(lotto);

	} //main
	
	public static boolean isDuplcateLotto(int [] lotto, int n ,int index) {
		
		for(int i = 0; i < index; i++) {
			if(lotto[i] == n) 
				return true;
		}
		return false;
	}
	
	
	
	public static void fillLotto(int [] lotto) {
		
		int index = 0, n;
		Random rnd = new Random();
		boolean isDuplcated = false;
		
		while(index < 6) {
			
			n = rnd.nextInt(45) + 1;
			//중복이 되면 true로 반환
			if(!isDuplcateLotto(lotto, n, index)) {
				lotto[index++] = n;
				
			}
			
		} //while
	} //fillLotto

	public static void dispLotto(int [] lotto) {
		 for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]", lotto[i]);
			
		}
		System.out.println();
		
	}

} //class
