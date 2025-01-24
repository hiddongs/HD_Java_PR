package days20;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;



/**
 * 
 * @author goddxmn
 * @date 2025. 1. 22. - 오전 10:22:44
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
	
		
		int [][] bingo = new int[5][5];
		
		// 1 ~ 25 정수를 중복되지 않게 2차원 배열에 채워넣기.
		
		Random rnd = new Random();
		LinkedHashSet<Integer> hs = new LinkedHashSet();

		// LinkedHashSet  -> int  [][] 
		// int [] -> int [][]
	
		
		 Iterator<Integer> ir = hs.iterator();
	      int i = 0;
	      while (ir.hasNext()) {
	         int n = ir.next();
	         bingo[i/5][i%5]=n;
	         i++;
	      } // while 

	      // 출력.
	      for (i = 0; i < bingo.length; i++) {
	         for (int j = 0; j < bingo[i].length; j++) {
	            System.out.printf("[%02d]", bingo[i][j]);
	         }
	         System.out.println();
	      }
	
	
		
		/*
		for (int i = 0; i < bingo.length; i++) {

			for(int j = 0; j < bingo[i].length; j++) {
				int num;
				
				do {
				num = rnd.nextInt(25)+1;                                                               
				}
				while(!hs.add(num)); {
					bingo[i][j] = num;
				}
				
			}
		}
		
		HashSet<String> set = new HashSet();
		for(int[] row : bingo)
		{
			set.add(Arrays.toString(row));
		}
		
	System.out.println(set);
		*/
		
	} // main

} // class
