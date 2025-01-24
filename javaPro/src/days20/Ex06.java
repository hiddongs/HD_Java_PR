package days20;

import java.util.HashMap;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 22. - 오후 12:17:49
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		
		/*
		 *  [ Map 인터페이스를 구현한 컬렉션 클래스 ] 
		 *                  권장
		 *  1. Hashtable, HashMap 컬렉션 클래스
		 *               <새로운 버전>
		 *     Vector     ArrayList
		 *   동기화 처리 O   동기화 처리 X
		 *   StringBuffer  StringBuilder
 		 *   
 		 *  2. key + value 한 쌍으로 관리
 		 *     key + value를 Entry라고 부른다
 		 *    
 		 *      
 		 *  3. Hash : 해싱이라는 기법을 사용하여 데이터를 관리 저장 -> 검색 성능이 뛰어나다.
 		 *  
 		 *  4. 해싱기법
 		 *    1) 해시함수( hash Fucntion ) 를 이용해서 
 		 *       데이터를 해시테이블 ( hash table ) 에 저장하고 검색한 기법
 		 *       
 		 *    2) 해시함수는 데이터가 저장되어 있는 곳을 알려 주기 때문에 다량의 데이터 중에서 원한느 데이터를 빠르게 검색할 수 있다.
 		 *    
 		 *  5. 배열과 링크드리스트 구조의 조합된 형태
 		 *  
 		 *  
		 */
		
		
		// Eelement
		// Type
		// Key
		// Value
		
		// key 값은 중복 x | Vlaue는 가능
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("kenik", "이창익");
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		
		
		
		/*
		// {hong=홍길동, admin=관리자, hiddongs=양희동}
		System.out.println(hm);
		
		// [문제] key값이 "admin" 이름 출력하고 김대원님 이름으로 수정
		String Key = "admin";
		if(hm.containsKey(Key)) {
			String value = hm.get(Key);
			hm.put(Key,"김대원");
			
		}
//		System.out.println(hm.get("admin"));
//		hm.replace("admin", "관리자", "김대원");
//		System.out.println(hm.get("admin"));
		
		*/
		
		// hm.clear(); 엔트리 제거
		System.out.println(hm);
		
		hm.containsKey("홍길동"); // 있는지 없는지 확인
		
		// hm.entrySet()
		
		// value hm.get(Key)
		// hm.isEmpty()
		
		// hm.remove(key, value)
		// hm.replace(null,null)
		
		// 병합
		// hm.merge(null, null, null);
		
		
		
		
		
//		hm.keySet(); // 모든 key값만 가지고 있는 집합	
//		hm.values(); // 모든 value값
	} // main

} // class
