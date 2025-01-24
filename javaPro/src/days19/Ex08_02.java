package days19;

import java.util.LinkedList;

public class Ex08_02 {

	public static void main(String[] args) {
	
		
		LinkedList list = new LinkedList();
		list.add("권용법");
		list.add("김대원");
		list.add("김민곤");
		list.add("김하은");
		list.add("라일락");
		
		// [권용법, 김대원, 김민곤, 김하은, 라일락]
		System.out.println(list);
		
		
		list.addFirst("박세훈");
		list.addLast("박예진");
		
		// System.out.println(list.size());
		
		System.out.println(list);
		
		
	    //boolean list.contains("박세훈")
		int index = -1;
		if((index = list.indexOf("박세훈")) != -1) {
			
			list.set(0, "오재문");
		} // if
		
		// list.remove();
		// 첫 번쨰 일치하는 객체를 삭제 - removeFirstOccurrence()
		list.removeFirstOccurrence("홍길동");
		
		System.out.println(list);
		
		System.out.println("end");
		
		//  순차적으로 추가/삭제 : ArrayList
		//  중간      추가/삭제 : LinkedList
		

	}

}
