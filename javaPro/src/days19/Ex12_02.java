package days19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오후 4:32:02
 * @subject  로또게임
 
 * @content
 *          fillLotto(lotto);
		    dispLotto(lotto);
 *          
 */
public class Ex12_02 {

	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<Integer>();

		fillLotto(lotto);
		dispLotto(lotto);
	} // main

	private static void dispLotto(HashSet<Integer> lotto) {
		// TODO Auto-generated method stub
		
		Iterator<Integer> ir =lotto.iterator(); 
		while (ir.hasNext()) {
			Integer num = (Integer) ir.next();
			
			System.out.printf("[%02d]", num);
		}
		System.out.println();
		
	}

	private static void fillLotto(HashSet<Integer> lotto) {
		// TODO Auto-generated method stub
		int n;
		Random rnd = new Random();

		while (lotto.size() < 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
			} // if
		} // while

	

} // class
