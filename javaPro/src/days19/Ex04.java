package days19;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오전 11:16:58
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {

		
		// 클래스 배열
		// ArrayList [] teamArr = new ArrayList[3]; // X 이제 거의 안 쓴다

	
		ArrayList team1 = new ArrayList();
		ArrayList team2 = new ArrayList();
		ArrayList team3 = new ArrayList();
		
		
		team1.add("박정현");
		team1.add("김하은");
		team1.add("박예진");
		team1.add("김민곤");
		team1.add("양희동");
		
		team2.add("주정호");
		team2.add("최지우");
		team2.add("김대원");
		team2.add("이찬희");
		team2.add("라일락");
		
		team3.add("윤형식");
		team3.add("오재문");
		team3.add("박세훈");
		team3.add("유예나");
		team3.add("권용법");
		
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		
		
		ArrayList classE = new ArrayList (team3);
		classE.addAll(team2);
		classE.addAll(team3);
		System.out.println(classE);
		
		team1.retainAll(team2);
		
		// 기능 : team1에 있는 요소와  tema2에 있는 요소 중에 공통요소만 남기는 메서드
		// 매개변수 Collection c
		// 리턴값 boolean
		// a,b,c,d
		//   b,c,f,g
		
		// team1.retainAll(team2);
		
		// [모든 classE 요소를 출력]
		// [1]
		/*
		for(int i = 0; i < classE.size(); i++) {
			String name = (String) classE.get(i);
			System.out.println(name);
		}
		*/
		
		
		// [2] *** iterator() 메서드 -> 반복하다
		// 반복자
		Iterator ir = classE.iterator();
		// boolean hasNext() 다음 요소가 있으면 true / 없으면 false
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		} // while
		
	 
		// toArray()
		Object[] arr = classE.toArray();
	} // main

} // class
