package days06;

import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정규 표현식( [reg]ular [exp]ression )
	      //                  regex
	      
	      // 입력값에 대한 유효성 검사... ( 암기 )
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 주민등록번호 입력(ex)000000-0000000) ? ");      
	      // boolean String.matches(String regex)  일치하니?
	      // String regex = "[0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]";      
	      // String regex = "[0-9]{6}-[0-9]{7}"; //위에를 줄이면 이렇게 된다
	      String regex = "\\d{6}-\\d{7}";
	      //             \\D --> 대문자는 정반대 의미 숫자가 안된다는 의미니까 잘 기억해둘 것 !
	      // X? 0 1
	      // X+ 1 여러번
	      // X* 0 여러번
	      // X{n} n번
	      // X{n,m} n~m qjs
	      // X{n,}  n~ 이상
	      String rrn = scanner.next();      
	       
	      if( rrn.matches(regex) ) {
	         System.out.println("OK");
	      }else{
	         System.out.println("입력 잘못!!!");
	      }
	         
	      
	      //[문제] 우편번호 000 - 0000 00000 (검색)
	      //[문제] 비밀번호 8 ~ 15 특수문자 1개, 숫자 1개, 대, 소 1개 (검색)
	}

}
