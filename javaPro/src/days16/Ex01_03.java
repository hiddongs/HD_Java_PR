package days16;


import java.io.BufferedReader;
import java.io.FileReader;

public class Ex01_03 {

	public static void main(String[] args) {
	
	
		
		String fileName = ".\\src\\days15\\Ex01.java";
	
		int one;
		
		int lineNum = 1; 
	
		try(FileReader reader = new FileReader(fileName);) {
			System.out.printf(" %d : ", lineNum++);
			// End of File == EOF
			while((one = reader.read()) != -1) {
				System.out.print((char)one);
				if(one == 10 && reader.ready()) {
					System.out.printf(" %d : ", lineNum++);
				}
			} // while
			
			
		} catch(Exception e) {
			System.out.println(e.toString());
		} // try ~ catch
		
		// 46_:_
		
		int lineNumber = 123456;
		// int String 변환
		// (lineNumer+"").length() --> 6
		// new String(lineNumber)
		// String.valueOf(lineNumber)
		// "\b",repeat(5) ***
		
		/*
		
		 int lineNumber = 1234567;      
	      int numberOfDigits = 1;      
	      while((lineNumber/=10) !=0)    numberOfDigits++;
	      System.out.printf("%d의 자릿수\n", numberOfDigits);
		*/
		System.out.println(" end ");
	}

}
