package days15;

/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오후 2:34:18
 * @subject  예외처리 활용 + 파일 열어서 출력.
 * @content  [ try ~ resource(자원) 문 설명 ] 
 * 
 *           각 라인의 번호를 붙이고 싶다.
 * 
 *           [ 문제해결 ] end 앞에 번호 제거, 파일이 아닌 라인 번호 제거
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex08_03 {
	
	public static void main(String[] args) {
	String fileName = "C:\\Users\\SIST52\\git\\HD_Java_PR\\javaPro\\src\\days15\\Ex06.java";
	
	// [FileReader] / FileWritter 클래스
	
	// try resource문을 사용하면 finally 구문으로 굳이 반환 안해도 자동 반환이라 편리하다
	try(FileReader reader  = new FileReader(fileName);) {

	
		int one;
		int index = 1;
		// boolean first = true;
		System.out.printf("%d : ", index++);
		while(( one = reader.read()) != -1) {
			// 1 :
			/*
			if(first) {
				System.out.printf("%d : ", index++);
				first = false;
				
			}
			*/
			// System.out.printf("[%d]",one);
			 System.out.print((char)one);
			// System.out.printf("[%d]",index);
			// index++;
			if(one ==10) System.out.printf("%d : ", index++);
			
		}
		
	} catch (FileNotFoundException e) {
		
		System.out.println(e.toString());
	} catch (Exception e) {
		
		System.out.println(e.toString());
	} finally {
	
	}

    System.out.println(" end ");
	}
}
