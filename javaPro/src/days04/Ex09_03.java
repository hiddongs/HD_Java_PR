package days04;

public class Ex09_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for문으로 1부터 10까지 합 출력
		/*
		int sum = 0;
		
		for(int i = 1; i < 11; i++) //홀수 출력할때 if문 쓰지말고 증감식을 수정만 해주면 더욱 효율적인 코드가 될 수 있다. 집에서 해보기
		{	
			sum += i;
		}
		System.out.printf("1 + 3 + 5...+ 9 + 10 = ");
		System.out.printf("%d", sum);
	*/	
		int sum = 0;
	    int i = 1;
		while(i < 11) 
		{
		 
			 
		     sum = sum + i;
		     i += 2;
			 
			 
		}
		System.out.printf("1 + 3 + 5...7 + 9 = ");
		System.out.printf("%d", sum);
		
		
	}

}
