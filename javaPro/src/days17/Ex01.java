package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex01 {

	public static void main(String[] args) {
		
		// 팀 배치 ( 고려 )
		// String [][] teamArr = new String[3][5];
		
		String fileName = ".\\src\\days16\\학생명단.txt";
		String savefileName = ".\\src\\days16\\SiSte-Team.html";
		String [][] students = new String[3][5];
		
		
		
		// FileReader / FileWirtter 클래스
		
		String name = null; // line
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);
			FileWriter writer = new FileWriter(savefileName);){
			
			int cnt = 0;
			int cols = students[0].length;
			while((name = br.readLine()) != null) {
				
				
				students[cnt/cols][cnt%cols] = name;
				cnt++;
				 
			} // while
			
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주) 쌍용강북교육센터 E 강의실 학생 명단 </h3>");
			
			for(int i = 0; i < students.length; i++) {
				writer.write("<h3>" + (i+1)+"조</h3>");
				writer.write("</ol>");
				for(int j = 0; j < students[i].length; j++) {
					String li = String.format("<li> %s </li>", students[i][j]);
				}
			}
			
			writer.write("<html>");
			writer.write("</body>");
			writer.write("</ol>");
			
		} catch(Exception e) {
			System.out.println(e.toString()); // 에러 정보 확인을 위해 꼭 넣기
		}
		
		System.out.println(" END ");
	} // main

} // class