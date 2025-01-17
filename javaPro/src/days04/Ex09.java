package days04;

/**
 * 
 * @author kenik
 * @date 2024. 12. 27. - 오후 3:50:10
 * @subject break, comtinue
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) for 문 사용해서 1 + 2 +..9 + 10 = 55까지 출력
/*
		int sum = 0;
		for(int i = 0; i < 11; i++) {
			
			sum = sum + i;
			
			
		}
		System.out.printf("1 + 2 + .....+ 8 + 9 + 10 = %d",sum);
*/
		/* int sum = 0; int i = 1;
		for(   ;    ;   ) {
			
			sum += i;
			
		} //Unreachable code-> for루프가 무한루프라 생기는 오류 break로 해결
		System.out.printf("1 + 2 + .....+ 8 + 9 + 10 = %d",sum);
		
		*/
		
		
 // [3]홀수합
		/*
		int sum = 0;
		for(int i = 0; i < 11; i++) {
			
			if((i % 2) != 0 ) {
			sum = sum + i;
			System.out.printf("%d + ",i);
			}
			
		}
		System.out.printf("= %d",sum);
		
		*/
	
		 //[3-2]홀수합
			int sum = 0;
			for(int i = 0; i < 11; i++) {
				
				//if((i % 2) == 0) continue; //건너뛰는 코드 바로 증감식으로 ㄱㄱ
				//if((i & 2) != 0) break; 
				//return문은 함수 자체를 빠져 나가는 식
				
				sum = sum + i;
				System.out.printf("%d + ",i);
				
			}
			System.out.printf("= %d",sum);
			

	}
		
}
