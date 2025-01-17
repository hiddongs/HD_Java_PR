package days06;
/**
 * 
 * @author kenik
 * @date 2025. 1. 2. - 오후 2:31:39
 * @subject
 * @content
 */

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		out : //라벨 선언 예시 이름은 마음대로
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i == 4 && j == 6)
					break out; //break문 뒤에 라벨을 붙히면 라벨 문 자체를 건드릴 수 있다
				System.out.printf("(%d-%d)", i ,j);
			}
			System.out.println();
		}
		
	}

}
