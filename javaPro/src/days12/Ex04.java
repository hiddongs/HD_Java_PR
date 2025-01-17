package days12;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author kenik
 * @date 2025. 1. 10. - 오전 10:49:28
 * @subject
 * @content
 */


public class Ex04 {

	public static void main(String[] args) {
		
		// [생성자(Constructor)]
		/* 1. 일종의 메소드이다.
		 * 2. 리턴자료형 X    void 조차도 안 쓴다
		 * 3. 반드시 클래스명 == 생성자명 동일
		 * 4. 매개변수 없는 생성자-> 디폴트 생성자 
		 * 5. 생성자 메소드 호출 시기 : 인스턴스(객체) 생성할 때 자동, 인위적 생성자 호출  X
		 * 
		 * 6. 역할 : 필드 초기화 
		 * 7. 접근 지정자 modifier 사용 가능
		 * 8. 오버로딩(overloading) 가능
		 *    매개변수가 다른 함수
		 * 9. 생성자는 상속 불가능 (암기)
		 * 10. 클래스에 선언된 생성자가 하나도 없는 경우에는
		 *    컴파일러가 자동으로 디폴트 생성자를 추가한다
		 * 
		 * 
		 * 
		 */
		
		
		// 5. 메소드 호출 시기 = 생성자 호출 확인.
		new MyPoint();
		
		MyPoint p1 = new MyPoint();
		
		// 객체 생성 + 동시에 x = 10, y = 20 필드 초기화
		//The constructor MyPoint(int, int) is undefined
		MyPoint p2 = new MyPoint(10,20);
		p2.dispMyPoint();
		
		MyPoint p3 = new MyPoint(100);
		p3.dispMyPoint();
		
		System.out.println("END");
		
		Scanner sc = new Scanner(System.in);
		//MyPoint p1 = new MyPoint(); // 객체 생성 할때 디폴트 생성자를 호출하기 때문에 괄호를 넣는 것
		
		
		Random rnd = new Random();
		
		//Date 클래스 구조로 인해 년도는 1900을 빼주고 월은 1 빼줘야 한다
		Date d = new Date(2000-1900, 12-1, 27);
		System.out.println(d.toLocaleString());
	} // main

} // class
