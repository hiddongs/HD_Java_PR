package days19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오후 4:49:33
 * @subject 게임 횟수를 입력 받아서 로또 번호 출력.
 * @content days11.Ex06_03.java
 *          // 모두 컬렉션 클래스만 해서 만들어보기
 */
public class Ex12_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();

		
		// <E? == Element == HashSet<Integer>  
		// 게임의 횟수를 담는 배열 
		ArrayList<HashSet<Integer>> lottos = new ArrayList<HashSet<Integer>>(gameNumber);
		
		
		for (int i = 1; i <= gameNumber; i++) {
		
			// set : [중복허용 X] 순서유지 X
			// HashSet<Integer> lotto = new HashSet<Integer>();
			LinkedHashSet<Integer> lotto = new LinkedHashSet<>();
			fillLotto(lotto);
			
			lottos.add(lotto);
			
		}

		// dispLotto(lotto);
		for (int i = 1; i <= gameNumber; i++) {
			System.out.printf("%d 게임 : ", i);
			dispLotto(lottos.get(i-1));
		}
		
		
		

	} // main

	private static void dispLotto(HashSet<Integer> lotto) {
		// TODO Auto-generated method stub

		Iterator<Integer> ir = lotto.iterator(); 
		while (ir.hasNext()) {
			Integer num = (Integer) ir.next();

			System.out.printf("[%02d]", num);
		}
		System.out.println();

	} // dispLotto
	

	private static void fillLotto(HashSet<Integer> lotto) {
		// TODO Auto-generated method stub
		int n;
		Random rnd = new Random();

		while (lotto.size() < 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		} // while
	} // fillLotto




} // class
