package days22;

import java.io.FileWriter;

/**
 * 
 * 
 * 
 * Data{InputStream] / Data[OutputStream]
 * 바이틈 스트림
 * 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림.
 * 
 * Ex02.java/Ex02_02.java
 * Ex03.java/Ex03_02.java
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "이찬희";
		int kor = 67, eng = 89, mat = 70;
		int tot = kor + eng+ mat;
		double avg = (double ) tot/3;
		boolean gender = true;
		
		// 위의 한 학생의 정보를 문자스트림( (FileWriter) -> 파일로 저장 ) 
		
		String fileName = "student.txt";
		
		                                      //         append 인데 append는 기존 데이터 유지한 상태로 넣는 것을 의미
		try (FileWriter writer = new FileWriter(fileName, true);) {
			String data = String.format("%s, %d, %d, %d, %d, %f, %b\n",name,kor,eng,mat,tot,avg,gender );
			writer.write(data);
			writer.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		System.out.println(" END ");
		
	}

}
