package days09;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 * @author kenik
 * @date 2025. 1. 7. - 오후 2:19:12
 * @subject 정렬(sort) (시험)
 * @content 특정 기준에 맞게 데이터를 열거하는 알고리즘
 * 
 *          예) 성적순, 나이순 등등
 *          
 *             오름차순 정렬([Asc] ending Sort)
 *             12345
 *             내림차순 정렬([Desc] ending Sort
 *             54321
 *             
 *             버블정렬, 선택정렬, 삽입정렬, 병합정렬, 쉘 정렬
 *             
 *             
 *             
 *             
 */            
public class Ex06 {

	public static void main(String[] args) {
		// 버블정렬(bubble sort)
		// 인접한 두 원소를 검사하며 정렬하는 알고리즘
		// 두 개의 인접한 자료 값을 비교하면서 위치를 교환하는 방식으로 정렬하는 방법

		//ASC 오름차순



		int [] m = { 3,5,2,4,1};
		System.out.println(Arrays.toString(m));

		bubbleSort(m);


		//selectionSort(m);
		//selectionSort2(m);
		System.out.println(Arrays.toString(m));

	}

	private static void selectionSort2(int[] m) {
		//  3,5,2,4,1
		// [0]
		//  1,5,2,4,3

		//   [1]
		//  1 2 5 4 3

		//  1  [2]
		//  1 2 3 4 5

		//       [3]
		//  1 2 3 4 5

		//가장 작은 값을 []여기다 넣기

		int index = 0;
		
		for(int i = 0, minIndex; i < m.length-1; i++) {
			
			minIndex = i;
			for(int j = i + 1; j < m.length; j++)
			//System.out.printf("[%d]\n", i);
			if(m[minIndex] > m[j]) {
				minIndex = j;
			}
			
			System.out.println("minIndex = " + minIndex);
			if( i != minIndex) {
				int temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;
			}
			System.out.println(Arrays.toString(m));
			
			
		  }

		}
	

		private static void selectionSort(int[] m) {
			// TODO Auto-generated method stub
			//0-1 0-2 0-3 0-4
			//1-2 1-3 1-4
			//2-3 2-4
			//3-4

			for(int i =0; i <= 3; i++) {
				for (int j = i+1; j <= 4; j++) {
					System.out.printf("%d-%d\t",i,j);

					if(m[i] > m[j]) {

						int temp = m[i];
						m[i] = m[j];
						m[j] = temp;

					}

				}
				System.out.println();
			}


			/*if(m[j] > m[i]) {

					int temp;
					temp = m[i];
					m[j] = temp;

				}*/


		}
		private static void bubbleSort(int[] m) {
			// 0-1 1-2 2-3 3-4
			// 0-1 1-2 2-3
			// 0-1 1-2
			// 0-1
			for(int i =0; i <= 3; i++) {
				for (int j = 0; j <= 3-i; j++) {
					System.out.printf("%d - %d\t",j,j+1);
					if(m[j] < m[j+1]) {

						int temp;
						temp = m[i+1];
						m[j+1] = temp;

					}

				}
				System.out.println();
			}

		}



	}
