package days22;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "이찬희";
		int kor = 67, eng = 89, mat = 70;
		int tot;
		double avg;
		boolean gender;
		
		// 위의 한 학생의 정보를 문자스트림( (FileWriter) -> 파일로 저장. -> 파일을 읽어와서 출력.
		
		String fileName = "student.txt";
		
		                                    
		try (FileReader reader = new FileReader(fileName);
		       BufferedReader br = new BufferedReader(reader);		
				) {
		
			String line;
			while((line = br.readLine())!= null) {
				String [] datas = line.split(",");
				
				name = datas[0];
				kor = Integer.parseInt(datas[1]);
				eng = Integer.parseInt(datas[2]);
				mat = Integer.parseInt(datas[3]);
				tot = Integer.parseInt(datas[4]);
				avg = Integer.parseInt(datas[5]);
				gender = Boolean.parseBoolean(datas[6]);
				
				System.out.printf("%s, %d, %d, %d, %d, %f, %b\n",name,kor,eng,mat,tot,avg,gender );
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		System.out.println(" END ");
		
	}

}