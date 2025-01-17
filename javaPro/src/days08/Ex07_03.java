package days08;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author kenik
 * @date 2025. 1. 6. - 오후 5:16:58
 * @subject 배열은 크기가 부족할 경우에 배열의 크기를 3 증가시켜서 처리...구현
 * @content [문제]
 * 
 */
public class Ex07_03 {

	public static void main(String[] args) throws IOException {

		int [] m = new int [3];               //m[0] ~m[2]
		//배열의 각 요소를 -1 값으로 초기화         // 아래첨자값 LowerBound
		// 윗첨자값 UpperBound



		Arrays.fill(m, -1);

		int index = 0;
		char con = 'y';


		Random rnd = new Random();

		do {

			m[index++] = rnd.nextInt(100); 
			System.out.printf("> 배열(%d) 계속 초기화할거냐?", index);
			con = (char) System.in.read();
			System.in.skip(System.in.available()); 

		} 
		while(Character.toUpperCase(con)=='Y' && index < m.length); //숫자보다 이게 더 낫다


		dispArr(m);
		System.out.println("배열이 다 찼습니다 더 늘리시겠습니까? ");
		con = (char) System.in.read();
		if((Character.toUpperCase(con)=='Y'))
		{
			System.in.skip(System.in.available()); 
			addArr(m);

		}else
		{
			System.in.skip(System.in.available()); 
			return;
		}
		
		

	}

	private static void dispArr(int[] m) {


		for(int i = 0; i < m.length; i++) {

			System.out.printf("m[%d]=%d\n",i,m[i]);
		}

	}


	private static int addArr(int[] m){

 
		Random rnd = new Random();
		int [] n = Arrays.copyOf(m, m.length + 3);

		m = null;
		
		for(int i = 0; i < n.length; i++) {

			System.out.printf("m[%d]=%d\n",i,n[i]);
		}
		
		return n.length;
	
	}
	private static int addArrValue(int [] m, int index) {
		
		
		
		return index;
		
	}

}
