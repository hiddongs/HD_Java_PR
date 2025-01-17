package days15;

/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오후 4:33:31
 * @subject java.lang.Object 클래스
 * @content    ㄴ 멤버 (필드, 메서드) 살펴보자.
 *             ㄴ 
 */

public class Ex09 {

	public static void main(String[] args) {
		
		
		// 1. Object.hashCode() - 객체 자신의 해시코드(고유 코드)를 반환하는 메서드 
		/*Value v1 = new Value(10);
		int hashCode = v1.hashCode();
		System.out.println(hashCode); // 985922955
		&/

		/*
		Value v2 = new Value(10);
		hashCode = v2.hashCode();
		System.out.println(hashCode); // 1435804085

		*/
		
		/*
		// 2. Object.getClass() - 객체의 클래스 정보를 담고 있는 [C]lass 인스턴스를 반환하는 메서드

	    //	<? extends Value> 제네릭(Generic)
		// Class<? extends Value> cls = v1.getClass();
		Class cls = v1.getClass();
		//                풀네임(fullName) = 패키지명.클래스명 getName();
		String name = cls.getName();
		System.out.println(name); // days15.Value
		*/
		
		
		// 3. Object.toString() - 객체 자신의 정보를 문자열로 반환하는 메서드
		Value v1 = new Value(10);
		//    days15.Value@3ac3fd8b
		// fullName@hashCode의 16진수
		System.out.println(v1.toString()); 
		System.out.println(v1); 
		
	} // main

} // class

class Value{
	
	int value;
	
	public Value(int value) {
		this.value = value;
	}
}

class Point extends Object {
	int x;
	int y;
	
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}