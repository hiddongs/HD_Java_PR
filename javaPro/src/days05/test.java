package days05;

import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * System.in.read();-> 이거를 지우고 싶은 만큼 더 써준다
		
		//1. 국어 점수를 10개 저장할 kors 배열을 선언하고, 
		//  임의의 국어점수 (0~100 점)로 초기화하고 
		//   foreach문을 사용해서 출력하세요. -> foreach문은 값을 읽어오기 용도 값 할당 x
		
		
		/* 1번
		
		int [] kors = new int[10];
		
		//입력
		
		// 1 - 2
		
		int maxKor = -1;
		for (int i = 0; i < kors.length; i++)
		{
			kors[i] = (int)(Math.random() * 101);
			maxKor = Math.max(maxKor, kors[i]);
			
		}
		
		//출력
		for (int kor : kors) {
			System.out.println(kor);
			
			
			
		}
		System.out.println("=".repeat(50));
		System.out.printf("max = ", + maxKor);
		
		*/
	
		/* 2번
		int lineNum = 1;
		for (int i = 0; i < 256; i++) {
			if(i % 15 == 0) 
				System.out.printf("%d : ", lineNum++);
			
			System.out.printf("[%c]", (char) i);
			if(i % 15 == 14)
				System.out.println();
		} //main
		*/
		//5줄만 출력 후 멈추기 엔터치면 넘어가게
		
		Scanner sc = new Scanner(System.in);
		int lineNum = 1;
		for (int i = 0; i < 256; i++) {
			if(i % 15 == 0) {
				System.out.printf("%d : ", lineNum++); 
				
			}
			    
			System.out.printf("[%c]", (char) i);
			if(i % 15 == 14) {
				System.out.println();
				if (((lineNum - 1) % 5) == 0) //-> 여기서 if ((lineNum % 5) == 0) 이대로 두면 위에 linenum++ 후위 증감 때문에 4번째 라인으로 나온다
					                    // 해결법 1) (lineNum - 1) % 5 을 하던가 해결법 2) 후위 연산을 나중에 하면 된다
				{
					System.out.println("계속 출력하시려면 엔터키를 치세요.");
					System.out.println();
				
				}
			}
		} 
		
	
		
		 
		 
		/*   
		String message;
		System.out.println("> message input ? ");
		
		Scanner sc = new Scanner(System.in);
		message = sc.next();
		for(int i = 0; i < message.length(); i++ )
		{
			System.out.print( message.charAt(i));
		}
		
		
		*/
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	//1. 국어 점수를 10개 저장할 kors 배열을 선언하고, 
	   임의의 국어점수 (0~100 점)로 초기화하고 
	   foreach문을 사용해서 출력하세요.

	1-2. 위의 국어 점수 중 가장 큰 값을 찾아서 출력하세요.   
	     
	2. ASCII 문자코드값을 0~255 아래와 같이 출력하세요.
	  조건1) 한 라인에 15개씩 출력
	  조건2) 앞에 라인번호 붙이기..
	  
	
	  

	3. 문자열 메시지를 입력받아서 입력받은 문자열의 한 문자씩 출력하세요. 
	    String message;
	    예) 
	    [입력형식]
	     > message input ? hello world ~
	     [출력형식]
	     'h'
	     'e'
	     'l'
	     'l'
	     ' '
	     'w'
	     'o'
	     'r'
	     'l'
	     'd'
	     ' '
	     '~'

	4. 아래와 같은  별찍기  중첩 for 문  사용해서 코딩하고,  [ 처리 과정 ] X 에 대해서 설명하세요.
		 // ****
		 // ****
		 // ****
		 // ****

	4-2. 아래와 같은  별찍기  중첩 for 문  사용해서 코딩하고,  [ 처리 과정 ] X 에 대해서 설명하세요.
		 // *
		 // **
		 // ***
		 // ****   	        

	5. 두 정수 x, y을 입력받아서 두 정수 사이의 합 출력.  
*/
	
	
	
	//256 "[%d('%c')]\n"
	////System.in.read(); 얘를 쓰면 엔터키 -> \n, \r도 버퍼에 남아있어서 글자ㅏ 하나 입력하면 다음 글자 입력이 안된다
	/*해결법 1)
	 * 
	 * System.in.read();-> 이거를 지우고 싶은 만큼 더 써준다
	 * 
	 * 해결법 2)
	 * 
	 * 스킵함수를 사용한다
	 * System.in.skip(건너뛸 갯수);
	 * 그리고 아예 한글자 뒤에 다 지우고 싶으면
	 * System.in.skip(system.in.available()); 이게 더 유용하다
	 */
	
	//string regex = "[^a-zA-Z0-9\\s]";
	
			//가 힣 
}
