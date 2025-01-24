package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays 클래스 - 배열 사용하기 쉽도록 기능(메서드)이 구현된 클래스
		// Collections 클래스 - 컬렉션을        "
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list);
		// Collection<? super T>, T...elements
		Collections.addAll(list, 1,2,3,4,5);
		
//      위에 방식이 더 좋다 아래보다
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
		
//		System.out.println(list);
		
		// 오른쪽 2칸씩 list 의 요소를 이동 ( 회전 )
//   	Collections.rotate(list, 2);
		
		/*
	      List<Integer> l1= list.subList(list.size()-2, list.size());
	      System.out.println(l1); [4, 5]
	      List<Integer> l2= list.subList(0, list.size()-2);
	      System.out.println(l2);   [1, 2, 3]   
	      
//	      list.set(0, l1.get(0));
//	      list.set(1, l1.get(1));
//	      list.set(2, l2.get(0));
//	      list.set(3, l2.get(1));
//	      list.set(4, l2.get(2));
	      
	      ArrayList<Integer> al = new ArrayList<Integer>();
	      al.addAll(l1);
	      al.addAll(l2);
	      System.out.println( al ); 
	      list = al;
	      System.out.println( list );
	      */
		/*
		for(int i = 0; i < 3; i++) {
			
			list.set(i , l1.get(i));
		
			
		}
		*/
		System.out.println(list);
		
		
		
		
		
		/*
		System.out.println(list);
		
		Collections.swap(list, 0, 2); // 위치 바꾸는 함수
		
		/* swap 함수를 안 썼을 때 로직 그러나, 함수를 이용하면 더 효율적이다.
		int temp = list.get(0);
		list.set(0, list.get(2));
		list.set(2, temp);
		System.out.println(list);
		*/
		
		// System.out.println(list);
		
		/* 섞기 작업
		Collections.shuffle(list);
		System.out.println(list);
		*/
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println(list);;
		
		// Collections.sort(list, Collections.reverseOrder());
		Collections.reverse(list);
		System.out.println(list);
		
		// Collections.fill(list, 100); 모든 요소를 하나로 통일할 때
		System.out.println(list);
		
		
		
		// Collections.copy(복사한 list2, 원본 list);
		
		// Collections.replaceAll(list,1,100);
		// 등등
		System.out.println(list);
		

	} // main

} // class
