package days20;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = ".\\src\\days16\\Ex05.java";
		
		// 한문자    'B'     3
		// p        'p'     1
		// a        'a'     1
		// c        
		// k
		// a        'a'     2
		// g
		// e
		HashMap<Character, Integer> hm = new  HashMap<>();
		
		char one =  '\u0000';
		int code = -1;
		 try (FileReader reader = new FileReader(fileName)){
	         
	         while ( (code = reader.read()) != -1) { 
	            one = (char) code;
	            if(hm.containsKey(one)) { // 'a' 존재하면 value + 1
	               int oldValue = hm.get(one);
	               hm.put(one, ++oldValue);
	            }
	            else { // 'a' , 1
	            	hm.put(one, 1);
	            } // if
	         } // while
	      } catch (Exception e) {
	         System.out.println(e.toString());
	     }
		 //     k   v
		 // 출력 'A'(20) ###
		 
		 hm.entrySet();
		 
			
			Set <Entry<Character, Integer>> es = hm.entrySet();
			Iterator<Entry<Character, Integer>> ir2 = es.iterator();
			
			List<Entry<Character, Integer>> sortEntry = new ArrayList<>(hm.entrySet());
			
			sortEntry.sort(Entry.comparingByKey());
			while (ir2.hasNext()) {
				Entry<Character, Integer> entry =  ir2.next();
				Character key = entry.getKey();
				int value = entry.getValue();
				
				// A ~ Z a ~ z 0 ~ 9 정렬
				System.out.printf("%c(%d)\t%s\n",key , value,"#".repeat(value));
				
			} // while
		 
		 System.out.println(" end ");
	}

}
