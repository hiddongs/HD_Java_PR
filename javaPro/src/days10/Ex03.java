package days10;
/**
 * 
 * @author kenik
 * @date 2025. 1. 8. - 오후 2:26:35
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 각 자료형의 기본값으로 초기화 되어져 있다(기억)
		// int 기본값 : 0
		// boolean [] n = new boolean[3]; false
		// String [] n = new String[3]; null
		
		
		
        //1차원 배열
		int [] m  = new int[3];   // == int [] m = { 1,2,3}; 같은 표현이면서 초기화까지 하는 것
		m[0] = 1;  //초기화ㅣ
		m[1] = 2;  
		m[2] = 3;
		
	    
		//int [] m = new int[] {1,2,3};
		
		
		
		
		
		dispArr(m);
		
		
		
	}

	private static void dispArr(int[] m) {
		
		System.out.println(m.length);
		
		for(int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d ", i, m[i]);
		}
		
	}

}
