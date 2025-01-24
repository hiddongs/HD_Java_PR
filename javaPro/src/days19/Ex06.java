package days19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		
		
		// 1. String[] -> ArrayList 변환
		String [] names = {"박예진", "양희동","박정현","김대원","주정호", "이찬희"};
		
//		ArrayList list = new ArrayList();
//		
//		for (int i = 0; i < names.length; i++) {
//			list.add(names[i]);
//			
//		}
//		System.out.println(list);
		
		// [2] String [] -> List 
		//                  ArrayList
		
		List list = Arrays.asList(names);
//		// list.get(0);
//		// list.size();
//		// list.sort(null);
//		System.out.println(list);
//		
		ArrayList list2 = new ArrayList(list); // 매개변수 다형성, 생성자 
//		
//		
//		String [] names2 = new String[ list2.size() ];
//		
//		Iterator ir = list2.iterator();
//		int index = 0;
//		while(ir.hasNext()) {
//			String name = (String) ir.next();
//			names2[index++] = name;
//		}
//		System.out.println(names2);
//		
		// 2. ArrayList -> String[] 변환
		
		
		// [2]
		
		list2.toArray();
		
//		Object [] arr = list2.toArray();
//		System.out.println(Arrays.toString(arr));
		
		/*
		 * cannot be cast to class [Ljava.lang.String; ([Ljava.lang.Object; and [Ljava.lang.String; are in module java.base of loader 'bootstrap')
	at javaPro/days19.Ex06.main(Ex06.java:56)

		 */
		String [] arr = (String[])list2.toArray(new String[list.size()]); 
		// String [] arr = (String[])list2.toArray(String :: new); 
		System.out.println(Arrays.toString(arr));
		
		System.out.println(" end ");
		
	} // main
	

} // class
