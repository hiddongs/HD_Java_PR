package days10;

import java.util.Arrays;

public class Ex05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
                86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
             169, 172, 181, 184, 185, 191, 198 };
      System.out.println(   Arrays.toString(m)   );
      
      int index = Arrays.binarySearch(m, 98); //걍 이거 쓰면 편하긴 함
	}

}
