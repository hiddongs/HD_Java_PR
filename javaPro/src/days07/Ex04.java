package days07;

public class Ex04 {

	/**
	 * 
	 * @param args
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 재귀 [호출] 함수 ? 함수 안에서 자기 자신을 다시 호출하는 함수
		disp(); //함수 호출 부분


	}

	//재귀 함수 
	private static void disp() {
		
		System.out.println("disp() 메소드 호출됨...");
		disp(); //Exception in thread "main" java.lang.StackOverflowError

	}

}
