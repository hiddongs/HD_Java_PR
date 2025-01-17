package days08;

public class Ex05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //[정보처리기사 실기] (내일 시험)
		
		int money = 125760;
		int unit = 50000;
		boolean sw = false;
	      
		int count = 0; //수량(갯수)
		
		while(unit >= 1) {
			count = money / unit;
			System.out.printf("%d원 : %d 개 \n", unit, count);
			money %= unit; //나머지 값이 새로운 money 변수 저장
			unit /= ( !sw ? 5 : 2); 
			sw = !sw;
		}
		
		
		
		
		
		/*
		share = money/50000;
		System.out.printf("5만원 : %d 개\n", share);
		rest = money%50000;
		
		money = rest;
		share = money/10000;
		System.out.printf("1만원 : %d 개 \n", share);
		rest = money%10000;
		
		money = rest;
		share = money/5000;
		System.out.printf("5천원 : %d 개 \n", share);
		rest = money%5000;
		
		money = rest;
		share = money/1000;
		System.out.printf("1천원 : %d 개 \n", share);
		rest = money%1000;
		
		money = rest;
		share = money/500;
		System.out.printf("500원 : %d 개 \n", share);
		rest = money%500;
		
		money = rest;
		share = money/100;
		System.out.printf("100원 : %d 개 \n", share);
		rest = money%100;
		
		money = rest;
		share = money/50;
		System.out.printf("50원 : %d 개 \n", share);
		rest = money%50;
		
		money = rest;
		share = money/10;
		System.out.printf("10원 : %d 개 \n", share);
		rest = money%10;
		
		money = rest;
		share = money/5;
		System.out.printf("5원 : %d 개 \n", share);
		rest = money%5;
		
		money = rest;
		share = money/1;
		System.out.printf("1원 : %d 개 \n", share);
		rest = money%1;*/
	}

}
