package days09;

import java.util.Arrays;

/**
 * 
 * @author kenik
 * @date 2025. 1. 7. - 오전 10:46:59
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		// 1. 8 정수 배열에 마지막 요소로 추가 append
		//배열 크기 증가시크는 코드거 ㅇ우선
		//m[5] = 8;

     	
		// 2. index 2 번 삭제
		
		for (int i = 3; i < m.length; i++)
		{
			m[i-1] = m[i];
		}
		
		m[m.length - 1] = 0;
		System.out.println(Arrays.toString(m));
		
	
		
		
		//int [] temp = new int [4];
		//temp = Arrays.copyOf(m, m.length-1);
		//m = temp;
		//System.out.println(Arrays.toString(m));
		
		
		// 3. index = 2            배열 칸 한칸 늘리고 뒤로 값들 민 다임 2번째 자리에 100 정수 삽입
        int[] temp = new int[m.length + 1];
        System.arraycopy(m, 0, temp, 0, 2);
        System.arraycopy(m, 2, temp, 2+1, m.length - 2);
        temp[2] = 100;
        m = temp;
        System.out.println(Arrays.toString(m));
        
        m[2] = 200;
	   
	}
}


