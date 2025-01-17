package days12;

public class MyPoint {

	// field

	public int x;
	public int y;


	public MyPoint() {
		System.out.println("MyPoint default constructor");
	}

	public MyPoint(int i, int j) {
		this.x = i;
		this.y = j;
		System.out.println(" MyPoint 2 constructor");
	}

	public MyPoint(int i) {
		this(i,i); //생성자 안에서 또 다른 생성자를 호출하도록 하는 용도
		System.out.println(" MyPoint 1 constructor");
	}

	// method
	// ( 기억 ) p1.dispMyPoint();            p1.x  p1.y
	// ( 기억 ) p2.dispMyPoint();            p2.x  p2.y
	public void dispMyPoint() {
		System.out.printf(" > x = %d, y = %d\n", this.x, this.y);

	}

	// 현재 좌표에서 내가 준 이동거리 만큼 이동

	/*
	public void offestPoint(int d) {

		x += d;
		y += d;
	}

    */
	
	//리턴 값이 참조타입  // this가 붙으면  this가 의미하는건 호출한 객체
	public MyPoint offsetPoint(int d) {

		x += d;
		y += d;
		
		return this;
	}

	// 현재 좌표를 이동 + 매개변수로 받는 p 객체의 x, y

	public void offsetPoint(MyPoint p) { // 참조형 매개변수

		x += p.x;
		y += p.y;
	} // main



	// 기본형 반환타입
	public int plusPointX() {

		return x + 1000;

	}

	public MyPoint createMyPoint(MyPoint p) {


		MyPoint newP = new MyPoint();
		newP.x = p.x;
		newP.y = p.y;

		return newP;

	}
	
	public void test() {
		
		offsetPoint(this); //매개변수로 쓰일 때의 this
	}



} // class
