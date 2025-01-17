package days05;

import java.util.Scanner;

/**
 * \
 * @author kenik
 * @date 2024. 12. 30. - 오후 2:25:40
 * @subject switch 문 사용 풀이
 * @content
 */
public class Ex02_03 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("국어 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
   
	    if (0 <= kor && kor <= 100)
	    {
	    	
	    	char grade;
	    	
	    	switch(kor / 10) {
	    	
	    	case 10 :
	    		//굳이 안써도 된다 왜냐 이미 9에서 있어서
	    	case 9 :
	    		grade ='수';
	    		
	    		break;
	    	case 8 :
	    		grade ='우';
	    		
	    		break;
	    	case 7 : 
	    		grade ='미';
	    		
	    		break;
	    	case 6 :
	    		grade ='양';
	    		
	    		break;
	    	default :
	    		grade ='가';
	 
	    		break;
	    	
	    	} System.out.printf("등급 : %c", grade);
	    }
	    
	    else {
	    	System.out.println("국어 점수 입력 잘못!!!");
	    }
	   
	    //디버그 중단점 찍기 -> f 11 -> f6
	    //스위치 문에서 브레이크 문이 없으면 계속 진행한다 브레이크문은 필수는 아니다

    }
}