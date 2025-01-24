package days19;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오후 2:26:11
 * @subject    LinkedList( 링크드 리스트 ) 컬렉션 클래스 
 * @content
 *         1. 배열
 *            (단점) 
 *            - [][][][][][][]..10 자동크기 조절 X 
 *            - 비 순차적인 데이터를 삽입 / 삭제 성능 떨어진다. 
 *            (장점) 읽기 성능이 가장 빠르다.
 *            
 *            
 *         2. 링크드리스트
 *             (특징) 비연속적이다. 성능은 배열보다 우수하다 메모리를 연속적으로 안 잡기 때문에
 *
 *           환영 링크드리스트 구조
 *
 *           단방향 링크드리스트 구조
 *           양방향 링크드리스트 구조 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		
		//단방향 링크드 리스트
	
		// node 1 - node 2 - node 3 - node 4
		Node node1 = new Node();
		node1.value = 10;
		Node node2 = new Node();
		node1.value = 20;
		
		Node node3 = new Node();
		node1.value = 30;
		
		Node node4 = new Node();
		node1.value = 40;
		
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		
		Node node  = node1;
		while(node != null) {
			System.out.println(node.value);
		}
		/*
		//[문제] 
		// 노드 2와 노드 3사이에 노드 5 추가(삽입) 코딩하세요
		
		Node node5 = new Node();
		node5.value = 50;
		node2.next = node5;
		
		// node1 - node2 - node5- node4
				// node3 삭제
		node5.next = node3;
		*/
		
		// 가장 마지막 node 4 삭제
		
	
		
		
		
		

	} // main

} // class


// 노드 = 하나의 데이터 값을 가지는 객체
class Node{ 
	
	
	int value = 0; //
	Node next = null;
	// Node prev;
	
	
	
}
