package days14;

import days13.Employee;
import days13.Regular;
import days13.SalesMan;
import days13.Temp;

public class Ex01 {

	public static void main(String[] args) {
		// Cannot instantiate the type Employee // 추상 클래스는 객체 생성이 안된다
		// Employee emp1 = new Employee("김대원","서울 강서","010-2222-1111","2000.01.01");
		
		
		SalesMan emp3 = new SalesMan("이찬진", "경기도 남양주","010-9999-1234","2000.03.22",500000,20,150000);
		
       
		Regular emp2 = new Regular("양희동","경기도 고양지","010-1212-3434" ,"2000.12.27",500000000);
		
		// Temp 객체 생성
		Temp emp6 = new Temp("오재문", "서울 강북", "010-7777-5555", "2022.02.22",30,100000);
		//printEmp(emp1);
		//printEmp(emp2); // E emp = new R() 상속관계, 업캐스팅
		//printEmp(emp3); // E emp = new S() 상속관계, 업캐스팅
		//printEmp(emp6); // E emp = new T() 상속관계, 업캐스팅
		
		// [다형성] (polymorphism)
		// 1. 상속관계
		// 2. 다양한 성질
		// 3. 여러 가지 형태를 가질 수 있는 능력 ( 업캐스팅 )
		// 4. 조상클래스 타입 참조변수로 자손클래스의 인스턴슬르 참조할 수 있도록 한 것. ( 업캐스팅 )
		
	}
	
	private static void printEmp(Employee emp) { // 매개변수의 다형성 -> 매개변수가 다형성으로 쓰인 예
		// 매개변수로 전달된 실제 객체가 E/R/S/T .파악을 해야한다 - instanceof 연산자
		// (주의할 점) 자식클래스부터 타입을 확인한다 +  if ~ else if else if 문 사용
		
		
		if (emp instanceof SalesMan) {
			System.out.println("영엽직");
			// SaleMan  다운캐스팅
			SalesMan sm = (SalesMan) emp;
		}else if(emp instanceof Regular) {
			System.out.println("정규직");
			Regular rm = (Regular) emp;
			// Regular 다운캐스팅
		}else if (emp instanceof Temp){
			System.out.println("임시직");
			Temp tm = (Temp) emp;
			
			// Temp 다운캐스팅
		} else if(emp instanceof Employee) {
			System.out.println("사원");
		}
		/*
		System.out.println(emp instanceof Employee);
		System.out.println(emp instanceof Regular);
		System.out.println(emp instanceof SalesMan);
		System.out.println(emp instanceof Temp);
		*/
		emp.dispEmpInfo();
	}
	/*
	private static void printEmp(SalesMan emp) {
		emp.dispEmpInfo();
	}
	private static void printEmp(Regular emp) {
		emp.dispEmpInfo();
	}
	private static void printEmp(Temp emp) {
		emp.dispEmpInfo();
	}
	*/

}
