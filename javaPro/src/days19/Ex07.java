package days19;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오후 2:02:08
 * @subject   Vector 컬렉션 클래스
 * @content     ㄴ List
 *              ㄴ 순서 유지 O, 증복허용 O
 *             ArrayList/Vector 차이점
 *                     동기화 처리여부
 *                     
 *                     
 *             Vector 는 동기화 처리로 안전함 
 *             그러나 ArrayList는 X
 *             StringBuffer/StringBuilder 차이점 
 *              
 */
public class Ex07 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println(v.capacity());   // 10
		System.out.println(v.size());       // 0
		
		v.add("박예진");
		v.addElement("양희동");
		v.addElement("홍길동");
		
		
		System.out.println(v.size());       // 3
		
		v.trimToSize();
		
		System.out.println(v.capacity());   // 10  
		
		
		System.out.println(v.get(0));  // 박예진
		
		System.out.println(v.elementAt(0)); // 박예진
		
	    // get() == elementAt()
		
		
		v.add(1, "박정현");
		
		// 
		//[박예진, 박정현, 양희동, 홍길동]

		System.out.println(v);
		
		// iterator() -> 반복자  fail - fast
		// Enumeration ->반복자  
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			
			String name = (String) en.nextElement();
			System.out.println(name);
		} // while
		
		
		// v.remove(2);
		// v.clear();

		// v.firstElement(); == v.get(0);

		// v.lastElement() == v.get(v.size()-1);

        // v.insertElementAt("홍순기", 2); == v.add(2,"홍순기");

		// [10]
		// [3] [7] trimToSize();
		v.setSize(0);


		
		
	}
			
		
		
		
		

	

}
