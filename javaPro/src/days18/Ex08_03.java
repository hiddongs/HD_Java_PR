package days18;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		String source = "이름:홍길동, 나이:20살, 성별:여자";
		String name = null;
		int age = 0;
		boolean gender = false;
		

		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		
		
		try {
			Object [] objArr = mf.parse(source);
//			for(Object v : objArr) {
//				System.out.println(v);
//			} // foreach
			
			name = (String) objArr[0];
			age = Integer.parseInt(objArr[1]+"");
			String genderStr = (String) objArr[2];
			gender = "여자".equals(genderStr);
			// age
			// gender
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
		
	}
	
	
	

}
