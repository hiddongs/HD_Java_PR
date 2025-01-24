package days21;

import java.io.File;
import java.io.FileReader;

/**
 * 
 * 
 * FileReader/FileWriter
 * File 클래스
 *   ㄴ 파일, 디렉토리(폴더)를 다루는 (생성, 삭제, 정보 얻어오기 등등)
 * 
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		// 절대 경로
		// 상대 경로  . 현재 디렉토리  .. 상위 디렉토리
		String parent = ".\\src\\days20";
		File dir = new File(parent); // 디렉토리
		
		System.out.println(dir.isDirectory());  // true
		
		//String child = "Ex0111.java";

		
		 String child = "Ex01.java";
		// File file = new File(parent, child); 
		File file = new File(dir, child); // 파일 객체를 만드는 이유 ? 
		System.out.println(file.isFile()); // true
		 System.out.println(" 파일 크기 : " + file.length() + "(bytes)");
		
		 
		int code;
		try(FileReader reader = new FileReader(file)){
			
			while((code = reader.read()) != -1) {
				
				System.out.println((char) code);
				
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		System.out.println(" END ");
		
		
	}

	private static Object isFile() {
		// TODO Auto-generated method stub
		return null;
	}

}
