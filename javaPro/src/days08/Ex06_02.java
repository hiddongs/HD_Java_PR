package days08;

public class Ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 10;
		int 몫,나머지;
		String s = "";
		while( n != 0 ) {
			몫 = n / 2;
			나머지 = n % 2;
			System.out.println(나머지);
			s += 나머지; // 제일 간단하고 좋은 로직 -> s = 나머지 + s; 그러나, 문자열을 + 로 연결하는 것은 절대 좋은 코드가 아니다
			n = 몫;
		}
		
		System.out.println(s); //0101 -> 1010
		System.out.printf("%016d" , 1010); //제일 좋은 코드 
		
		//좋은 코드는 보기 좋고 쉬운 코드
		
		
		/* 제일 좋은 로직
		 * 
		 * 
		 */
		
		
		/* 2번 로직
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		*/
		
		
		/* 1번 로직
		char [] sReverse = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			sReverse[s.length()-i-1] = s.charAt(i);
			
		}
		// char[] -> string 변환 
		String sr = String.valueOf(sReverse); //문자열 변환
		
		System.out.println(sr);
		*/
	}

}
