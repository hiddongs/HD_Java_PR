package days05;

import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("n의 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum += i;
			
			
		}
		System.out.printf("1 + ... +  %d = %d ",n, sum);
	}
	
	
	//제대로된 값을 줄 수 있게 유효성 검사를 해줘야 한다
    //예외 처리를 하든 알려주든 둘 중 하나는 하기 둘 다 하거나
}
