package days13;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 1. 상속성
		 * 2. 다형성 / 인터페이스
		 * 3. 업캐스팅 / 다운 캐스팅
		 * 4. 오버로딩 / 오버라이딩
		 * 5. 추상화 (추상메서드, 추상 클래스)
		 * 6. this, super 키워드 사용
		 * 등등
		 * 
		 * 
		 * 
		 * 1. 사원이라면 공통적으로 가지고 있어야 할 멤버들을 선언한 Employee라는 사원 클래스 선언
		 * 2. 사원클래스의 자식클래스인 정규직 사원 클래스 Regular
		 * 3. 정규직 클래스를 물려받은 자식 클래스인 영업직 사원 클래스
		 * 
		 * SalesMan
		 * 
		 * 4. 사원 클래스의 임시직원 클래스 Temp
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		/*
		// 사원 객체 생성 후 메서드 호출
		Employee emp1 = new Employee("김대원", "서울 강남구","010-1111-2222","2000-11-11");
		emp1.dispEmpInfo();
		*/
		
	
		/*
		// 2. 정규직(Regualr) 객체 생성
		// 상속 관계에서 객체 생성시 생성자 호출 순서 ( 기억 )
		
		Regular emp2 = new Regular("김민곤", "서울 양천구","010-1111-2222","2000-11-11",3000000);
		
		// [문제점] 부모의 dispEmpInfo() 메서드를 사용하면 문제점이 있다
		//          basePay 기본급과 관련된 사원 정보는 출력되지 않더라.
		// 해결법     재정의 함수 ( 오버라이딩 )
		emp2.dispEmpInfo();
		
		*/ 
		
		// 클래스들 간에 형변환 할 수 있다 . [왜??]
		// 클래스들 간에 자동으로 형변환이 됐다
		// UpCasting  (자동 업캐스팅)
		// 부모타임 참조 <-          자식 객체 생성 후
		Employee emp3 = new Regular("김민곤", "서울 양천구","010-1111-2222","2000-11-11",3000000);
		
		
		// [질문] dispEmpInfo() n,a,t,h + basrPay
		// Employee의 메소드가 호출될까요? Regular의 메소드가 호출될까요?
		// (중요) 실제 참조된 Regular 객체의 dispEmpInfo() 메소드가 호출된다.
		emp3.dispEmpInfo();
		
		// [문제점] 업캐스팅 후의 문제점 파악 
		// emp3.getPay(); X 호출할 수 없다...
		
		// 업캐스팅 : 부모 <- 자식으로 형변환
		// 다운캐스팅 : 부모 -> 자식으로 형변환
		// Type mismatch: cannot convert from Employee to Regular 형변환 불가
		// 클래스들 간의 형변환 할 때 사용하는 연산자 : (변환하고자 하는 클래스명) cast 연산자로 강제 형변환.
		Regular emp4 = (Regular) emp3;
		/*
		 * 
		 
	
	    // 클래스들 간의 상속 관계가 있을 경우에만 자동 형변환이 이루어진다
		// Type mismatch: cannot convert from Regular to Temp
		Temp emp4 = new Regular("김민곤", "서울 양천구","010-1111-2222","2000-11-11",3000000);
		*/
		
		
		/**
		 * 형변환
		 * 자동형변환 2가지 겨웅
		 * 강제형변환 - cast 연산자
		 */
		
		
		// long = int 자동 형변환
		long l = 100;
		// int  = long 자동 형변환 X, 강제 형변환 O cast
		int i = (int) l;
		
	}

}
