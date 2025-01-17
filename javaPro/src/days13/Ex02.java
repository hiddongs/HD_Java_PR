 package days13;

public class Ex02 {

	public static void main(String[] args) {
		/**
		 * [변수의 초기화 설명] 
		 * 
		 * 1. 변수
		 * 2. 변수의 종류
		 *    1) 지역변수
		 *    2) 인스턴스 변수
		 *    3) static 변수
		 * 3. 변수의 초기화 - 변수를 선언하고 처음으로 값을 할당하는 것
		 * 4. 지역변수 - 반드시 초기화를 해야 사용할 수 있다.
		 *    인스턴스 변수, 클래스 변수는 초기화 하지 않으면 각 자료형의 기본값으로 초기화 된다.
		 *      boolean : false
		 *      char : '\u0000'
		 *      byte, short, int, long : 0
		 *      float : 0.0f
		 *      double : 0,0, 0d
		 *      참조형(String, 배열...) : null
		 *      
		 *      (암기)
		 * 5. 필드의 초기화 방법
		 *    1) 명시적 초기화
		 *    2) 생성자
		 *    3) 초기화 블럭
		 *         * 인스터스 초기화 블럭
		 *         * 클래스 초기화 블럭
		 *         
		 * 6. 초기화 순서
		 *    1) 명시적 초기화
		 *    2) 클래스 초기화 블럭
		 *    3) 인스턴스 초기화 블럭
		 *    4) 생성자 초기화 
		 */

		/*
		Member.rate = 0.05;
		System.out.println(Member.rate);
		 */

		Member m1 = new Member();
		System.out.println(m1.name); // null
		System.out.println(m1.age);  // 0
		
		Member m2 = new Member();
		Member m3 = new Member();
	}


}

class Member {
	// field
	// 인스턴스 변수
	String name = "홍길동"; // 명시적 초기화
	int age = 20;         // 명시적 초기화
	int count;
	int serialNo;

	// 클래스 변수
	static double rate = 0.05; // 명시적 초기화

	// 인스턴스 초기화 블럭 - 생성자가 오버로딩되어 있을 때
	//                   중복 코딩이 있다면 사용함
	
	{
		count++;
		serialNo = count;
		System.out.println(" > 인스턴스 초기화 블럭 호출됨...");
	}
	
	// 클래스 초기화 블럭 - 일괄적으로 클래스 변수를 초기화할 목적으로 사용.
	static {
		rate = 0.07;
		System.out.println(" > 클래스 초기화 블럭 호출됨...");
	}

	// constructor
	Member(){

		count++;
		serialNo = count;
		name = "무명";
		System.out.println(" > 디폴트 생성자 호출됨...");
	}

	Member(String name){

		count++;
		serialNo = count;
		this.name = name;
		System.out.println(" > 디폴트 생성자 호출됨...");

	}
	// method
}
