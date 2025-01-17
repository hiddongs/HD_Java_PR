package days07;

import java.util.Random;

/**
 * 
 * @author kenik
 * @date 2025. 1. 3. - 오후 5:02:45
 * @subject
 * @content
 */

public class Ex06 {

	public static void main(String[] args) {
		
		String card = "1212-3434-5656-7878";
		
		Random rnd = new Random();
		int index = rnd.nextInt(4); // 0 <= Int < 4		
		
		System.out.println(index);
		
		String [] cardArr = card.split("-");
		
		cardArr[index] = "****";
		for (int i = 0; i < cardArr.length; i++) {
			System.out.printf("cardArr[%d]=%s\n", i, cardArr[i]);
		}
		
		// 1. String.format() -> 내가 원하는 문자열 형식으로 만들 때 사용
		// card = String.format("%s-%s-%s-%s", cardArr[0], cardArr[1], cardArr[2], cardArr[3]); 
	    // 2. String.join()
		card = String.join("-", cardArr);
		System.out.println(card);
		//결제할 때 마다 랜덤하게 특정 위치 4자리 숫자가 ****로 출력(표시)
		/*
		 * System.out.println("****-3434-5656-7878");
		 * System.out.println("1212-****-5656-7878");
		 * System.out.println("1212-3434-****-7878");
		 * System.out.println("1212-3434-5656-****");
		 * 
		 */
		
	} //main

} //class
