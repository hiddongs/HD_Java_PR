package days10;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 3:13:12
 * @subject  검색(Search)
 * @content    ㄴ 항목의 집합 중에 특정 항목을 찾아낸 것.
 *           1) 순차 검색( sequence search )
 *           2) 이진 검색( binary search )
 */
public class Ex04_03 {

   public static void main(String[] args) {
	   
	   // int fromIndex = 0;
	   // System.out.println("안녕하세요. 홍길동입니다. 홍길동입니다.".indexOf("홍길동", fromIndex));
	   // 위 indexOf에서 찾는 값이 없으면 -1 반환
	   
	   
	   
	   
      //           0<= 정수  <=20
      int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
      Scanner scanner = new Scanner(System.in);
      System.out.print("> 배열에서 찾을 정수 입력 ? ");
      int n = scanner.nextInt(); // 12
      
      // 찾는 정수가 없을 경우에는 -1 반환하도록 정했다.
      int index = -1;
      int startIndex = 0;
      
      while(  (index = sequenceSearch(m, n,startIndex)) != -1 ) {
          System.out.println(index);
          startIndex = index + 1;
      }
       
      
   } // main

   private static int sequenceSearch(int[] m, int n, int startIndex) {
      int index = -1;
      
      for (int i = startIndex; i < m.length; i++) {
         if( m[i] == n ) {
            index = i;
            break;
         }
      }      
      return index;
   }
   
   private static int sequenceSearch(int[] m, int n) {
      int index = -1;
      
      for (int i = 0; i < m.length; i++) {
         if( m[i] == n ) {
            index = i;
            break;
         }
      }      
      return index;
   }

} // class



