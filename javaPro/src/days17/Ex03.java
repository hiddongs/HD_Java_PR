package days17;

/**
 * 
 * @author kenik
 * @date 2025. 1. 17. - 오전 11:21:42
 * @subject String 불변
 * @content StringBuffer(동 X) / StringBuilder(동 O)
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// "a" + "a" + "a" + "a" 200000번  처리시간 체크

		// testString();
		testStringBuffer();
		System.out.println(" end ");
		
		
	}

	private static void testStringBuffer() {

		long start = System.nanoTime();

		StringBuffer sb = new StringBuffer("a");
		for(int i = 0; i < 2000000 ; i++) {
			sb.append("a");
		} // for i


		long end = System.nanoTime();
		System.out.printf("처리 시간 : %dns \n",(end - start));
	}

	/*
	// > 처리시간 처리 시간 : 2466898100ns 
	private static void testString() {
		
		long start = System.nanoTime();
		
		String sb = "a";
		for(int i = 0; i < 2000000; i++) {
			sb += "a";
		} // for i
		
		
		long end = System.nanoTime();
		System.out.printf("처리 시간 : %dns \n",(end - start));
	}
	*/
	
	
}
