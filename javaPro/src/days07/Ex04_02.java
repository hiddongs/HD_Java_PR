package days07;
/**
 * 
 * @author kenik
 * @date 2025. 1. 3. - 오후 2:10:54
 * @subject
 * @content 재귀 함수
 */
public class Ex04_02 {

	public static void main(String[] args) {

//      int result = sum(10);
		int result = recursiveSum(10);
//                   10 + 9 + 8 + 7 + ... + ... 1 = 55
		System.out.println(result);
		
	}
    //재귀 함수 (암기) -> 그치만 가능하면 안 쓰는 게 낫다.(성능 이슈) 다만, 파일 검색, 트리구조에서 많이 씀
	private static int recursiveSum(int n) {
		// TODO Auto-generated method stub
		if( n == 1 ) {
			return n;
		}else {
			return n + recursiveSum(n - 1);
		}
		

	}

	
	
	private static int sum(int n) {
		//1부터 n 까지의 합을 구해서 반환하는 메소드
		int result = 0;
		for(int i = 1; i <= n; i++) {
			
			result += i;
		}
		return result;
	}

}
