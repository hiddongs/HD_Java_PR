package days05;

import java.util.Arrays;

public class Ex01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] m = new int[10];
		
		for (int i = 0; i < m.length; i++) {
			
			m[i] = (int) (Math.random() * 101);
			System.out.printf("%d번 방 = %d\n",i + 1, m[i]);
		}
		//배열값을 확인 Arrays.class : 배열을 사용하기 쉽도록 기능이 구현된 클래스
		
		System.out.println(Arrays.toString(m));

		int max = m[0];
		int min = m[0];
		for (int i = 1; i < m.length; i++) {
			
			max = Math.max(max,  m[i]);
			min = Math.min(min,  m[i]);
			
		}
		System.out.printf("max = %d ", max);
		System.out.printf("min = %d ", min);
	}

}
