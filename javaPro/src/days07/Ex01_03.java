package days07;

import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) { //메인 함수는 프로그램을 실행하고 종료하는 기능
		// TODO Auto-generated method stub
		//두 정수를 입력 받아서 합을 출력 ...
		
		//조건) 두 정수의 합을 반환하는 sum 함수를 만들어서 처리
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수 입력 x, y :");
		
		x = sc.nextInt();
		y = sc.nextInt();
        sum(x,y);
        
        System.out.printf("%d + %d = %d\n", x, y, sum(x,y));
		
     } //main

	
	public static int sum(int x, int y) {
		
		
		
		
		int z = x + y;
		
		
		return z;
		
	}
  
	
} //class
