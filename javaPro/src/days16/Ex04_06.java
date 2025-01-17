package days16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 
 * @author kenik
 * @date 2025. 1. 16. - 오후 4:03:18
 * @subject 학생명단.txt
 * @content
 */
public class Ex04_06 {

	public static void main(String[] args) {
	
		// 팀 배치 ( 고려 )
		// String [][] teamArr = new String[3][5];
		
		String fileName = ".\\src\\days16\\학생명단.txt";
		String savefileName = ".\\src\\days16\\SiSte.html";
		
		// FileReader / FileWirtter 클래스
		
		String name = null; // line
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);
			FileWriter writer = new FileWriter(savefileName);){
			
			
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주) 쌍용교육센터 E강의실 학생 명단</h3>");
			writer.write("<ol>");
			while((name = br.readLine()) != null) {
				// System.out.println(name);
				String li = String.format("<li>%s</li>", name); // <li> 이름 </li>
				writer.write(li);
				 
			} // while
			
			writer.write("<html>");
			writer.write("</body>");
			writer.write("</ol>");
			
		} catch(Exception e) {
			System.out.println(e.toString()); // 에러 정보 확인을 위해 꼭 넣기
		}
		
		System.out.println(" END ");
	} // main

} // class
