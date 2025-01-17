package days12;

public class Ex11_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.out.printf("%s_%d_%.2f_%c_%b","이름",20,3.14,'A',false,"홍길동" );
		
		
		*/
		
		
		/*
		 *  [가변 인자를 사용할 때 주의할 점]
		 *  - 가변인자는 내부적으로 배열을 사용
		 *  - 오버로딩을 하지 않는 게 좋다.
		 *  - 비효율적이다. ( 꼭 필요한 곳에만 사용 )
		 *  -
		 *  
		 *  
		 */
		
		String [] names = {
				"홍길동",
				"김민곤",
				"이찬희",
				"오재문"
		};
		
		// "이름" - "이름" - "이름"
		// 구분자(구분기호)
		// 이름 문자열을 연결...
		System.out.println(concateNames("-", names));
		System.out.println(concateNames("/", "aaa", "bbb","ccc"));
	}

	private static String concateNames(String delimiter, String... args) {
		
		/*
		String result = "";
		
		for(int i = 0; i < args.length; i++) {
			
			result += args[i] + delimiter;
		}
		return result;
		*/
		return String.join(delimiter, args); //위에 코드 줄인 코드
	}

}
