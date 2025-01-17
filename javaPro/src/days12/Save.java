package days12;

// 저축 클래스
public class Save {
	
	// 컨트롤 + 쉬프트 + S  자주 활용하자


	// 필드
    // 인스턴스 변수
	private String name; // 예금주
	private int money;   // 예금액
	// private double rate = 0.02; //이자율
	
	// 클래스 변수 == 정적(static) 변수  == 공유(Shared) 변수    인스턴스로 변수로 안쓰여도 되는 공통된 값 
	// 그리고, 단 하나만 만들어지고 모든 인스턴스들이 공유해서 사용한다
	private static double rate = 0.02; //이자율


	// 생성자

	public Save(String name, int money, double rate) {


		// super();
		this.name = name;
		this.money = money;
		this.rate = rate;


	}


    // 디폴트 생성자
	public Save() {
		// super();
		
	}



	// 메소드
	// 예금 정보를 출력하는 메소드 선언
	public void printSave() {
		System.out.printf("예금주 : %s  예금액 : %d 이자율 : %.2f\n", this.name, this.money, this.rate);
	}
	
	
	// getter/setter
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}

	/*

	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}
	*/


	// static은 프로그램의 실행과 동시에 메모리에 올라가서 객체 생성 안해도 바로 사용 할 수 있다
	// 정적 메소드 == static 메소드 == 클래스 메소드
	public static double getRate() {
		return rate;
	}


	public static void setRate(double rate) {
		
		// int age = 10; 스태틱 안에는 지역변수 사용가능
		// 그러나 this는 객체가 만들어지고 사용해야하기 때문에 못 쓴다
		Save.rate = rate;
	}

	

}
