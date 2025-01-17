package days06;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//[문제] 1-2+3-4+5-6+7-8+9-10=5
		
		

		/*int result = 0;
		for(int i = 1; i <= 10; i++)
		{
			if((i % 2) == 0) {
				result -= i;
				
				
			}else
				result += i;
			
		}
		System.out.printf("1-2+3-4+5-6+7-8+9-10 = %d", result);
	}
	*/
		
		//스위칭변수를 선언하는 것이 좋은 코드다
		/*
		int result = 0;
		boolean sw = false;
		for(int i = 1; i <= 10; i++)
		{
			if(sw)//(sw == true)
			{
				result -= i;
				
				
			}else
				result += i;
			sw = !sw;
		}
		System.out.printf("1-2+3-4+5-6+7-8+9-10 = %d", result);
		
		*/
		
		
		//제일 간결하고 좋은 코드 내일 시험은 무조건 이렇게
		int result = 0;
		boolean sw = false;
		for(int i = 1; i <= 10; i++)
		{
		    System.out.printf(sw ? "%d+" : "%d-", i);
		    result += sw? - i: + i;
		    sw = !sw;
		}

		System.out.printf("1-2+3-4+5-6+7-8+9-10 = %d", result);
		 
		 
		
		
	}

}
