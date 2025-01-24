package days19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오전 9:42:57
 * @subject ArrayList 컬렉션 클래스  ( 배열의 단점을 없앤 것이기에 거의 얘를 쓰면 된다)
 * @content 1. 가장 많이 사용되는 컬렉션 클래스
 *          2. List 인터페이스 
 *          ***( 순서유지 O, 중복허용 O )***
 *          
 *          
 *          
 *          
 *      
 */

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		String [] names = new String[15];
		names[0] = "박정현"; 0번째 요소
		names[1] = "양희동"; 1번쨰 요소 (element)
        */ 
		
		// ArrayList 기본 생성자를 쓰면 초기 배열의 사이즈는 10개임 그래서 생성자로 더 늘려서 쓰면 된다
		// <E> E == Element == 요소 
		// 제네릭 문법 (Generics) X
		// <? extends E>
		ArrayList list  = new ArrayList(); //근데 사실 동적으로 관리해서 굳이 배열방 사이즈 설정 안해도 된다

		list.add("박예린");
		list.add("양희동");
		// list.add("주정호");
		list.add("박정현");
		list.add("김대원");
		
		// System.out.println(list.isEmpty()); // 배열이 비어있는지 확인하는 함수

		list.add(2, "주정호");
		System.out.println(list);
		// [박예린, 양희동, 주정호, 박정현, 김대원]
		
		System.out.println(list.size()); // 배열에 요소가 얼마나 들어가있는지 확인하는 함수

		
		list.trimToSize(); // 배열에서 남는 방을 지우는 것. 메모리 관리를 위해서 
		
		// System.out.println(list.contains("이찬희")); // boolean 함수

		int index = list.indexOf("주정호");
		System.out.println(index);
		
//		// [2]
//		list.set(index, "이찬희");
//		System.out.println(list);

		// list.parallelStream(); //  병렬적으로 일하는 함수 효율을 위해
		
//		[1]
//		list.remove(index); // 주정호 님 삭제
//	    list.add(2, "이찬희"); // 2번쨰 방에 이찬희 님 추가
//	    index = list.indexOf("이찬희"); // 이찬희 님 위치 확인
//	    
//	    
//	    System.out.println(list);
	
		list.add("박정현"); // 중복허용 O
		System.out.println(list); 
		
		// [박예린, 양희동, 주정호, 박정현, 김대원]
		
		// [문제] 박씨 성을 가진 학생을 제거
		/*
		list.removeIf(new Predicate<String>(){

			@Override
			public boolean test(String name) {
				
				return name.startsWith("박");
			}
			
		});
		*/
		
		// [4]
		// list.removeIf(name -> ((String) name).startsWith("박"));
		
//		// [3]
//		System.out.println(list);
//		
//		for(int i = list.size() -1; i <= 0; i--) {
//			String name = (String) list.get(i);
//			if(name.startsWith("박")) {
//				list.remove(i);
//				
//			}
//		}
		// 오름차순 정렬
		list.sort(null);
		
		//[김대원, 박예린, 박정현, 박정현, 양희동, 주정호]
		System.out.println(list);
		
//		// 내림차순 정렬 [1]
//		list.sort(Comparator.reverseOrder());
//		
//		// 내림차순 정렬 [2]
//		list.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o2.compareTo(o1);
//			}
//		});
		
	    // 내림차순 정렬 [3]
		list.sort((o1, o2) ->   ((String)o2).compareTo((String)o1));
		
		
		// 모든 요소 제거
		// list.clear();
		
		System.out.println(list);
		
		
		// 1 ~ 3 요소를 얻어도기 
		
		int fromIndex = 1;
		int toIndex = 3;
	    List list13 = list.subList(fromIndex, toIndex+1);
	    
	    System.out.println(list13);
	    
	    
		

		
		
		
		// ***** lsit에서 remove를 사용하면 기존의 배열사이즈가 초기화된다****
	} // main

} // class
