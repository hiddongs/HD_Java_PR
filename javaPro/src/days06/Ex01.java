package days06;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> message input ? ");
		//message = sc.next();
		message = sc.nextLine();
		
		
		System.out.println("message : " + message);
		
		/* 입력한 문자열을 찍기 위해선 반복문이 더 효율적
		System.out.printf("'%c'\n", message.charAt(0));
		System.out.printf("'%c'\n", message.charAt(1));
		System.out.printf("'%c'\n", message.charAt(2));
		System.out.printf("'%c'\n", message.charAt(3));
		System.out.printf("'%c'\n", message.charAt(message.length()-1));
		*/
		
		
		char [] messageCharArr = message.toCharArray(); //문자열을 char 배열로 만들어주는 작업
		
		for(char c : messageCharArr) {
			System.out.printf("'%c'\n", c);
		}
	}

	
	
	
	
	
	
	

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
	
	
	/* 3번 풀이 및 추가 응용 문제 (5번째 라인은 엔터키 누르면 진행되게)
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
	
	
	*/

	
	 
	 
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
