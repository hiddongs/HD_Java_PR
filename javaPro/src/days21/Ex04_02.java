package days21;

import java.util.Arrays;

public class Ex04_02 {

	
	// 열거형 선언
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 열거형 선언 형식
		// [접] Enum 열거형 이름 { 상수명 ... }
		// 클래스의 일종 - java.lang.Enum 부모클래스
		
		// 2. 열거형 사용 방법
		// 열거형 이름.상수명

		System.out.println(Card.CLOVER); // CLOVER
		System.out.println(Card.HEART);  // HEART
		System.out.println(Card.HEART.name()); // HEART
		System.out.println(Card.HEART.ordinal()); // 1
		
		
		Card cardType = Card.valueOf("HEART");
		
		System.out.println(cardType);
		
		
		Card[] cardArr = Card.values();
		System.out.println(Arrays.toString(cardArr));
		
		
		System.out.println(" END ");
	}

}

// 열거형 == 클래스라 따로 파일 만들어도 되고 내부 클래스로도 가능
