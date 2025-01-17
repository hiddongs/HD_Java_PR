package days06;

public class Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		for (int k =1; k <=3; k++) {
			for (int i = 1; i <= 9; i++) {
				for(int j = 4 * k -2; j <= 4 * k - 2 + 3; j++)
				{
					System.out.printf("%d * %d = %02d\t", j, i , i*j);
				}
				System.out.println();
				
			}
		}System.out.println();
		*/
		//2단 3단 4단
		//5단 6단 7단
		//8단 9단
		
		for (int k =1; k <=3; k++) {
			for (int i = 1; i <= 9; i++) {
				//for(int j = 3 * k - 1; j <= 3 * k - 1 + 2 && j <=9; j++)//첫 번쨰 방법
				for(int j = 3 * k - 1; j <= 3 * k - 1 + 2; j++)
				{ 
					//if(j == 10) continue; //두 번째 방법
					//if(j ==10) break; //세 번째 방법
					if(j == 9) {
						continue;
					}
					
					
					System.out.printf("%d * %d = %02d\t", j, i , i*j);
				}
				System.out.println();
				
			}
		}System.out.println();
	}

}
