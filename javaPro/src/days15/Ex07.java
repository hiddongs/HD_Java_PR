package days15;

import java.io.IOException;

/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오후 2:26:24
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
	
		method1();
		
		
	} // main
	
	// 자바 IO

	private static void method1() {
		
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void method2() throws IOException {
		
		throw new IOException("메서드 2에서 예외 발생");
		
	}

}
