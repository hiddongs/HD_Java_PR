package days09;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 
 * @author kenik
 * @date 2025. 1. 7. - 오후 3:47:57
 * @subject (시험) 암기
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] m = new int[100];

		// 0 <= 정수 < 9

		Random rnd = new Random();

		// [1]
		for(int i  = 0; i < m.length; i++) {

			m[i] = rnd.nextInt(10);
		} 


		//m = IntStream.generate(()-> rnd.nextInt(10)).limit(100).toArray();


		System.out.println(Arrays.toString(m));
		// [문제]
		// 0 갯수 : 5개
		// 1 갯수 : 15개
		// : 
		// 9 갯수 : 20개
		
		//[문제] 
		//0=0 1=0...9=0
		
		int [] countArr = new int[10];
		
		for(int i = 0; i < m.length; i++)
		{
			int index = m[i]++;
			countArr[index]++;
			//countArr[m[i]]++;
		}
		
		System.out.println(Arrays.toString(countArr));
		/* 결과는 나오지만 성능 이슈

		for(int j = 0; j <= 9; j++) {
			
			int cnt = 0;
			for(int i = 0; i < m.length; i++) {
				if(m[i] == j)
					cnt++;
			}
			System.out.printf("%d : %d개\n",j, cnt);
		}
		
		*/
		
		/*
		for(int i = 0; i < m.length; i++) {
			if(m[i] == 0)
				cnt++;
		}
		System.out.printf("0 갯수 : %d개", cnt);
*/
		

		

	}

}
