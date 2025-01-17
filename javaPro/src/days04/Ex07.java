package days04;

/**
 * 
 * @author kenik
 * @date 2024. 12. 27. - 오후 2:37:49
 * @subject if, if ~ else, switch, for
 * @content 조건반복문 : while, do ~ while
 */
public class Ex07 {

	
	
	// 들여쓰기 컨트롤 쉬프트 i
	// 컨트롤 스페이스 완성
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1, sum = 0;
		
		while(i < 11){
			
			
			System.out.printf("%d+", i);
			sum += i;
			i++;
			
			//반복할 때 쓰이는 변수는 반복 변수 그리고 반복 변수는 변수명을 i,j같은 짧은 이니셜로 하는 것이 좋다
			
		}//while -> 이거처럼 어디까지가 메소드의 끝인지 표시해두는 습관을 들이면 가독성 면에서 편하다
		System.out.printf("=%d\n", sum);
		
		
	}

}
