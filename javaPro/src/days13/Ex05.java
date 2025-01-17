package days13;

import java.io.IOException;

/**
 * 
 * @author kenik
 * @date 2025. 1. 13. - 오후 12:46:00
 * @subject
 * @content
 */

public class Ex05 {

	public static void main(String[] args)  {

		// 
        // 도형
		// 원/삼각형/사각형
		
		Shape s = new Shape();
     // s. 9개의 메서드가 보이더라
	 // 모든 클래스의 최상위 부모클래스는 Object 클래스이다.	
		
		
		Point center = new Point(50,50);
		int radius = 10;
		Circle c = new Circle(center, radius);
		c.color = "red";
		c.draw(); // 오버라이딩(==재정의 함수)
		
		// 구분선
		System.out.println("=".repeat(30));
	
		Point [] p = {
				new Point(1,1),
				new Point(20,40),
				new Point(10,5)
		};
		Triangle t = new Triangle(p);
	//	Unhandled exception type IOException
		t.draw();
		

		/**
		 *  1. Shape.draw() 메서드의 접근 지정자 default -> public 수정
		 *  
		 *  2군데 에러 이유? 오버라이딩의 주의점
		 *  1) 오버라이딩을 할 때 메서드 명은 동일해야 한다.
		 *  2) 매개변수 타입 + 갯수 동일 해야한다
		 *  3) 리턴자료형도 동일해야 한다
		 *  4) 접근지정자는 부모 보다 같거나 큰 접근지정자를 사용할 수 없다
		 *  default -> default  < proteced < public
		 *  pulic -> public 
		 *  5) 예외는 부모의 예외보다 많을 수 없다.
		 *  6) 인스턴스 메소드를 <-> static 메소드로 변경 X
		 *  
		 */
	}

}

// 도형 클래스
class Shape{ // extends Object (상속이 없으면 기본적으로 얘가 상속되고 생략된다.
	// 필드
	
	String color = "black";
	
	// 생성자
	// 메서드
	void draw() throws IOException
	{
		System.out.printf("[color = %s]\n", color);
	}
}
// 상속 관계  == is - a 관계
//             ~~은 ~~이다.
//  

class Circle extends Shape{
	
	// 필드
	
	    Point center; // 원점 has - a 관계
		
		int r; // 반지름 radius
		
		// 생성자
		Circle(Point center, int r){
			this.center = center;
			this.r = r;
		}
		
		public Circle() {
			this(new Point(0,0),0);
		}

		@Override
		void draw()// throws IOException 
		{
		 System.out.printf("[color = %s, center=(%d, %d)]\n",color,this.center.x,this.center.y);
		//	System.out.printf("[color = %s, center= %s]\n",color,this.center.getXY());
//			super.draw();
		}
		
		// 메서드
		// Shape -> draw() 메서드를 재정의 함수 Override(오버라이딩)
}

// 삼각형 클래스
// 한 평면 상에 있고, 일직선 상에 없는 3개의 점 a, b, c를 2개씩 쌍으로 하여 선분을 연결하여 이루어지는 도형.

class Triangle extends Shape{
	// 필드
	// 꼭지점 3개
	Point [] p = new Point[3]; // 배열
	
	//생성자
	Triangle(Point [] p) {
		this.p = p;
	}

	@Override
	void draw() //throws IOException, ArrayIndexOutOfBoundsException 
	{
		
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s]\n",p[0].getXY(), p[1].getXY(),p[3].getXY());
		
	}
}

class Point{
	// 필드
	int x;
	int y;
	// 생성자
	public Point() {
	    this(0,0);
		// TODO Auto-generated constructor stub
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return String.format("(%d, %d)", x,y);
	}
}

/*
// 도형 - 원 상속 X
class Circle{
	
	// 필드
	int x;
	int y;
	
	int r; // 반지름 radius
	
	// 생성자
	Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public Circle() {
		this(0,0,0);
	}
}
*/