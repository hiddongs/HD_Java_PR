package days10;

import java.util.Scanner;

/**
 * 
 * @author kenik
 * @date 2025. 1. 8. - 오후 3:13:27
 * @subject 검색(search)
 * @content  ㄴ 항목의 집합 중에 특정 항목을 찾아낸 것.
 *          1) 순차 검색 (sequence search)
 *          2) 이진 검색 (binary search) 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열에서 찾을 정수 입력");
		int n = sc.nextInt();
	    
		
		//찾는 정수가 없을 경우에는 -1 반환하도록 정했다.
		int index = sequenceSrearch(m, n); //매개변수 배열 m에서 n이라는 숫자를 찾아라
	
		if(index != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있다",n,index);
		}else {
			System.out.println("찾는 정수는 없다");
		}
	
	} //main

	private static int sequenceSrearch(int[] m, int n) {
		
		
		int index = -1;
		
		for (int i = 0; i < m.length; i++) {
			if( m[i] == n) {
				index = i;
			    break;
			}
		}
		
		return index;
		
		

	}
 
} //class
