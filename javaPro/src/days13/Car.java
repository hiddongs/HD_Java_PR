package days13;

public class Car {

	// 필드
	
	String name;
	String gearType;
	int door;
	
	
	// 필드
	// has - a 관게
	
	// 결합력이 높은 코딩은 좋지 않다
	// private Engine engine = new Engine(); //\ 선언을 해놓고 초기화를 안 시켜서 일어났다 (null) 명시적 초기화 사용

	private Engine engine = null;

	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	// 디폴트 생성자
	
	Car(){
		this.engine = new Engine();
	}
	
	public Car(Engine engine) {
		this.engine = engine;
	}


	void speedUp(int fuel) {
		
        this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		
		this.engine.lessFuel(fuel);
		
	}
	
	void Stop() {
		
		this.engine.Stop();
	}
}
