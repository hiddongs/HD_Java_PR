package days22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/**
		 * 
		 * 1. 자바 모든 입/출력 : 스트림 ( Stream ) 
		 * 2. 단방향 : 입력 스트림, 출력 스트림
		 * 3. 스트림 2가지 종류
		 *    1) 문자 스트림 : Reader, Writer
		 *       
		 *    
		 *    2) 바이트 스트림 : InputStream, OutputStream
		 * 
		 * 4. 보조 스트림
		 * 5. 메모리 스트림
		 * 
		 */

		// 키보드 -> 바이트 스트림 -> 문자 스트림(보조 스트림)
		InputStream is = System.in;
		// 한글 1문자 [][][] 3바이트
		// int code = is.read();
		
		
		// 보조 스트림 InputStream [Reader] : 문자 스트림
		InputStreamReader isr = new InputStreamReader(is);
		int one = isr.read();
		System.out.println((char) one);
		// 보조스트림  BufferedReader (reader)
		BufferedReader br = new BufferedReader(isr);
		String name = br.readLine();
		
		// [암기]
		// BufferedReader br = new BufferedReader(new InputStreamReader);
		// 키보드 -> System.in -> InputStreamReader -> BufferedReader 
		//         바이트 스트림    문자 스트림
		// String name = br.readLine();
		
		
			
///////////////////////////////////////////////////////////////
// [1] 한글을 입력받는 원래 방법 (그러나 매우 힘든 과정)
/*
		byte [] b = new byte[3];
		int n = is.read(b); // 배열에 저장된 갯수
		System.out.println("배열에 저장된 바이트 수 : " + n   );
		for(byte c : b) {
			System.out.println(c);
		}
		
		char one = new String(b).charAt(0);
*/
///////////////////////////////////////////////////////////////
		
//      237-í 같은 '한'을 입력해도 결과가 꺠지는 이유 바이트 문제
//		System.out.printf("%d-%c\n", code,(char)code);
		
		
//		54620
//		System.out.printf("%d\n", (int) '한');
	}

}
