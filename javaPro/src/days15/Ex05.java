package days15;

import java.io.IOException;

/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오후 12:27:45
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 1. "checked  예외"
		//       ㄴ 컴파일러가 예외처리를 확인하는 예외
		//       ㄴ Exception( RunException 제외 )
		
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // 2. "unchecked 예외"
		//       ㄴ 컴파일러가 예외처리를 확인하지 않는 예외
		//       ㄴ RuntimeException 및 자식 예외들...
	}

}
