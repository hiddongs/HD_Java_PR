package days21;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 텍스트 파일 복사
		String fileName = ".\\src\\days20\\Ex01.java";
		String copyFileName = ".\\src\\days20\\Ex01Copy.java";
		
		fileCopy_textStream(fileName, copyFileName);
		System.out.println(" end ");
		
		
		
		
	}

	private static void fileCopy_textStream(String source, String target) {
		// TODO Auto-generated method stub
		
		long start = System.nanoTime();
		long end = System.nanoTime();
		
		try (FileReader reader = new FileReader(source);
				FileWriter writer = new FileWriter(target);){
			
			int code;
			while ((code = reader.read()) != -1) {
				System.out.println(code); // 화면 출력
				writer.write(code); // writer.append()
				// 오토 플러시, 스트림 객체 파일이 저장돈다 파일이 아니라!! 매우 중요
				System.out.println("파일 복사 완료 ! ! !");
			}
			
			writer.flush(); 
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.toString());
		}
		
		System.out.println(" 처리 시간 ( ns ) : " + (end-start));
		
		// [문제] 파일명 == 클래스명 수정
		
	}

}
