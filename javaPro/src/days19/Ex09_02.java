package days19;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오후 3:34:06
 * @subject
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// Queue 구조 : FIFO
		
		// Queue q = new Queue(); queue는 인터페이스라 객체 생성이 new로는 안된다
		// offer() poll() isEmpty() peek()
		
		
		// List 인터페이스
		// Deque -> Queue 인터페이스
		Queue q = new LinkedList();
		q.offer("양희동");
		q.offer("초지우");
		q.offer("이찬희");
		
		/*
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.poll());

		System.out.println(q.size());
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		*/
		
		while( !q.isEmpty() ) {
			System.out.println(q.poll());
		} // while
		
		System.out.println(" end ");
	} // main

} // class
