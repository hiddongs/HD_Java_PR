package days09;

import java.util.Arrays;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] m = {1, 2, 3};
		int [] temp = new int[m.length + 3];
		
		
		// 2.           복사 원본, 복사 범위 초기값  , 복사할 곳 인자 값   , 원하는 복사 위치
		System.arraycopy(m, 0, temp, 0, m.length);
		
		m = temp;
		System.out.println(Arrays.toString(m));
		
		
		
		
		
		
		
		
		/*     1. Arrays.copyOf()
		int [] temp = Arrays.copyOf(m, m.length + 3);
		
		m = temp;
		
		System.out.println(Arrays.toString(m));
		*/

	}

}
