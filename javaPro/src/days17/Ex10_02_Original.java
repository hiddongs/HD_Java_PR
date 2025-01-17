package days17;

import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 3:18:28
 * @subject
 * @content 
 */
public class Ex10_02_Original {

   public static void main(String[] args) {
      String fileName = ".\\src\\days16\\Ex05.java";
    
      // [0]행 : 대문자
      // [1]행 : 소문자 
      // [2]행 : 숫자 
      // 가변 배열로 선언 ... 
      int [][] counts = new int[3][];
      counts[0] = new int[26];
      counts[1] = new int[26];
      counts[2] = new int[10];

      
      char one = '\u0000';
      int code = -1;
      try (FileReader reader = new FileReader(fileName)){
         
         while ( (code = reader.read()) != -1) { 
            one = (char)code;
            
            if( Character.isUpperCase(one)) {
               counts[0][one-'A']++;
            }else if ( Character.isLowerCase(one)) {
               counts[1][one-'a']++;
            }else if( Character.isDigit(one)) {
               counts[2][one-'0']++;
            }
            
         } // while
      } catch (Exception e) {
         System.out.println(e.toString());
      }
       
      for (int i = 0; i < counts.length; i++) { // 행
    	  
    	 int totalCount = IntStream.of(counts[i]).sum();
    	 System.out.printf("==%s:%d==\n", i==0?"대문자" :(i==1?"소문자":"숫자"), totalCount);
    	  
         for (int j = 0; j < counts[i].length; j++) { // 열
            System.out.printf("%c(%d)\t%s\n", 
                  j+( i==0?'A':(i==1?'a':'0') ) , counts[i][j]
                        , "#".repeat(counts[i][j]));
         } // for j
         
      } // for i 

      System.out.println(" end ");
   } // main

} // class




