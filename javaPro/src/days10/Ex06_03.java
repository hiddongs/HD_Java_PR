package days10;

import java.util.Scanner;
import days07.*;


//컨트롤 키 누르고 함수 누르기 아니면 f3누르면 그 함수에 이동가능
public class Ex06_03 {

	public static void main(String[] args) {
		   // 로또게임
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("> 게임 횟수 입력 ? ");
		   int gameNumber = scanner.nextInt();
		      
		   // int [] lotto = new int[gameNumber*6];
		   int [][] lottos = new int[gameNumber][6];
		      
		   fillLottos(lottos);
		   dispLottos(lottos);
		   for (int i = 0; i < gameNumber; i++) {
		      System.out.printf("[%d 게임] ",i+1);
		      days07.Ex05_03.dispLotto(lottos[i]);
		   }

		}

	private static void fillLottos(int[][] lottos) {
		
		for (int i = 0; i < lottos.length; i++) {
		      
		      days07.Ex05_03.fillLotto(lottos[i]);
		   }
	}
	private static void dispLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		for (int i = 0; i < lottos.length; i++) {
		      System.out.printf("[%d 게임] ",i+1);
		      days07.Ex05_03.dispLotto(lottos[i]);
		   }
	}

}
