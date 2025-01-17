package days05;
import java.util.Scanner;
public class Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[문제]
	    //세 정수(a, b, c) 를 입력 받아서 가장 작은 값(min), 큰 값 (max) 출력
		
		/*
		int a,b,c;
		int min, max;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하세요");
		a = sc.nextInt();
		
		System.out.println("b를 입력하세요");
		b = sc.nextInt();
		
		System.out.println("c를 입력하세요");
		c = sc.nextInt();
		
	
	    min = Math.min(a, b);
	    max = Math.max(, b)
			
		
		
		*/
	
	
	 
      // [문제]
      // 세 정수(a,b,c)를 입력받아서 가장 작은값(min)
      // , 가장 큰값(max) 찾아서  출력
      int a, b, c ;
      Scanner scanner = new Scanner(System.in);
      System.out.print("> a b c 입력 ? ");
      a = scanner.nextInt(); // 3
      b = scanner.nextInt(); // 5   
      c = scanner.nextInt(); // 1
      
      int min, max;
      
      if ( a > b ) {  // max = a
         // a c
         if ( a > c) {
            max = a;
         } else {
            max = c;
         } // 
         
      } else {        // max = b
         // b c
         if ( b > c) {
            max = b;
         } else {
            max = c;
         } // 
      } // if
      
      System.out.println("max = " + max);
      
      min = Math.min(a,b);
      min = Math.min(min, c);
      
      //min = Math.min(Math.min(a,b), c );
      
      System.out.println("min = " + min);
      
      
      
   } // main
}


