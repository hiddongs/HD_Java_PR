package days05;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//한문자를 입력 받아서
		//대문자
		//소문자
		//숫자
		//한글
		//특수문자
		char one;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 입력 : ");
		
		
		

		//charAt(0) 문자열에서 원하는 위치에 해당되는 값을 가져오는 것(0부터 시작) 
		
		one = sc.next().charAt(0);//문자열을 char로 변환이 아니라 가져오는 것이다
		
		//string regex = "[^a-zA-Z0-9\\s]";
		/*
		if('A' <= one && 'Z' >= one)
			System.out.println("대문자");
		else if('a' <= one && 'z' >= one)
		    System.out.println("소문자");
		else if('0' <= one && '9' >= one)
			System.out.println("숫자");
		else if('가' <= one && '힣' >= one)
			System.out.println("한글");
		//else if(one != regex) {
		//	System.out.println("특수문자");
			
		}
		//전공자는 정규표현식으로 특수문자
		System.out.printf("출력 : %c ", one);
		*/
		

	
	}
}
