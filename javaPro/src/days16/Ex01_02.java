package days16;


import java.io.BufferedReader;
import java.io.FileReader;

public class Ex01_02 {

	public static void main(String[] args) {
	
	
		
		String fileName = ".\\src\\days15\\Ex01.java";
	
		int one;
		
		int lineNum = 1; 
	
		try(FileReader reader = new FileReader(fileName);) {
			System.out.printf(" %d : ", lineNum++);
			// End of File == EOF
			while((one = reader.read()) != -1) {
				System.out.print((char)one);
				if(one == 10) {
					System.out.printf(" %d : ", lineNum++);
				}
			} // while
			
			
		} catch(Exception e) {
			System.out.println(e.toString());
		} // try ~ catch
		
	
		
		int lineNumber = 123456;
		
		System.out.println(" end ");
	}

}
