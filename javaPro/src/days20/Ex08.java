package days20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap / Hashtable
		// MVC
		// days17.1차 조편성.txt 3조
        // ArryaList 3개 - 각팀 (왜? 이름이 중복될 수 있으니까 다른 인터페이스는 안된다)
		// HashMap key(팀명) value(팀원)
		// 매개변수 Map을 넘기는 출력함수
		
		//		team1 : 박정현, 김하은, 김민곤, 박예진, [양희동] 
		//		team2 : [주정호], 최지우, 김대원, 이찬희, 라일락 
		//	    tema3 : 윤형식, 오재문, [박세훈], 유예나, 권용범 
		
		String [] 팀1 = { "박정현", "김하은", "김민곤", "박예진", "[양희동]" };
		String [] 팀2 = { "[주정호]", "최지우", "김대원", "이찬희", "라일락" };
		String [] 팀3 = { "윤형식", "오재문", "[박세훈]", "유예나", "권용범" };
		
		ArrayList<String> team1 = new ArrayList<String>();
		
			for (int i = 0; i < 팀1.length; i++) {
			team1.add(팀1[i]);
		}
		
		// List<String> list2 = Arrays.asList(팀2);
		ArrayList<String> team2 = new ArrayList<String>();
		
		for (int i = 0; i < 팀2.length; i++) {
			team2.add(팀2[i]);
		}
		
		// List<String> list3 = Arrays.asList(팀3);
		ArrayList<String> team3 = new ArrayList<String>();
		for (int i = 0; i < 팀3.length; i++) {
			team3.add(팀3[i]);
		}
		
		
		HashMap<String, ArrayList<String>> hm = new LinkedHashMap<>();
		
		hm.put("1조", team1);		
		hm.put("2조", team2);	
		hm.put("3조", team3);	
		
		printHashMap(hm);
		
	} // main

	/*
	private static void printHashMap(HashMap<String, ArrayList<String>> hm) {
		// TODO Auto-generated method stub
		// 1조 (5명)
		//  1. ooo
		//  2. ooo
		//  3. ooo
		//  4. ooo
		//  5. ooo
		// 2조 (5명)
		//  1. ooo
		//  2. ooo
		//  3. ooo
		//  4. ooo
		//  5. ooo
		
		Set<Entry <String, ArrayList<String>>> set = hm.entrySet();
		Iterator<Entry<String, ArrayList<String>>> ir = set.iterator();
		
	  while (ir.hasNext()) {
			Entry<String, ArrayList<String>> entry =  ir.next();
			
			String key = entry.getKey();
			ArrayList<String> value = entry.getValue();
		  
			
			System.out.printf("%s (%d) \n", key, value.size());
			
			for (int i = 0; i < value.size(); i++) {
				
				
				 System.out.printf(" %d. %s\n", i + 1, value.get(i));


			}
		}
		
		

	}
    */
	
	private static void printHashMap(HashMap<String, ArrayList<String>> hm) {
	      
	      Set<Entry<String, ArrayList <String>>> eset = hm.entrySet();
	      Iterator<Entry <String, ArrayList <String>>> ir = eset.iterator();
	      int index = 1;
	      while (ir.hasNext()) {
	         Entry<String, ArrayList<String>> entry = ir.next();
	         String key = entry.getKey();
	         ArrayList<String> value = entry.getValue();
	         System.out.printf("%s (%d명)\n", key, value.size());
	         // 팀원들 출력
	         Iterator<String> ir2 = value.iterator();
	         index = 1; // 
	         while (ir2.hasNext()) {            
	            String name = ir2.next();
	            System.out.printf("\t%d. %s\n", index++, name); // 밑에 코드보단 이 코드가 더 좋은 것 같다
	            // System.out.printf("\t%d. %s\n", value.indexOf(name)+1, name);
	         } // while
	         
	      } // while
	      
	      // 1조 ( 5명 )
	      //   1. 홍길동
	      //   1. 홍길동
	      //   1. 홍길동
	      //   1. 홍길동
	      //   5. 홍길동
	      // 2조 ( 3명 )
	      //   1. 홍길동
	      //   1. 홍길동
	      //   3. 홍길동
	      // 3조 ( 7명 )
	      //   1. 홍길동
	      //   1. 홍길동
	      //   1. 홍길동
	      //   1. 홍길동
	      //   5. 홍길동
	      //   5. 홍길동
	      //   7. 홍길동
	      

	   }
} // class
