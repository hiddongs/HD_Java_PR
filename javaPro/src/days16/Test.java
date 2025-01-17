package days16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author kenik
 * @date 2025. 1. 16. - 오후 4:03:18
 * @subject 학생명단.txt
 * @content
 */
public class Test {

	public static void main(String[] args) {



		String fileName = ".\\src\\days16\\학생명단.txt";

		List<String> list = new ArrayList<>();
		String savefileName = ".\\src\\days16\\SiSte.html";



		String name = null; // line

		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);
				FileWriter writer = new FileWriter(savefileName);){
			String line;

			while((line = br.readLine()) != null) {

				list.add(line.trim());


			} // while
			int r = 3;
			int c = 5;
			String[][] teamArr = new String[r][c];
			int index = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (index < list.size()) { // 리스트의 길이
						teamArr[i][j] = list.get(index++); // 리스트의 내용물
					} else {
						teamArr[i][j] = ""; 
					} // if
				} // for
			} // for
			
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주) 쌍용교육센터 E강의실 학생 명단</h3>");
			for(int i = 0; i < teamArr.length; i++)
			{
				writer.write("<h4>"+ (i+1)+"조<h4>");
				writer.write("<ol>");

				for(int j = 0; j < c; j++) {
					if (!teamArr[i][j].isEmpty()) { // 비어있지 않으면 계속 해당 배열값 출력
						writer.write("<li>" + teamArr[i][j] + "</li>");
					} // if
				} // for
				writer.write("</ol>");
			} //for
			writer.write("</body>");
			writer.write("</html>");

			// while



			System.out.println(" END ");
		}catch(Exception e) {

			e.printStackTrace();
		} // try ~ catch





	} // main

} // class
