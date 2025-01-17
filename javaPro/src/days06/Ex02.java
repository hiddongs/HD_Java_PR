package days06;

public class Ex02 {

	
	public static void main(String[] args) {
		
		//6번
		   /*
		    int n = 3; 
		    for (int i = 1; i <= n; i++) {
		        
		        for (int j = 1; j <= n - i; j++) {
		            System.out.print("_");
		        }
		     
		        for (int j = 1; j <= 2 * i - 1; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }*/
		    for(int i = 1; i <=3; i++){
		    	for(int j = 1; j <= 5; j++) {
		    		if(j-i <= 2 && i + j >= 4) System.out.print("*");
		    		else System.out.println("_");
		    	}
		       System.out.println();
		    }
		    /*
		     for (int i = n - 1; i >= 1; i--) {
		     
		        
		        for (int j = 1; j <= n - i; j++) {
		            System.out.print("_");
		        }
		        for (int j = 1; j <= 2 * i - 1; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
		  */
		
		//결과값을 적어두고 코딩해보기
		
		// ___*  i = 3 j = 1
        // __**  i = 2 j = 2
        // _***  i = 1 j = 3
        // ****  i = 0 j = 4
		
		
		// 4번 문제
        // **** i = 0 j = 4
        // _*** i = 1 j = 3
        // __** i = 2 j = 2
        // ___* i = 3 j = 1

		
		
		//
		/*
		for(int i = 1; i <= 4; i++) { //행갯수
			
			//공백 찍는 for문
			for(int j = 1; j <= i - 1; j++) {
				System.out.print("_");
			}
			
			for(int j = 1; j <= 5 - i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			//별 찍는 for문
		}
		*/
		
		
		  // 5번 문제 ( 이등변 삼각형 )
        // __*    i = 1 j = 2
        // _***   i = 2 j = 1
        // *****  i = 3 j = 0 
		          //3 - j  = i
		
		/*
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3 - i; j++) {
				System.out.print("_");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		*/
		
		 
	}
}
