package days14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
		// [오토 박싱 오토 언박싱]
		// java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\x{2c}][decimal separator=\x{2e}][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]
        // System.out.printf("%s", new Scanner(System.in),100);
        
		// ArrayList list = new ArrayList();
		List list = new ArrayList();
		ArrayList list2 = new ArrayList(list); // 매개변수 다형성 // Collection c = List list
		
        test(new ArrayList());
        test(new Vector());
                   
	}
	
	public static void test(List list) { // 매개변수 다형성
		
	}
}