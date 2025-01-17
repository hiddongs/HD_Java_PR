package days14;
/**
 * 
 * @author kenik
 * @date 2025. 1. 14. - 오후 5:06:01
 * @subject [내부(inner) 클래스] == 중첩 클래스
 * @content  - AWT, Swing과 같은 GUI 어플리케이션에서 이벤트 처리할 때 자주 사용한다.
 */

public class Ex11 {

	public static void main(String[] args) {
		// 중첩(내부) 클래스
		// 예외처리
		// Object 메서드 설명
		// 문자열 다루는 클래스
		// 날짜, 시간 다루는 클래스 
		// 컬렉션 프레임 워크
		// 자바 IO

		/*
		 * [내부 클래스의 종류와 특징] - 선언 위치
		 * 1. 인스턴스(instance) 클래스 :     
		 * 2. 정적(static) 클래스      :    
		 * 3. 지역(local) 클래스       : 외부 메서드 안, 초기화 블럭 안
		 * 4. 익명(anonymous) 클래스   : 클래스명 X (일회용)
		 *                            클래스 선언 + 생성 (동시)
		 *
		 * 
		 * 
		 * 
		 */
		
	} 

}


class Outer{
	
	int iv = 0; // 인스턴스
	static int cv = 0; // 클래스 변수
	// 외부 클래스의 필드 선언 위치
	class InstanceClass{
	    
		// 주로 외부 클래스의 인스턴스 멤버들과 관련된 작업을 할 목적으로 선언된
		// 내부 클래스
	}
	
	static class StaticClass{
		// static 멤버처럼 다루어진다.
		// 주로 외부 클래스의 static 멤버들과 관련된 작업을 할 목적.ㅗ
	}
	
	
	{
		// 초기화 블럭
	}
	
	// 메서드
	private abstract void method1() {
		
		class LocalClass{ //로컬 클래스
			              // 메서드 안에 선언된 클래스
			              // 이 메서드 안에서만 쓸 수 있는 클래스
			
			
		}
	}
	
}

/*
class Car{
   
   public Engine engine;
   
}

class Engine{
   
}
*/
/*
class Car{   // 외부 클래스 
   
   // 멤버 선언
   public class Engine{  // 내부 클래스
      // 장점 : 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다. 
      //       코드의 복잡성을 줄일 수 있다 ( 캡슐화 )
   }
   
}
*/