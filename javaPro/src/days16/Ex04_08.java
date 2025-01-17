package days16;

public class Ex04_08 {

	public static void main(String[] args) {
		/*
		// String  -> char[]
		String name = "admin";
		char [] nameArr = name.toCharArray();
	
		// 2. char [] -> String 변환
		// name  = String.valueOf(nameArr);
		name = new String(nameArr);
		
		*/
		// 3.  String -> byte [] 변환
		String name = "admin";
		byte [] nameArr = name.getBytes();
		
		// 4. byte[] -> String 변환
		name = new String(nameArr);
		
		
		// InputStream
		// name.chars().forEach(i->System.out.println(i));
		
	
		System.out.println(name.hashCode());
	
		
		if(name.isEmpty()) {}
		if(name.length() == 0) {}
		
		// name.subSequence(0,0)
		// name.repeat(10)
		
		
	
	}

}
