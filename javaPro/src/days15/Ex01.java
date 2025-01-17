package days15;


/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오전 9:23:29
 * @subject 내부 클래스
 * @content
 */
public class Ex01 {

		// 1. 인스턴스 클래스
		class InstanceInner{
			
			int iv = 100; // 인스턴스 변수
			// static int cv = 100; // static(클래스) 변수 선언 [오류 X]
			final static int CONST = 100; // 그렇지만 상수는 [가능]
			
		}
		
		// 2. static 클래스
		static class StaticInner{
			
			int iv = 100; // 인스턴스 변수
			static int cv = 200; // 클래스 변수는 static 클래스 안에서만 선언 가능
			final static int CONST = 100; // 그렇지만 상수는 [가능]
		}
		
		void method1() {
			
			// 3. 로컬(Local) 클래스
			class LocalInner{
				
				int iv = 100; // 인스턴스 변수
				// static int cv = 200; // 동일한 오류
				final static int CONST = 100; // 그렇지만 상수는 [가능]
			}
		}
		
		public static void main(String [] args) {
			
			System.out.println(InstanceInner.CONST);
			System.out.println(StaticInner.CONST);
			System.out.println(StaticInner.cv);
		}
}


