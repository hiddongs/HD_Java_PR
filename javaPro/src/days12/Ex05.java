package days12;

import java.util.Scanner;

/**
 * 
 * @author kenik
 * @date 2025. 1. 10. - 오후 12:02:27
 * @subject [private로 선언된 필드를 접근하는 방법]
 * @content Person 클래스 새로 추가
 * 
 *          getter, setter 자바 만들어서 접근...
 */

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		// The field Person.name [is not visible] -> 접근지정자
		// p1.name = "홍길동"; private라 못 씀
		
		p1.setName("홍길동");
		String name = p1.getName();		
		System.out.println(name);
		
		
		// 나이를 키보드로부터 입력...( 0 ~ 120 )
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		p1.age = age;
		
		System.out.println(age);


		// 예외 처리 코딩 ~
		p1.setAge(age);
		System.out.println(p1.getAge());

	}
	
	// 메소드
	
	
	
	
}
