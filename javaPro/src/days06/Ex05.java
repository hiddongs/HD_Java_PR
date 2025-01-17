package days06;
import java.util.Scanner;


public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[문제] 두 정수 n, m을 입력 받아서 두 정수 사이의 짝수이 합을 출력
		// n, m  입력 -> 3, 50
		// n, m  입력 -> 10, 3
		
		
        
		Scanner sc = new Scanner(System.in);
		System.out.println("n 입력 ");
		int n = sc.nextInt();
		System.out.println("m 입력 ");
		int m = sc.nextInt();
		
		int sum = 0;
		
		int min = Math.min(n, m);
		int max = Math.max(n, m);
		
		
		

		 // min이 홀수라면 다음 짝수로 설정
        if (min % 2 != 0) {
            min++;
        }

        // 짝수의 합 계산
        for (int i = min; i <= max; i += 2) {
            sum += i;
        }

        System.out.println("두 정수 사이의 짝수 합: " + sum);
    }
		
		
}
	
