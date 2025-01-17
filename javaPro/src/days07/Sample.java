package days07;

public class Sample {

	// 함수 선언
	// 1. 기능 : 선을 기르기 drawLine 
	// 2. 매개변수 : X
	// 3. 리턴값 : X, void
	public static void drawLine() {

		System.out.println("--------------");
	}


	//Duplicate method drawLine() in type
	public static void drawLine(int n) { 


		System.out.print("-".repeat(n));
		System.out.println(); //개행

	}
	public static void drawLine(String style, int n) { 


		System.out.printf(style.repeat(n));
		System.out.println(); //개행

	}

}
