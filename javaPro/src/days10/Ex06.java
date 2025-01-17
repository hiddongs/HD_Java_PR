package days10;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author kenik
 * @date 2025. 1. 8. - 오후 5:16:48
 * @subject  days07.Ex05_03.java
 * @content
 * 
 * 
 *     > 게임 횟수 입력 ? 3
 *     [1 게임] [42][36]....
 *     [2 게임]
 *     [3 게임]...
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		// 로또 게임

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print(" > 게임 횟수 입력 ? ");
		
		int gameNumber = sc.nextInt();
		int [][] lottos = new int[gameNumber][6];
	
		
		runLottoGame(lottos, gameNumber);
		
		dispLotto(lottos);

	} //main
	
	private static void runLottoGame(int[][] lottos, int gameNumber) {
		
		
		for (int i = 0; i < gameNumber; i++) {
	        fillLotto(lottos[i]); // 각 게임 배열에 번호 생성
	    }
		/*
		 * while( i <= gameNumber) {
		 * 
		 * fillLotto(lottos[i]); i++;
		 * 
		 * }
		 */
		
		
		
	}

	private static boolean isDuplcateLotto(int [] lottos, int n ,int index) {
		
		for(int i = 0; i < index; i++) {

			if(lottos[i] == n) 
				return true;
		}
		return false;
	}
	
	
	
	
	private static void fillLotto(int [] lottos) {
		
		int index = 0, n;
		Random rnd = new Random();
		boolean isDuplcated = false;
		
		while(index < 6) {
			
			n = rnd.nextInt(45) + 1;
			//중복이 되면 true로 반환
			if(!isDuplcateLotto(lottos, n, index)) {
				lottos[index++] = n;
				
			}
			
		} //while
	} //fillLotto

	private static void dispLotto(int [][] lottos) {
		 for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%02d]", lottos[i][5]);
			
		}
		System.out.println();
		
		
	}

}
