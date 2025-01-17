package days15;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.io.BufferedReader;

/**
 * 
 * @author kenik
 * @date 2025. 1. 15. - 오후 2:34:18
 * @subject  예외처리 활용 + 파일 열어서 출력.
 * @content  [ try ~ resource(자원) 문 설명 ] 
 * 
 *           각 라인의 번호를 붙이고 싶다.
 *           reader.read() 한문자 -> int 반환하는 메서드
 *           한 라인 읽기 -> 각 라인 번호 붙이면...
 *           
 *           FileReader 파일 
 *            int read() 한문자
 *           [][][][][][][][10]
 *           2 : [][][][][][10]
 *           3 : [][][][][]
 *           
 *           키보드 -> System.in -> InputStreamReader -> BufferdReader br.readLine()
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex08_04 {

	public static void main(String[] args) {

		// 보조 스트림
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scaaner

		String fileName = "C:\\Class\\JavaClass\\JavaClass\\javaPro\\src\\days01\\Ex05.java";


		
		try(
				FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);
		   ) {

			String line = null;
			int lineNum = 1;
			while(( line = br.readLine() ) != null) {
				System.out.printf("%d : %s\n",lineNum++, line);
			};

		} catch (FileNotFoundException e) {

			System.out.println(e.toString());
		} catch (Exception e) {

			System.out.println(e.toString());
		} finally {

		}

		System.out.println(" end ");
	}
}
