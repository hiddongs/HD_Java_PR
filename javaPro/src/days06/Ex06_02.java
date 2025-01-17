package days06;

public class Ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //[문제] 1/2-2/3+3/4-4/5+...-8/9=???
		//결과는 실수로
		//(1/2)-(2/3)+(3/4)-(4/5)+...-(8/9)=???
		
		double sum = 0;
		boolean sw = false;
		for(int i = 1; i < 9; i++) {
			
			
			System.out.printf("(%d / %d)" +(sw ? "+" : "-") ,i, i+1);
			if( !sw ) {
				sum += (double) i/(i+1);
				
			}else
			{
				sum -= (double) i/(i+1);
			}
			
			sw = !sw;
			}
			System.out.printf("\b=%f\n", sum);
			
		}
		
	}


