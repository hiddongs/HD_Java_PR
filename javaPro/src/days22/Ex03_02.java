package days22;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "이찬희";
		int kor = 67, eng = 89, mat = 70;
		int tot;
		double avg;
		boolean gender;
		
		// 위의 한 학생의 정보를 문자스트림( (FileWriter) -> 파일로 저장. -> 파일을 읽어와서 출력.
		
		String fileName = "student.dat";
		
		                                    
		try (FileInputStream fis = new FileInputStream(fileName);
		       DataInputStream dis = new  DataInputStream(fis);		
				) {
			
		
			String line;
			while(dis.available() > 0) {
				
				name = dis.readUTF();
				kor  = dis.readInt();
				eng  = dis.readInt();
				mat  = dis.readInt();
				tot  = dis.readInt();
				avg  = dis.readDouble();
				gender = dis.readBoolean();
				
				System.out.printf("%s, %d, %d, %d, %d, %f, %b\n",name,kor,eng,mat,tot,avg,gender );
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		System.out.println(" END ");
		
	}

}