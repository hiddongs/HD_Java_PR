package days13;

public class Ex03 {

	public static void main(String[] args) {
		
		/**
		 * [클래스들간의 2가지 관계]
		 * 
		 * 1) has - a 관계 (소속 관계)
		 *    자동차 클래스
		 *    ㄴ 엔진(1) 클래스
		 * 2) is - a 관계 (상속 관계)
 		 * 
		 * 
		 * 
		 * 
		 */
		
		
		// 외부에서 자동차 객체 생성할 떄 엔진 객체 주입 (inject)
		// 의존성(dependency) 관계가 있다.
		// 의존성 주입 ( DI )
		//  1) 생성자
		//  2) setter 통해서 주입

		
		
		// 엔진
		Engine a_engine = new Engine();
		Engine b_engine = new Engine();
		Engine c_engine = new Engine();
		
		// 1) 생성자 통해서 주입
//		Car myCar = new Car(c_engine);
		
		Car myCar = new Car();
		// 2) setter 통해서 의존성 주입
		myCar.setEngine(a_engine);
		
		myCar.getEngine().speed = 100;
		myCar.speedUp(10);
		
		int speed = myCar.getEngine().speed;
		System.out.println("현재 속도 : " + speed);
		// Exception in thread "main" java.lang.NullPointerException
		System.out.println("end");

	}

}
