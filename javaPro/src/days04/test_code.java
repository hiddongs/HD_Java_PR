package days04;

public class test_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 0;
		
		while(i < 10)
		{
			System.out.printf("%02d - 헬로우 월드\n", i + 1);
			++i;
		}
	}
	}
		/*
  
		int [] kors = new int[10];
		
		for(int i = 0; i< kors.length; i++) {
			
			kors[i] = (int) (Math.random() * 100);
			
			
			System.out.printf("학생 %d 의 국어 점수는 : %d\n", i + 1	, kors[i]);
			
			
		}
*/		
		//어디가 문제인지 궁금합니다!
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
		//인덱스 값이 범위 밖이라고 하는데 저는 잘 올려준 것 같은데 이유를 모르곘습니다!
		
        //-> 내 코드의 문제는 무한루프가 발생한다 왜냐 0-9방까지 있는데 10번째 방이 없는데 나오라고 하고 심지어 루프 조건문도 참이라 생기는 문제 일단 초기값과 루프 범위의 문제
		/*
		 public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i  = 1; i <= 10; i++) {
		
		System.out.printf("%02d - 헬로우 월드\n", i + 1);
		
		
		
		
		
		
		}
		
	}


*/
