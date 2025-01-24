package days21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 
 * 
 * FileReader/FileWriter
 * BufferedReader/BufferedWriter 파일 복사
 */
public class Ex06_04 {

	public static void main(String[] args) {
		
		
		// 텍스트 파일 복사
				String fileName = ".\\src\\days20\\Ex01.java";
				String copyFileName = ".\\src\\days20\\Ex01Copy.java";
				
				fileCopy_textStream02(fileName, copyFileName);
				System.out.println(" end ");
				
				
				
				
			}

			private static void fileCopy_textStream02(String source, String target) {
				// TODO Auto-generated method stub
				
				long start = System.nanoTime();
				long end = System.nanoTime();
				
				final int BUFFER_SIZE = 1024;
				
				try (FileReader reader = new FileReader(source);
						FileWriter writer = new FileWriter(target);
						// 보조 스트림 장착 + 버퍼 기능 
				        BufferedReader br = new BufferedReader(reader,BUFFER_SIZE);
						BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE);
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
					int n = -1;
					while ((n = br.read(cbuf)) != -1) {
						
					
						bw.write(cbuf, 0, n);
						
						
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
