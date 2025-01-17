package days06;

import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //[문제] 우편번호 000 - 0000 00000 (검색)
	      //[문제] 비밀번호 8 ~ 15 특수문자 1개, 숫자 1개, 대, 소 1개 (검색)
		/* 우편번호 검색
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("> 우편번호 입력(ex)000-0000 00000) ? ");  
		 String rrn = sc.nextLine();   
	     String regex = "[0-9]{3}-[0-9]{4}\\s*[0-9]{5}";
	     
	        
	       
	      if( rrn.matches(regex) ) {
	         System.out.println("OK");
	      }else{
	         System.out.println("입력 잘못!!!");
	      }
	     */
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("비밀번호 (8~15자, 특수문자 1개, 숫자 1개, 대문자 1개, 소문자 1개 포함): ");
		String pw = sc.nextLine(); 
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,15}$";
		
		if( pw.matches(regex) ) {
		         System.out.println("OK");
		      }else{
		         System.out.println("입력 잘못!!!");
		      }
	}

}
