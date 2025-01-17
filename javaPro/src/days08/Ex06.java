package days08;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//(시험)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 ? ");
		
		int n = sc.nextInt();
		
		int [] nArr = new int[16];
		
		int index = 0;
		

		
		
		
		while(n > 0) {
			
			nArr[index] = n % 2;
			n = n / 2;
			index++;
		}
		
		System.out.print("2진수 형태 출력");
		
		for(int i = index-1; i >= 0; i--) {
	         System.out.printf("[%d]",nArr[i]);
	      }
	      System.out.println();
	      

		
		//10진수 정수를 입력 받아서
		//2바이트 2진수 형태로 출력....
		
		//2로 나누어서 나누어 떨어지지 않을 때까지 그리고 나머지를 출력
		
		
		// 정수를 입력? 10 
		// [] [] [] [] [] [] [] []    [] [] [] [] [] [] [] []
	}

}
