package days14;

/**
 * 
 * @author kenik
 * @date 2025. 1. 14. - 오후 12:32:32
 * @subject 추상화
 * @content abstract  키워드
 *           ㄴ 메서드
 *           ㄴ 클래스
 *           
 *           추상 클래스는 미완성 클래스 ( 밑그림만 그린 클래스라 생각하면 편하다 )
 *                  는 공통적인 부분(멤버) 만을 미리 선언한 클래스
 *           Employee 추상 클래스 선언
 *           
 *           
 *           
*/
public class Ex04 {

	public static void main(String[] args) {
	

		// 추상 메서드가 없어도 추상 클래스 선언 가능
		// 의미 ) 객체
		// Player p1 = new Player();
		
		
		// 추상클래스도 일종의 클래스이기 때문에 업캐스팅 가능하다.
		// AudioPlayer p = new CDPlayer();
		Player p = new CDPlayer();
		p.play(0);
		p.stop();
	}

}


abstract class Player {
	
	// 필드
	boolean pause;  // 작동 중지
	int currentPos; //현재 위치
	
	public Player() {
		
	}
	// 생성자
	abstract void play(int pos);
	abstract void stop();
	// 메서드
	
	// 추상메서드가 없어서 추상클래스라 선언할 수 있다.
}

// 추상 클래스를 상속 ...
abstract class AudioPlayer extends Player{

	
	// 추상클래스로부터 물려받은 추상메서드를 모두 
	// 오버라이딩하지 않으면 그 클래스도 추상 클래스가 된다.
	
	@Override
	void play(int pos) {
		
		System.out.println("추상메서드 오버라이딩 완료 ! ! ! ");
		
	}


}

class CDPlayer extends AudioPlayer {

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
	// 필드
	// 생성자
	// 메서드 
}
	
	
