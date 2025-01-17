package days07;

public class Ex04_03 {

	public static void main(String[] args) {
		//팩토리얼(factorial) == 계승
		//   정의) 1에서 양의 정수의 곱
		// n! = n * (n-1) * (n-2) *...*1
		// 5! = 5*4*3*2*1
		// 0! = 1 (약속)
		
		
		int n = 0; // int n = 0; -> Exception in thread "main" java.lang.StackOverflowError 
		           //               오류) 메모리에 가득찼다. 
		// int result = factorial(n);
		int result  = recursiveFactorial(n);
		System.out.println(result);

	}

	private static int recursiveFactorial(int n) {
		
		if (n == 1 || n == 0) {
			
			return 1;
			
			
		}else
		{
			return n * recursiveFactorial(n - 1);
		}
		// TODO Auto-generated method stub
		
	}
	/*

	private static int factorial(int n) {
		int result = 1;
		for (int i  = n; i >= 1; i--) {
			result *= i;
			System.out.printf("%d*", i);
		}
		return result;
	}
*/
}
