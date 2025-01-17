package days09;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author kenik
 * @date 2025. 1. 7. - 오전 10:23:32
 * @subject 
 * @content
 */
public class Ex02 {

		public static void main(String[] args) throws IOException {

			int [] m = new int [3];               //m[0] ~m[2]
			//배열의 각 요소를 -1 값으로 초기화         // 아래첨자값 LowerBound
			// 윗첨자값 UpperBound



			Arrays.fill(m, -1);

			int index = 0;
			char con = 'y';


			Random rnd = new Random();

			do {
				
				/*
				if(index == m.length) {
					int [] temp = new int [m.length + 3];
					
					for(int i = 0; i < m.length; i++) {
						temp[i] = m[i];  //m 배열을 temp 배열에 복사하는 작업
					} //for
					m = temp;
				}// if

				//[][][] + [][][] -> m은 이제 공간이 3개가 늘어난 배열 기존 배열은 힙영역에서 쓰레기 값으로 존재하기 때문에 덮어써서 삭제
				
				m[index++] = rnd.nextInt(100); 
				System.out.printf("> 배열(%d) 계속 초기화할거냐?", index);
				con = (char) System.in.read();
				System.in.skip(System.in.available()); 

               */
				
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
