package days17;

import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 3:18:28
 * @subject
 * @content 
 */
public class Ex10_02 {

   public static void main(String[] args) {
      String fileName = ".\\src\\days16\\Ex05.java";
      
      // 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
      // 갯수를 파악해서 #으로 막대그래프를 그리기.
      // A(20) : ####################
      // B(11) : ###########
      // :
      // Z(3)  : ###
      
      // c[0]  = 'A' - 'A' 갯수  65 -> 0
      // c[25] = 'Z' - 'A' 갯수  66 -> 1
      
      //
      // 대문자 확인: Character.isUpperCase(문자)
      // 소문자 확인: Character.isLowerCase(문자)
      // 숫자 확인: Character.isDigit(문자)

      int [] upperCount = new int[26];
      int [] lowerCount = new int[26];
      int [] digitCount = new int[10];
      
      
      char one = '\u0000';
      int code = -1;
      try (FileReader reader = new FileReader(fileName)){
         
         while ( (code = reader.read()) != -1) { 
            one = (char) code;
            if( Character.isUpperCase(one)) {
               upperCount[one - 'A']++;
            }
            else if( Character.isLowerCase(one)) {
            	lowerCount[one - 'a']++;
            }else if(Character.isDigit(one)) {
            	digitCount[one - '0']++;
            }
         } // while
      } catch (Exception e) {
         System.out.println(e.toString());
      }
      
      // 막대그래프 그리기
      for (int i = 0; i < upperCount.length; i++) {
         System.out.printf("%c(%d)\t%s\n", 
               i+'A', upperCount[i]
                     , "#".repeat(upperCount[i]));
      } // for i
      
      System.out.printf("대문자 수 : %d ",upperCount.);
      System.out.println("소문자 수 : %d ");
      System.out.println("숫자 수 : %d ");
      System.out.println(" end ");
   } // main

} // class







