package days12;


/**
 * 
 * @author kenik
 * @date 2025. 1. 10. - 오전 10:14:08
 * @subject 
 * @content
 *      
 *      // 1. 기본형 매개변수와 참조형 매개변수
 *      // 2, 기본형 반환타입과 참조형 반환타입
 *      
 *      MyPoint 클래스 : 좌표를 관리하기 위한 기능, 특성을 가진 클래스
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		
		MyPoint p1 = new MyPoint();
		// p1.dispMyPoint();
		
		
		MyPoint p2 = new MyPoint();
		p2.x = 10;
		p2.y = 20;
		p2.dispMyPoint();
		
		p1.offsetPoint(100); // 기본형 매개변수 예제
		p1.dispMyPoint();
		
		p1.offsetPoint(p2);
		p2.dispMyPoint();
		p1.dispMyPoint();
		
		int x = p2.plusPointX();
		System.out.println(x);
		
		MyPoint p3 = p1.createMyPoint(p2);
	
		p3.dispMyPoint();
		
	} // main

} // class
