package days11;

public class Ex09 {

	// 멤버변수 == 필드 (field)
	// [접] [기] 자료형 필드명 [=초기값];
	
	// 1) 인스턴스 변수
	public String name = null;
	public int age = 0;
	
	// 2) static 붙어 있는 필드를 클래스 변수
	public static double PI = 3.14;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		 * [자바 변수의 종류] - 선언되는 위치를 기준으로 변수 구분
		 *   1) 지역 변수
		 *       ㄴ 해당 영역(지역)에서만 사용되는 변수
		 *       ㄴ 매개변수 지역변수 String [] args
 		 *   2) 인스턴스 변수
 		 *       ㄴ 초기화 하지 않아도 그 자료형의 기본 값으로 초기화 되어져 있다.
 		 *  
		 *   3) 클래스 변수
		 *       ㄴ 반드시 초기화 한번 해줘야 한다
		 * 
		 * 
		 * 
		 */
		
		// java Ex09 aaa bbb ccc ddd 엔터 -> 메인함수에서 매개변수 받는 법
		for (int i = 0; i < args.length; i++) {
	         System.out.printf("args[%d] : %s\n", i, args[i]);
	      }
	      System.out.println("----");
		
	      /*
		int age = 20;
		
		//int i = 0; //지역변수
		for(int i = 0; i < args.length; i++) {
			
			
			// int i = 0 //for문 안에 있는 지역변수 i
			*/
		}
	}


