package days05;
import java.util.Scanner;


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if else문 사용
		System.out.println("국어 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		if(kor >= 0 && kor <=100) {
			if(kor >= 90) //&& kor <=100) // && 연산자는 뺴는 게 더 좋다 왜냐 이미 만족한 조건이라
			{
				System.out.printf("국어 점수 : %d 등급 : 수", kor);
			}
			else if(kor >= 80) // && kor < 90)
			{
				System.out.printf("국어 점수 : %d 등급 : 우", kor);
			}
			else if(kor >= 70) //&& kor < 80)
			{
				System.out.printf("국어 점수 : %d 등급 : 미", kor);
			}
			else if(kor >= 60) // && kor < 70)
			{
				System.out.printf("국어 점수 : %d 등급 : 양", kor);
			}
			else
			{
				System.out.printf("국어 점수 : %d 등급 : 가", kor);
			}
			}
		else 
			System.out.printf("0점 부터 100점 사이의 값만 입력하세요");
			

		//[문제]
		//국어 점수를 입력받아서 -> 배열 ㄴ 
		//수/우/미/양/가 등급 출력 -> 등급 나눠주기
			}

		
}
