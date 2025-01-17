package days04;


/**
 * 
 * @author kenik
 * @date 2024. 12. 27. - 오후 3:08:16
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 로또번호 645 1 ~ 45 6
		//자바에서 임의의 수를 발생시키는 방법
		// 1) Math.random() *** 일단 이거 먼저
		// 2) Random 클래스 사용
		// a에서 b사이에서 임의값을 발생시키는 수식을 계산하세요 ***연습
		
		// 0.0 <= double Math.random() < 1.0
		for(int i = 0; i < 6; i++) {
		System.out.println((int)(Math.random() * 45) + 1   );
		
			//System.out
		}
		
		
	   //0.0 * 45 <= double Math.random() * 45 < 1.0 * 45
	   // 0.0      <=     (int)(Math.random() * 45) + 1                   < 46.0
		
		
		
			}

	}
