package days16;

public class Ex02 {

	public static void main(String[] args) {
		
		
		// Object 메서드
		// 1. hashCode()
		// 2. getClass()
        // 3. toString() fullName@hashCode 16진수 값
		// 4. equals()
		
		/*
		int a = 10;
		int b = 20;
		System.out.println( a == b ); // 연산자
        */
		
		
		// 두 객체가 같냐?
		Value v1 = new Value(10);
	    Value v2 = new Value(10);
		// Value v2 = v1; // 클래스 복사 ( copy )
		
		// 0x100 == 0x200 
		// 0x100 == 0x100 -> 클래스 복사를 했을 경우
		// System.out.println(v1 == v2); // false
		
		// Object 클래스 equals(), == 동일한 기능을 하여, 동일한 결과 값이 나온다.
		System.out.println(v1.equals(v2)); // false
		
		
		// Object.equals() -> Value 클래스에서 오버라이딩
		// v1, v2 value 필드의 값이 같으면 같다라고 출력...
	
		// [문제] Point 클래스
		// x, y 필드 값이 같으면 equals() 같다.
		// equals() 메서드를 오버라이딩 하세요
		// 5. clone()
		//    ㄴ 복제 의미 ? 같은 값을 가지는 새로운 인스턴스 생성 ...
		Point p1 = new Point(10,20);
		// 복제
		/* [1]
		Point p2  = new Point();
		p2.x = p1.x;
		p2.y = p1.y;
	    */
		
		/* [2]
		Point p2 = new Point(p1.x, p1.y);
		*/
		
		// [ is not visible ]
		// Point p2 = p1.clone();
	
	    // java.lang.CloneNotSupportedException:
		// Object.clone() 메서드를 이용하여 객체를 복사할 때 Clonable 인터페이스를 상속하지 않은 클래스를 복제하려고 한다면 CloneNotSupportedException이 발생
		// 해결방법  implements Cloneable 붙히기
	   Point p2 = (Point) p1.clone();
	   
	   
	
	   System.out.println(p1); // Point [x=10, y=20]
	   System.out.println(p2);
		
		
	}

}

class Value{
	
	int value;
	
	public Value(int value) {
		this.value = value;
	}
	
	// 오버라이딩 조건 
	@Override 
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Value) {
			Value v = (Value)obj; // 다운캐스팅
            return this.value == v.value;
		
		}
		return false;
	}
}

class Point extends Object implements Cloneable {
	int x;
	int y;
	
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override 
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Point) {
			Point p = (Point)obj; 
            return this.x == p.x && this.y ==p.y;
		
		}
		return false;
	}
	// jdk1.5 부터 '공변 변환 타입' 추가
	// 오버라이딩 할 때 조상 메서드의 변환타입을 자식 클래스의 타입으로 변경
	// 이 가능하도록 추가
	// Point p2 = p1.clone();
	@Override
	protected Point clone()  {
		Object obj = null;
		try{
			// UpCasting
			obj = super.clone();
		} catch(CloneNotSupportedException e ) {
			e.printStackTrace();
		}
		return (Point) obj;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

