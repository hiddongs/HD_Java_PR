package days11;



// 클래스 선언 부분 
public class Car {

	// 필드 (field) == 속성 == 특성 == property
	// 메소드 (method) == 기능 == 일 == 멤버함수

	
	String name;    // 자동차 이름
	int speed;      // 속도
	int wheelCount; // 바퀴수
	
	//메소드(method) == 기능 == 일 == 멤버함수
	
	public void dispCarInfo() {
		System.out.printf(" > 차명  : %s, 속도 : %d \n", name, speed);
	}
	
}
