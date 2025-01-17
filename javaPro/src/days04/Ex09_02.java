package days04;
/**
 * 
 * @author kenik
 * @date 2024. 12. 27. - 오후 4:27:38
 * @subject
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//while 1 + 2 + ... 9 + 10 = 55
		
		//int i = 1, sum = 0;
		
		
		
		int i = 1, sum = 0;
		while ( i <= 10 )
		{
			
			if( i % 2 == 0) 
			{
				i++;
				continue;
			}

				sum += i;
				i++;
		}
		
		System.out.printf("1 + 3 + 5...7 + 9 = ");
		System.out.printf("%d", sum);
		
		
		
		
		
		
		
	}
}
		/*
		while ( i <= 10 ) {
			
			
			
			if((i % 2) != 0) {
				sum += i;
				
			}
			++i;
			
			
			
			
			
			sum += i;
			++i;
			
			
		
		
		System.out.printf("1 + 3 + 5...7 + 9 = ");
		System.out.printf("%d", sum);
		
	}
}

}
*/
