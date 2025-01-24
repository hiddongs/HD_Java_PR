package days22;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author kenik
 * @date 2025. 1. 24. - 오전 10:46:28
 * @subject
 * @content 
 */
public class Ex06_02 {

   public static void main(String[] args) throws IOException {
      int [] score = {
                // 번호 국    영   수
                   1, 100, 90, 90,
                   2,70,90,100,
               3,100,100,100,
               4,70,60,80,
               5,70,90,100
            };

      String name = "score.dat";
      String mode = "rw"; // read, write
      
      try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
         for (int i = 0; i < score.length; i++) {
            System.out.printf("> 현재 FP : %d - %d\n"
                  , raf.getFilePointer(), score[i]);
            raf.writeInt( score[i] );
         } // for i
      } catch (Exception e) {
         System.out.println(e.toString());
      }
      
      Ex06.일시정지();
      
      // 11:02 수업시작~
      // [문제1]
      // 모든 학생의 번호,국어,영어,수학  성적 정보를 출력.
      int no, kor, eng, mat;
      int tot;
      double avg;
      
      try (RandomAccessFile raf = new RandomAccessFile(name, "r")){
         // raf.getFilePointer()   0   seek(0) 이동... 
         for (int i = 0; i < score.length/4; i++) {
            
            no = raf.readInt();  // 4
            kor = raf.readInt(); // 4
            eng = raf.readInt(); // 4
            mat = raf.readInt(); // 4
            
            tot = kor + eng +mat;
            avg = (double)tot/3;
            
            System.out.printf(
                  "번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
                  no, kor, eng, mat, tot, avg);
            
         } // for i
          
         
      } catch (Exception e) {
         System.out.println(e.toString());
      }
      
      Ex06.일시정지();
      
      
      // [문제2]
      // 3번 학생의 수학 점수(100)를 20점으로 수정하는 코딩..하세요.  
      try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
          // 3번학생의 수학 20 수정
          // FP : 44
          int pos = (4+4+4+4)*2+(4+4+4); // 44
          raf.seek(pos);
          raf.writeInt( 20 );
       
      } catch (Exception e) {
         System.out.println(e.toString());
      }
      
      Ex06.일시정지();
      
      // [문제3]
      // 3번 학생의 번호,국어,영어,수학(20)  성적 정보를 출력.
      try (RandomAccessFile raf = new RandomAccessFile(name, "r")){
          
            // 3번학생 위치 (FP)  
          int pos = (4+4+4+4)*2; // 32
          raf.seek(pos);
          
            no = raf.readInt();  // 4
            kor = raf.readInt(); // 4
            eng = raf.readInt(); // 4
            mat = raf.readInt(); // 4
            
            tot = kor + eng +mat;
            avg = (double)tot/3;
            
            System.out.printf(
                  "번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
                  no, kor, eng, mat, tot, avg);
          
         
      } catch (Exception e) {
         System.out.println(e.toString());
      }
      
   } // main

} // class

