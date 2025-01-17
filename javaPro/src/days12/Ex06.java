package days12;


/**
 * 
 * @author kenik
 * @date 2025. 1. 10. - 오후 12:46:51
 * @subject  [ this.키워드 ]
 * @content
 */


public class Ex06 {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 *  [ this ] 키워드 설명
		 * 
		 *  1. 정의 
		 *      ㄴ 인스턴스가 생성되면 자기 자신의 주소를 갖는 참조변수
		 *      ㄴ 즉, 인스턴스마다 독립적으로 사용이 가능하다
		 *  
		 *  2. 3가지 용도 
		 *     1) 멤버를 가리킬 때의 this 용도
		 *        멤버 == 클래스(객체)의 구성요소     
		 *        멤버변수(필드)
		 *        멤버함수(메소드)
		 *     
		 *     2) 생성자에서 또 다른 생성자를 호출 할 때의 this
		 *        생성자 호출 시기 : 객체 생성될 때 ... + 자동
		 *             역할 : 필드 초기화
		 *        왜 > A 생성자 -> B 생성자
		 *        
		 *     3) 단독(홀로)으로 사용될 때의 this
		 *          ㄴ 매개변수
		 *          ㄴ 리턴값
		 *        
		 *        
		 * 
		 */
		
		//MyPoint p1 = new MyPoint(10,20);

		/*
		Person p1 = new Person();
		p1.setName("홍길동");
		System.out.println(p1.getName());
		*/
		
		MyPoint p2 = new MyPoint(100);
		
		// 메소드 체인
		p2.offsetPoint(5).dispMyPoint();
		
		p2.offsetPoint(new MyPoint(1,1));
		p2.dispMyPoint();
		
		
		/*
		  p2
		  .offestPoint(new MyPoint(1,1))
		  .dispMyPoint();		
		*/
;	} // main

} // class
