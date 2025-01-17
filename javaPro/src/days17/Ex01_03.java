package days17;

public class Ex01_03 {

	public static void main(String[] args) {
		
		String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String word = "홍길동";
		
		int wordLength = word.length();
		int fromIndex = 0; // 찾기 시작 위치
		int index = -1;    // 찾은 위치
		int cnt  = 1;
		
		// 2번째 찾았을 때의 위치만 저장.
		int start = -1;
	    int end = start + wordLength;
		
		while((index = data.indexOf(word, fromIndex)) != -1) {
			
			System.out.printf(" > %d번째 찾은 위치 : %d\n" , cnt, index);
			fromIndex = index + word.length();
			if( cnt == 2 ) {
				start = index;
			    end = fromIndex;
			}
			cnt++;
		
			
		} // while
		
		
		//String -> StringBuffer 변환 (이유)
		StringBuffer sb = new StringBuffer(data);

		System.out.println(sb);
		
		// int start = 19;
		// int end = 19 + wordLength;
		sb.replace(start, end, "양희동");
		
		String cdata = sb.toString();
		System.out.println(cdata);
		
		
	}

}
