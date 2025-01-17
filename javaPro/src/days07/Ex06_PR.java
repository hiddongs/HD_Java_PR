package days07;

import java.util.Random;
import java.util.Scanner;

public class Ex06_PR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. 국어 점수를 입력받아서 반환하는 메서드를 선언하세요. 
		   ( 조건 : 정규표현식을 사용해서 유효성 검사하고 유효하지 않은 국어 점수 일 때는
		    반복해서 다시 입력받도록 처리하세요. )
		    
		2. 년도를 매개변수로 받아서 윤년, 평년을 boolean 형으로 반환하는 메서드를 선언하세요.

		

		4. 로또 중복체크는 하는 isDuplicateLotto 함수를 선언하세요. ( 조건 잘 보세요 )
		     ( 조건 : 중복되면 false를 반환,  중복되지 않으면 true 반환) 
*/
	
		int [] lotto = new int[6];
		Random rnd = new Random();
		int index = 0;
		int n = rnd.nextInt(45) + 1;
		
		n = lotto[index];
		
		boolean isDup = false;
		//isDuplicateLotto();
		
	}

	//private static boolean isDuplicateLotto(int index) {
		/*
		while(index < 6) {
			do {
				
				for (int i = 0; i < index; i++) {
					System.out.println("중복됨");
				    //isDup = true;
				    break;
				}
			}
			while(isDup);{
			
			    i
				
			}
			index++;
			
		
		
		return false;
		// TODO Auto-generated method stub
		
	}*/


}
