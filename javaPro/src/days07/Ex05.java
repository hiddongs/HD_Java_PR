package days07;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		// [로또 게임]
        //Math.random() 1 ~ 45 정수 (로또번호)
		
		//java.util.Random 클래스
		// 프로젝트 할 때 중요한 것 -> 요구사항 제대로 분석할 것. 요구사항이 틀리면 다 갈아야 한다.
		
		Random rnd = new Random();
		// 1 <= int rnd.nextInt(45) + 1 <= 45
		// -21억 ~ rnd.nextInt() 21억;
		// rnd.nextInt(45) + 1;
		
		
		for(int i = 1; i <= 6; i++) {
			int lotto = rnd.nextInt(45) + 1;
			System.out.println(lotto); 
			//로또 번호는 중복이 있으면 안된다.
		}
		
	}

}
