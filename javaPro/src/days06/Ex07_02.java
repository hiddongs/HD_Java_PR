package days06;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author kenik
 * @date 2025. 1. 2. - 오후 3:48:11
 * @subject
 * @content
 */


public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] m = new int[10];
	      // 1~100 임의의 정수
	      for (int i = 0; i < m.length; i++) {
	         m[i] = (int)(Math.random()*100)+1;
	      }
	      // [77, 7, 1, 42, 25, 93, 83, 2, 88, 31]
	      System.out.println( Arrays.toString(m ));
	     // 정수 입력 ? 56
	      System.out.print("> 정수(n) 입력 ? ");
	      Scanner scanner = new Scanner(System.in);
	      int n = scanner.nextInt();
	      
	      // [문제] 배열에서 가장 가까운 정수를 찾아서 출력~
	      // [46, 86, 26, 14, 7, 90, 27, 44, 44, 99]
	      int min = 101;
	      int result = 0;
	      for (int i = 0; i < m.length; i++) {
	         // 절대치를 더욱 쉽게 구하는 코드****
	    	 int d = Math.abs(m[i] - n);
	    	  
	         if( d < min ) {
	        	min  = d;
	            result = m[i];
	         }
	         //System.out.printf("m[%d]=%d - %d = %d  [%d] \n"
	         //      , i, m[i], n, d
	         //      , d * ( d < 0 ? -1 : 1 ));
	      }
	      
	      System.out.printf("%d[%d]\n", result, min);
		
   /*
		int [] m = new int[10];
		// 1 ~ 100 임의의 정수
		//정수 입력 / -> 56
		//입력 받은 56과 가까운 수 출력
		
		for(int i = 0; i < m.length; i++)
		{
			m[i]=  (int) (Math.random() * 100)+1;
			
		}
		System.out.println(Arrays.toString(m ));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수 n 입력");
		int n = sc.nextInt();
		
		
		int min  = 101;
		int result = 0;
		for (int i = 0; i < m.length; i++) {
	         int d = m[i]-n;
	         d = d * ( d < 0 ? -1 : 1 ); //절대치
	         
	         if(d < min) {
	        	 result = m[i];
	         }
	        // System.out.printf("m[%d] = %d - %d = %d  [%d] \n"
	        //       , i, m[i], n, d
	        //       , d * ( d < 0 ? -1 : 1 ));
	      }
		
		System.out.printf("%d[%d]\n", result, min);
		int closetInt = m[0];
		
		*/
		
	//먼 숫자 구하라고 할 수 있다 내일 문제는

	}

}
