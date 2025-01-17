package days01;

import days11.Person;
import days11.Time;

public class Ex01 {
	 
	public static void main(String[] args) {
		
		System.out.println("hello world");

		// 2. 멤버 앞의 접근 지정자 테스트
		// 패키지 외부 접근(참조) 사용
		Time t = new Time();
		t.hour = 1;
		
		
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.run();
		
		p1.name = "김대원";
		p1.run();
		
		//멤버 앞의 접근 지정자 테스트
		
		
		//1. 클래스 앞의 접근 지정자 테스트
	}

}

// Ex01,  System,   String 

/*
 * 1. C:\Class 폴더 생성
 * 		ㄴ Download 폴더 생성
 * 		ㄴ JavaClass 폴더 생성
 * 2. C:\Tools
 * 		ㄴ eclipse-jee-2024-12-R-win32-x86_64
 * 3. https://www.oracle.com/  
 *    jdk-11.0.25_windows-x64_bin.exe
 *    
 * 4. https://www.eclipse.org/
 * 
 * 5. JDK = JRE 
 *    JRE = JVM + 클래스 라이브러리 
 * 6. jdk 설치 확인
 *    C:\\Users\\user>java -version
 * 7. Hello.java -> 메모장 
 *    실행 -> 본인 이름 출력 코딩.
 *           Hello World   
 *    대소문자 구분 한다.
 *       
 * 8.  Java Project 생성 - 자바 문법 ...         
 * */

/*
 * 1. 이창익
 * 2. 5주 - 자바 
 * 3. 출석(지각/결석/조퇴)
 * 
 * https://chatgpt.com/
 */






















