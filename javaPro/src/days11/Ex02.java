package days11;

public class Ex02 {

	public static void main(String[] args) {
		// 클래스, 객체, 인스턴스 구분
		// 지역변수, 참조변수 설명(시험)
		// int age; // age 지역변수
		
		// 참조변수 : 주소값을 갖는 변수를 참조변수.
		int [] m = new int [3]; // 값이 아닌 주소값이기 떄문
		// m : 변수, 지역변수, 참조변수, (배열명)
		
		
		// 객체 : 클래스를 자료형으로 선언된 참조변수를 객체라 한다.
		//변수 선언 형식 : 자료형 변수명 [=초기값]
		Car myCar = null; // 클래스는 초기화값이 null 값이고 지역변수는 선언 후 초기화를 해줘야한다. 이건 객체는 아니다
		// myCar : 변수, 지역변수, 참조변수, [객체] 
		
		
		// 객체를 생성하는 과정 -> 인스턴스화 -> 생성된 객체 : 인스턴스
		
		// 인스턴스화 == 객체를 생성하는 과정 => 인스턴스
		// new 클래스명()
		
		new Car(); // ->  '객체만' 생성하는 코딩 (인스턴스화0		
		myCar = new Car();
		
		//The local variable myCar may not have been initialized
		// days11.Car@3ac3fd8b
        // System.out.println(myCar);
		
		
		// int [] m = new int[3];
		
		// 객체명.필드명;
		// 객체명.메소드명();
		
		// 클래스의 멤버변수의 필드는 따로 초기화하지 않아도 기본값으로 초기화
		// > 차명  : null, 속도 : 0 
		myCar.dispCarInfo();
		
		// . -> 멤버(영역) 연산자
		myCar.name = "K9";
		myCar.speed = 300;
		
		myCar.dispCarInfo();
		System.out.printf("> 차명 %s, 속도 %d, 바퀴수 %d \n", myCar.name, myCar.speed, myCar.wheelCount);
		
		// 인스턴스화 할 수 없다
		// 객체를 생성하는 과정 == 인스턴스화
		// 객체 생성 X
		// 왜 System 클래스는 객체 생성이 안될까?
		// System s = new System();
		
	} // main

} // class
