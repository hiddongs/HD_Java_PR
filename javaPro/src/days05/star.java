package days05;



/*
 * 
 *        // 1번 문제
            // *
            // **
            // ***
            // ****

            // 2번 문제
            // ****
            // ***
            // **
            // *
            
            // 3번 문제
            // ___*
            // __**
            // _***
            // ****


            // 4번 문제
            // ****
            // _***
            // __**
            // ___*

            // 5번 문제 ( 이등변 삼각형 )
            // __*
            // _***
            // *****


            // 6번 문제( 마름모 )
            // __*
            // _***
            // *****
            // _***
            // __*

            // 7번 문제  Ex05_07.java
            // *
            // _*
            // __*
            // ___*
            // ____*

            // 8번 문제  Ex05_08.java
            // ____*
            // ___*
            // __*
            // _*
            // *

            // 9번 문제  Ex05_09.java
            // *___*
            // _*_*
            // __*
            // _*_*
            // *___*
 * */
public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 4; i >=1; i--) {
			
		    for(int j = 1; j < i; j++) {
		    	System.out.print("*");
		    }System.out.print("*\n");
		}
		
		
		/*
		2번 결과
		*
		**
		***
		****
        */ 
	}
}
