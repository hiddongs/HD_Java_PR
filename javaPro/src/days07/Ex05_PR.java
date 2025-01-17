package days07;

import java.util.Arrays;
import java.util.Random;

public class Ex05_PR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//로또게임 만들기
		//배열 6개방 선언
		//랜덤 값 집어넣기
		//중복 안되게
		//중복이면 다시 

		int [] lotto = new int[6];

		boolean isDup = false;
		Random rnd = new Random();
		int index = 0;
		int n = rnd.nextInt(45) + 1;
		lotto[index] = n;

		index++; // 1
		while(index < 6) {


			do {
				for (int i = 0; i < index; i ++) {

					isDup = false;
					n = rnd.nextInt(45) + 1;
					if(lotto[i] == n)
					{
						System.out.println("중복됨");
						isDup = true;
						break;
					}
					
					
				}



			}while(isDup);
			lotto[index] = n;
			System.out.print(Arrays.toString(lotto));
			index++;

		}




	}

}
