package days08;

// import days07.Sample;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오전 9:33:49
 * @subject  개념 파악(이해) *****
 * @content 
 *         매개변수 + 메서드를 호출하는 방법
 *         1) Call By Name : 매개변수 X , 메서드를 호출하는 경우
 *                  drawLine();                  
 *         2) Call By Value :
 *         
 *         3) Call By Reference
 *            
 *              자료형
 *                기
 *                참 - 배열, 클래스, 인터페이스
 *         
 *         X 4) Call By Point
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// 다른 패키지(days07) 안의 Sample클래스의 drawLine() 호출 사용
		// Sample.drawLine(30);
		
		int x = 10, y = 20; // main 지역변수
		System.out.printf("1. main x=%d, y=%d\n", x, y);
		
		/*
		{
			int temp = x;
			x = y;
			y = temp;
		}
		*/
		swap(x, y); // 메서드 호출부
		
		System.out.printf("2. main x=%d, y=%d\n", x, y);
	}  // main
	
	// 메서드 선언부
	//                      int x=10
	public static void swap(int x, int y) { // swap  지역변수
		System.out.printf("1. swap x=%d, y=%d\n", x, y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("2. swap x=%d, y=%d\n", x, y);
	}

} // class
