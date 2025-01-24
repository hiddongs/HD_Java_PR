package days19;

import java.util.Stack;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오후 3:19:50
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// Stack의 부모 클래스는 Vector
		// empty(), push(), pop(), peek(), search()
		
		Stack s = new Stack();
		
		// LIFO
		s.push("양희동"); // 스택은 push로 써서 넣는다
		s.push("오재문");
		s.push("유예나");
		
        // s.search("홍길동");
		
		
		// s.get(1) X 이건 쓸 수 없다
		
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		/* 이것보단
		int len = s.size();
		for(int i = 0; i < len; i++) 
			System.out.println(s.pop());
		}
		*/
		
		// 이게 더 좋을듯
		System.out.println(s.isEmpty());
		System.out.println(s.empty());
		while(s.isEmpty()) { // 
			System.out.println(s.pop());
		}
		
		// String name = (String) s.pop();
		
		// peek 엿보다, 살짝 들여보다.
		String name = (String) s.peek();
		System.out.println(name);
		System.out.println(s.size());
	}

}
