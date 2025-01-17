package days14;

public class Ex08 {

	public static void main(String[] args) {
		
		// 인터페이스 활용 예제 설명
		// days13.Car.java
		// days13.Engine.java 복사 붙이기 days14
		
		Car myCar = new Car(new H_Engine());
		myCar.setEngine(new K_Engine());
		myCar.speedUp(10); // * 0.07
		
		// 5년 뒤에 X_Engine * 0.15
		
		myCar.setEngine(new X_Engine());

		
	}

}
