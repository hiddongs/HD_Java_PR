package days14;

public class X_Engine implements Engine {

	
	// 필드
	
	int speed;
	
	
	// void
	
	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel  * 0.07;
		
	}
	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel * 0.07;
	}
	@Override
	public void Stop() {
		this.speed = 0;
	}
}
