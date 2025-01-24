package days20;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map.Entry;
import java.util.Set;

/**
 * 복습 문제 시험 파트
 * 
 * @author goddxmn
 * @date 2025. 1. 22. - 오후 12:17:49
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("kenik", "이창익");
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		
		// 컬렉션 클래스는 iterator로 출력하는 습관 들이기
		
		// 복습 시험 문제
		// 1. 모든 key 출력 keySet()
		Set<String> ks = hm.keySet();
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			String value = hm.get(key);
			System.out.println(key + "/" + value);
		}
		
		System.out.println("-".repeat(50));
		// 2. 모든 value 출력 values()
		
		Collection<String> vc = hm.values();
		ir = vc.iterator();
		
		while (ir.hasNext()) {
			String value = ir.next();
			System.out.println(value);
		} // while
		// 3. 모든 entry(key + value) 출력 entrySet()
		
		Set <Entry <String, String>> es = hm.entrySet();
		Iterator <Entry <String, String>> ir2 = es.iterator();
		
		while (ir2.hasNext()) {
			Entry<String, String> entry =  ir2.next();
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + "/" + value);
			
		} // while


	} // main

} // class
