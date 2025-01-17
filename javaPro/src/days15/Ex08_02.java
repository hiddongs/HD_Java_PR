package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오후 2:34:18
 * @subject  예외처리 활용 + 파일 열어서 출력.
 * @content  [ try ~ resource(자원) 문 설명 ]
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		
	
		String fileName = "C:\\Class\\JavaClass\\JavaClass\\javaPro\\src\\days01\\Ex05.java";
		
		// [FileReader] / FileWritter 클래스
		
		// try resource문을 사용하면 finally 구문으로 굳이 반환 안해도 자동 반환이라 편리하다
		try(FileReader reader  = new FileReader(fileName);) {

		
			int one;
			while(( one = reader.read()) != -1) {

				System.out.print((char)one);
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
