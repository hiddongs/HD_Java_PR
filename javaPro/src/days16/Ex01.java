package days16;


import java.io.BufferedReader;
import java.io.FileReader;

public class Ex01 {

	public static void main(String[] args) {
	
		// days15.Ex01.java
		// 라인 번호 붙여서 출력 ...
		
		// System.getProperty(String key)   반환타입 문자열
		// key 값 : user.dir
 	    // System.out.println(System.getProperty("user.dir"));
 		// 결과 C:\Class\JavaClass\javaPro
		
		String dir = System.getProperty("user.dir");
 		
		
	    //                 절대 경로
		//                 상대 경로       . -> 기준이 되는 현재 디렉토리 .. -> 부모 디렉토리
		
		// String fileName = dir + "\\src\\days15\\Ex01.java";
		
		String fileName = ".\\src\\days15\\Ex01.java";
		String line = null;
		
		int lineNum = 1; 
		
		//             reader는 한문자씩 읽음
		//           보조 스트림 버퍼 리더로 한번 더 읽음
		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);) {
			
			// End of File == EOF
			while((line = br.readLine()) != null) {
				 System.out.printf("%d : %s\n", lineNum++,line);
			} // while
			
			
		} catch(Exception e) {
			System.out.println(e.toString());
		} // try ~ catch
		
		System.out.println(" end ");
	}

}
