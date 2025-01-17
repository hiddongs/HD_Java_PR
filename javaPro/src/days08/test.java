package days08;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int [] m = {1,2,3};
	    addArr(m);
	    

	}

	private static int[] addArr(int[] m) {
		// TODO Auto-generated method stub
	
		int [] n = Arrays.copyOf(m, m.length + 3);
		
		m = null;
		
		for(int i = 0; i < n.length; i++) {
			System.out.printf("[%d]", n[i]);
		}
		return n;
		
		
		
		
	}
	
	
}


