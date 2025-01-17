package days17;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * 
 * @author kenik
 * @date 2025. 1. 17. - 오후 2:11:38
 * @subject java.util 패키지
 * @content      ㄴ 자주 사용되는 유용한 유틸리티 (클래스)
 * 
 *         Arrays 클래스 - 배열을 사용하기 쉽도록 기능이 구현된 클래스
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		
		int [] m = {3,5,2,4,1};
		
		 // 기본형 int 배열 -> 스트림으로 -> 박싱 시키고 -> 배열로 만들기
		Integer[] n = ((IntStream) Arrays.stream(m)).boxed().toArray(Integer[]::new);
		
		/* [1]
		 Integer [] n = new Integer[m.length];
		 for (int i = 0; i < n.length; i++) {
			n[i] = m[i];
		}
		*/
		
		System.out.println(Arrays.toString(m));
		 
		/*
		Arrays.fill(m, -1);
		
		System.out.println(Arrays.toString(m));
		*/
		
		// 오름차순(asc) 정렬
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		
		// 내림차순 정렬
		// T[] t                <? super>
		// Arrays.sort(m, Collections.reverseOrder()); 
		// Collections.reverseOrder() 이걸 쓰러면 기본형을 Wrapper 클래스로 바꿔야 한다
		System.out.println(Arrays.toString(m));
		
		
		// [2] T[] t
		//     Integer[] n
		/*
		Arrays.sort(n, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			});
			
			*/
		
		// [3]
		/*
		Arrays.sort(n, (o1, o2) -> {
			
			return o2.compareTo(o1);
			});
        */
		
		// [4]            -> 람다연산자를 사용한 식 : 람다식
		
		Arrays.sort(n, (o1, o2) -> o2.compareTo(o1));
		
		System.out.println(Arrays.toString(n));
		
	} // main
 
} // class
