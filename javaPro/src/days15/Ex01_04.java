package days15;


/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오전 10:07:26
 * @subject 외부클래스가 아닌 완전 다른 클래스에서 
 * @content 내부클래스의 멤버를 접근하는 방법
 */
public class Ex01_04 {

	public static void main(String[] args) {
		
		Outer outer = new Outer(); // 외부 클래스 객체 생성
		Outer.InstanceInner icobj = outer.new InstanceInner();		
		System.out.println( icobj.iv ); // A
		
		// Outer.x
		System.out.println( Outer.StaticInner.cv);
		// ㄴ static 내부클래스(StaticInner)의 인스턴스 변수 접근하는 방법.
		Outer.StaticInner siObj = new Outer.StaticInner();
		System.out.println( siObj.iv );
	} // main

} // class

class Outer { // 외부 클래스

	static int x = 100;
	
	class InstanceInner{
		
		int iv = 200;
		
		
	}

	static class StaticInner{
		
		int iv = 200;
		static int cv = 400;
	}

	void method1() {
		
		class LocalInner{
			int iv = 400;
		}

	}
}
