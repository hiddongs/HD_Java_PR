package days21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 
 * 
 * exe 실행 파일 복사
 * 문자 스트림 X
 * 바이트 스트림 ( 파일 읽/ 쓰기 )
 * 
 * FIS/FOS (1)
 * BI/BO   (2)
 * 
 */
public class Ex06_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 텍스트 파일 복사
		String fileName = "C:\\Program Files (x86)\\Kakao\\KakaoTalk";
		String copyFileName = ".\\Notepad_cop.exe";
		
		fileCopy_byteStream02(fileName, copyFileName);
		System.out.println(" end ");
		
		
		
		
	}
	private static void fileCopy_byteStream02(String source, String target) {
		// TODO Auto-generated method stub
		
		long start = System.nanoTime();
		
		
		final int BUFFER_SIZE = 1024;
		
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream (target);
				// 보조 스트림 장착 + 버퍼 기능 
		        BufferedInputStream bis = new BufferedInputStream(fis,BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
             ){
			
			/*
			String line = null;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line); // 화면 출력
				writer.write(line); // writer.append()
				// 오토 플러시, 스트림 객체 파일이 저장돈다 파일이 아니라!! 매우 중요
				System.out.println("파일 복사 완료 ! ! !");
			}
			*/
		
			char[] cbuf = new char[BUFFER_SIZE];
			// br.readLine() 한 라인을 읽어오는 메서드
			// br.read(); 한 문자를 읽어와서 int 반환 메서드
			// int br.read(char [] cbuf)
			// 1) 기능 : 한 문자 X, char [] 배열로 문자를 읽어와서 
			// 2) 매개변수 : cbuf에 저장 
			// 3) 리턴값 : 읽어온 문자를 채운 크기
			// (기억) 
			byte[] b = new byte[BUFFER_SIZE];
			int n = -1;
			while ((n = bis.read(b)) != -1) {// read() 한글자씩 읽어오고 저장 그리고 없으면 -1 반환
				
			
				bos.write(b, 0, n);
				
				
			}	
			bos.flush(); 
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.toString());
		}
		
		System.out.println(" 처리 시간 ( ns ) : " + (start));
		
		// [문제] 파일명 == 클래스명 수정
		
	}

	private static void fileCopy_byteStream(String source, String target) {
		// TODO Auto-generated method stub
		
		long start = System.nanoTime();
		
		
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target);){
			
			int code;
			while ((code = fis.read()) != -1) {
				System.out.println(code); // 화면 출력
				fos.write(code); // writer.append() 출력 소스에 읽어온 것들 출력
				// 오토 플러시, 스트림 객체 파일이 저장돈다 파일이 아니라!! 매우 중요
				System.out.println("파일 복사 완료 ! ! !");
			}
			
			fos.flush(); 
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.toString());
		}
		
		System.out.println(" 처리 시간 ( ns ) : " + (start));
		
		// [문제] 파일명 == 클래스명 수정
		
	}

}
