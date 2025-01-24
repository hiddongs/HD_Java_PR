package days19;

import java.util.HashSet;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오후 4:18:29
 * @subject   List = ArrayList, Vector, LinkedList, Stack, PriorityQueue
 *                   , Queue, Deque
 * @content   Set - 중복허용 X, 순서유지 X
 *                  HashSet
 */
public class Ex12 {

	public static void main(String[] args) {
	
		HashSet<Integer> hs = new HashSet<>();
		hs.add(new Integer(9));
		hs.add(Integer.valueOf(1));
		hs.add(15); // 오토박싱  int  ->  Integer
		hs.add(20);
		hs.add(20);   // 
		hs.add(20);   // 
		hs.add(null); // 
		
		
		// [1, 20, 9, 15]
		// 20 1개 중복허용 X
		//        순서 유지가 안되는 중
		System.out.println(hs);
		
		System.out.println(" end ");
		

	}

}