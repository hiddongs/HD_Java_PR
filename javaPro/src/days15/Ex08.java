package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오후 2:34:18
 * @subject  예외처리 활용 + 파일 열어서 출력.
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		
	
		String fileName = "C:\\Class\\JavaClass\\JavaClass\\javaPro\\src\\days01\\Ex05.java";
		
		// [FileReader] / FileWritter 클래스
		FileReader reader = null;
		
		try {
			
			// 지역 변수
			reader = new FileReader(fileName);
			/*
			// [1]
			int one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			*/
			 
			/* 
			// [2]
			while(true) {
				int one = reader.read();
				if( one == -1) break;
				System.out.print((char)one);
			}
			*/
			
			// [3]
			int one;
			while(( one = reader.read()) != -1) {

				System.out.print((char)one);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.out.println(e.getMessage());
			System.out.println(e.toString());
		} catch (Exception e) {
			
			System.out.println(e.toString());
		} finally {
			// 파일 닫기
			// reader가 try문 안에서 선언된 지역변수이기 때문
			
//			/Unhandled exception type IOException -> 반드시 예외처리를 필요로함
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	    System.out.println(" end ");
	}

}
