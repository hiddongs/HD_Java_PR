package days17;

import static java.lang.Math.*;
import static java.lang.System.*;
/**
 * 
 * 
 * @author kenik
 * @date 2025. 1. 17. - 오후 12:31:02
 * @subject Math 수학관련된 메서드 
 * @content   ㄴ public static 멤버 
 */
public class Ex06 {

	public static void main(String[] args) {
		
		out.println(PI);
		out.println(E);
		out.println(random());
		out.println(max(1, 2));
		out.println(min(1, 2));
		out.println(pow(2, 3));
		out.println(abs(-2));   // 2 절대값
		out.println(sqrt(2));   // 2.0 double
		
		
		// 반올림, 올림(절상), 버림(절삭)
		out.println(ceil(45.179));  // double
		out.println(round(45.179)); // long
		out.println(floor(45.179)); // double 
		
		
		
	} // main

} // class
