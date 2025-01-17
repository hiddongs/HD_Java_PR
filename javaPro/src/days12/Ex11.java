package days12;

/**
 * 
 * @author kenik
 * @date 2025. 1. 10. - 오후 4:33:09
 * @subject [가변인자 (variable arguments)]
 * @content jdk1.5 메서드의 매개변수의 갯수가 고정 -> 동적 지정할 수 있다.
 */
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Ex11.sum(1,2));
		
		int [] m = {1,2,3,4,5,6,11,33,3};
		System.out.println(Ex11.sum(m));
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	// 계속 오버로딩을 하기엔 힘들지 않은가? 어떤 방법이 있을까
	
	public static int sum(int [] args) {
		int result = 0;
		for (int i = 0; i < args.length; i++) {
			
			result += args[i];
		}
		return result;
	}

}
