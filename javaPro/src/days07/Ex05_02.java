package days07;

import java.util.Arrays;
import java.util.Random;

public class Ex05_02 {

	public static void main(String[] args) {

		int [] lotto = new int[6];
		Random rnd = new Random();
		boolean isDuplicated = false; //true면 중복


		// 1. 배열 크기 가져오기 
		// System.out.println(lotto.length); 
		// 2. 가장 큰 첨자값(윗 첨자값 upperbound) 윗 첨자값 = lotto.length = 1                
		// 3.배열은 초기화 하지 않아도 자료형의 기본값으로 초기화 되어져 있어야 한다.

		System.out.println(Arrays.toString(lotto));

		int index = 0;
		int n = rnd.nextInt(45) + 1;
		lotto[index] = n;
		System.out.println(Arrays.toString(lotto));

		index++; // 1

		while(index < 6) {
			do {
				isDuplicated = false;
				n = rnd.nextInt(45) + 1;
				System.out.println(n); //반복마다 어떤 수가 들어가는 지 확인
				for(int i = 0; i < index; i++) {

					if(lotto[i] == n) {

						System.out.println("중복됨.");
						isDuplicated = true;
						break;
					} //if
				} //for
			}while(isDuplicated);

			lotto[index] = n;
			System.out.println(Arrays.toString(lotto));
			index++;
	
		} //while
		




	}

}
