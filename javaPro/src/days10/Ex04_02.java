package days10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 3:13:12
 * @subject  검색(Search)
 * @content    ㄴ 항목의 집합 중에 특정 항목을 찾아낸 것.
 *           1) 순차 검색( sequence search )
 *           2) 이진 검색( binary search )
 *           
 *           검색 -> 확인/수정/삭제
 */
public class Ex04_02 {

   public static void main(String[] args) {
      //           0<= 정수  <=20
      int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
      Scanner scanner = new Scanner(System.in);
      System.out.print("> 배열에서 찾을 정수 입력 ? ");
      int n = scanner.nextInt(); // 12
       
      
      /*
      // 찾는 정수가 없을 경우에는 -1 반환하도록 정했다.
      int index = sequenceSearch(m, n);
      if (index != -1) {
         System.out.printf("찾는 정수 %d는 %d 위치에 있다.", n, index);
      } else {
         System.out.println("찾는 정수는 없다.");
      }
      */
      
      int [] indexArr = sequenceSearch(m, n);
      
      if (indexArr[0] == -1) {
         System.out.println("찾는 정수는 없다.");
      } else {
         for (int i = 0; i < indexArr.length; i++) {
            if( indexArr[i] == -1) break;
            System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n"
                  , n, indexArr[i]);
         } // for
      }
      
      
   } // main

   // [3]
   private static int[] sequenceSearch(int[] m, int n) {
      int index = 0;
      
      int [] indexArr = new int[m.length];
      Arrays.fill(indexArr, -1);
      
      for (int i = 0; i < m.length; i++) {
         if( m[i] == n ) {
            indexArr[index++] = i;
            // System.out.println("> 찾은 위치 : " + i);
         }
      }
      
      return indexArr;
   }
   
   // [2]
   /*
   private static int sequenceSearch(int[] m, int n) {
      int index = -1;
      
      for (int i = 0; i < m.length; i++) {
         if( m[i] == n ) {
            index = i;
            System.out.println("> 찾은 위치 : " + i);
         }
      }
      
      return index;
   }
   */
   
   /* [1]
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
   */

} // class

