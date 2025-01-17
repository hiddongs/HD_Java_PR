package days09;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author kenik
 * @date 2025. 1. 7. - 오후 2:07:34
 * @subject 카드 섞기, 화투 섞기 등등
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		int [] m = new int[10];
		for(int i = 0; i < m.length; i++) {
			m[i] = i;
			//m[0];
			//m[1];
			//m[2];......m[10];
		
		}
		
		suffle(m);
		System.out.println(Arrays.toString(m));

	}

	//Call by Reference
	private static void suffle(int[] m) {
		
		Random rnd = new Random();
		int idx1 = 0, idx2;
		for(int i = 0, temp; i < 100; i++) {
			//idx1 = rnd.nextInt(m.length);
			idx2 = rnd.nextInt(m.length);
			//배열의 크기 만큼의 수를 랜덤으로 집어넣기
			
			
			
			temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
		}
		
	}

}
