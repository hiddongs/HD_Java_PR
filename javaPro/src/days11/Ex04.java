
package days11;

/**
 * 
 * @author kenik
 * @date 2025. 1. 9. - 오후 2:02:35
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 필드 X
		// 지역변수, 초기화 X
		// Illegal modifier for parameter age; only final is permitted
		// 지역 변수 앞에는 접근 지정자 붙으면 오류난다 
		// public int age;

		Tv t1 = new Tv();
		
		t1.power();
		
		t1.channel = 11;
		
		t1.channelUp();
		
		System.out.println(t1.channel);
		
		t1.power();
		
	}
	
}

// The public type Tv must be defined in its own file
// 하나의 자바 파일 안에 여러 개의 클래스를 선언할 수 있다.
//                  public class는 1개여야 한다
//      파일명 == public 클래스명
// Ex04.java -> Ex04{}. Tv{}
class Tv{
	
	
	protected class Volumn{
		
	}
	
	
	// 힙영역
	// 필드 == 멤버변수
	// [접근지정자] [기타지정자] 자료형 필드명 [= 초기값]; -> 멤버변수 선언 형식
	public String color;
	public boolean power = false;
	public int channel;
	
	
	
	// 메소드
	
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
}
