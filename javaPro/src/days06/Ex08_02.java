package days06;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정규 표현식
		//[reg]ular [ex]press
		//regex
		
		//입력값에 대한 유효성 검사...(암기)-> 시험 출제 문제
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> user 가위 (1), 바위(2), 보(3) 선택 ? ");
		
		//boolean String.mathces(String regex) 일치하는가/
		String regex = "[1-3]"; //[123]도 가능 1,2,3 유효성 검사 문자열만 가능
		String strUser = sc.next();
		int user;
		if(strUser.matches(regex)) {
			user = Integer.parseInt(strUser);
			System.out.println(user);
		}else {
			System.out.println("입력 잘못 !!!");
		}
		
		
	}

}
