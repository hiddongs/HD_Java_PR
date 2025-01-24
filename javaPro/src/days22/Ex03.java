package days22;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "이찬희";
		int kor = 67, eng = 89, mat = 70;
		int tot = kor + eng+ mat;
		double avg = (double ) tot/3;
		boolean gender = true;
		
		// 위의 한 학생의 정보를 문자스트림( (FileWriter) -> 파일로 저장 ) 
		
		String fileName = "student.txt";
		
		                                     
		try (   
				FileOutputStream fos = new FileOutputStream(fileName);
				DataOutputStream dos = new DataOutputStream(fos);
				){ 
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		System.out.println(" END ");
		
	}
}

