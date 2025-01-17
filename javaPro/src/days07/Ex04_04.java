package days07;

/**
 * 
 * @author kenik
 * @date 2025. 1. 3. - 오후 2:33:40
 * @subject 합, 팩토리얼, 
 * @content 거듭제곱 == 누승 == 멱 == pow(power)
 * 
 *          2 ^ 3 = 2*2*2 = 8
 *          밑  지수
 *          밑수를 지수만큼 반복해서 곱하는 것.
 */


public class Ex04_04 {

	public static void main(String[] args) {
	//재귀 함수 마지막 예제	
		
		//int result  = pow(2,3);
		//double result = pow(2, -3);
		double result = recursivePow(2,-3);
		
		System.out.println(result);

		
	}

	//This method must return a result of type double -> 리턴값이 없어서 생기는 오류
	private static double recursivePow(int b, int e) {
		
		if( e < 0 ) return 1/ recursivePow(b,e);
	    else if (e == 1) {
			return b;
		}
		else {
			return b * recursivePow(b, e-1);
		}
	}
/*
	private static double pow(int b, int e) {
		// TODO Auto-generated method stub
	
		if (b == 0 && e != 0)
		{
			return 0;
			
		}else if(b == 0 && e == 0) {
			
			return 1;
		}
		
		if (e < 0) {
			
			return (1.0 / pow(b, -e));
		}
		
		double power = 1.0;
		for(int i = 0; i < e; i++) {
		     
			power *= b;
		}
		
		return power;
		
		
		
	}
*/
}
