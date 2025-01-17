package days10;

public class Ex03_02 {

	public static void main(String[] args) {
		
		/*
		 * // 2차원 배열 행 열 int [][] m = new int[2][4];
		 */
		
		
		//2차원 배열 초기화
		int [][] m = new int[][] {
				{1,2,3,4},{5,6,7,8}
				
		}; 
		/*
		 * 그러나int [][] m = new int[2][4] { {1,2,3,4},{5,6,7,8} }; //초기화할 떄 열과 행을 넣으면 오류 남
		 */
		dispArr(m);
		
		//메인 함수에서 리턴을 쓰면 곧 프로그램을 끝내겠다는 의미가 크다.

	}
/*
	private static void dispArr(int[][] m) {
		
		
		System.out.println(m.length); //행 개수
		System.out.println(m[0].length); //열 개수
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++)
			{
				System.out.printf("m[%d][%d] = %d ", i,j,m[i],m[j]);
			}
			
			System.out.println();
		}
		
		return ; //굳이 리턴한다는 거는 이 함수를 강제 종료라고 생각하면 좋다
		
		
	}
*/

	private static void dispArr(int[][] m) {
		// TODO Auto-generated method stub
		
	}
}
