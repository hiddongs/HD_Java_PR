package days11;

public class Ex02_02 {

	public static void main(String[] args) {
		// 배열 : ArrayIndexOutOfBoundException
		// int [] m = new int [3];
		// m [3] = 100;

		
		// 클래스 : NullPointException
		
		Car myCar = null;
		
		//The local variable myCar may not have been initialized 
		// java.lang NullPointException
		// 객체 생성 과정 == 인스턴스화하는 코딩 추가하면 위에 널포인트 오류는 사라진다
		
		myCar = new Car(); 
		
		myCar.name = "K9";
		
		
		
	}

}
