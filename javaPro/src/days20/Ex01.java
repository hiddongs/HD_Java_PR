package days20;

import java.util.LinkedHashSet;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 중복허용 X 순서유지 O 하고 싶을 때
		LinkedHashSet<Integer> set = new LinkedHashSet<>(); // [3, 5, 2, 4, 1]  넣은 순서 유지하고 싶을 때
		//HashSet<Integer> set = new HashSet<>();  // [1, 2, 3, 4, 5]
		
		set.add(3);  // 래퍼클래스이지만 3을 넣을 수 있는 이유 -> 오토 박싱
		set.add(5);  // auto boxing
		set.add(2);  // auto boxing
		set.add(4);  // auto boxing
		set.add(1);  // auto boxing
		set.add(1);  // auto boxing
		
		System.out.println(set);
		
		// [1, 2, 3, 4, 5]
        // 내가 넣은 순서로도 안 나오고 중복도 허용이 안됐다.
	} 

}
