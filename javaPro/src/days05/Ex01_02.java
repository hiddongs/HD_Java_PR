package days05;
import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.out.println("n값을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("m값을 입력하세요");
		
		int m = sc.nextInt();
		
		//[문제]
		//두 정수 m, n을 입력 받아서 두 정수 사이의 합을 출력
        
		
		int sum = 0;
		
		if(n < m) {
			
			for(int i = n; i <= m; i++) {
			
				sum += i;
			
				} 
			System.out.printf("%d + ... +  %d = %d ",n , m, sum);
		
		}else if (n == m ) {
		
			System.out.printf("n은 m보다 작아야 합니다");
			return;
		
		}else
		
			System.out.printf("n은 m보다 작아야 합니다");
			return;
	}
	*/

/* (좋지 않은 코드)
 * 
 * if(n < m) {
			
			for(int i = n; i <= m; i++) {
			
				sum += i;
			
				} 
			System.out.printf("%d + ... +  %d = %d ",n , m, sum);
		
		}else  
		{
		for(int i = m; i <= n; i++) {
			
				sum += i;
			
				} 
			System.out.printf("%d + ... +  %d = %d ",m , n, sum);
		---> for루프를 두번 돌리는 코드라 제일 비효율적인 코드
			
		}
 */
		
		/*
		 * 이 코딩이 더 좋은 코드
		 * if(n > m) {
		 * 
		 * int temp = n;
		 * n = m;
		 * m = temp;
			
			for(int i = n; i <= m; i++) {
			
				sum += i;
			
				} 
			System.out.printf("%d + ... +  %d = %d ",n , m, sum);
		
		 }
		}
		 * 
		 * 
		 */
		
		// [3] *** 가독성이 좋은 코드가 좋은 이유 = 유지 보수가 쉽다 이 코딩대로 ㄱㄱ
		
		int min;
		int max;
		/*
		if(n > m) {
			min = m;
			max = n;
			
		}
		else {
			min = n;
			max =m;
		}
		*/
		/*
		 * 
		 * min = n > m ? m : n;
		 max = n > m ? n : m;   ->  삼항연산자도 같은 의미
		*/
		//int min = Math.min(n,m); --> 이런식으로 함수 호출해서 하는 방식도 있지만 성능은 떨어진다 그러나 가독성이 좋아진다
		
		//그러면 가독성 vs 성능을 따진다면 가독성이 더 낫다 why? -> 요즘엔 하드웨어 적인 부분은 이미 기술이 좋아져서 해결 됐
		
 }
}
