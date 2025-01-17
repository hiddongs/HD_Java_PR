package days13;

public class Engine {

	
	// 필드
	
	int speed;
	
	
	// void
	
	void moreFuel(int fuel) {
		this.speed += fuel  * 0.05;
		
	}
	
	void lessFuel(int fuel) {
		this.speed -= fuel * 0.05;
	}
	
	void Stop() {
		this.speed = 0;
	}
}
