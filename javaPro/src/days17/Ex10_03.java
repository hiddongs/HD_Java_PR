package days17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] m = {3,5,2,4,1};
		
		// [1]
		// int [] -> Stream 변환 + 메서드 ()
		// IntStream s = Arrays.stream(m);
		// s.sum();
		
		// int sum = Arrays.stream(m).sum();
		// System.out.println(sum);
		
		
		int sum = IntStream.of(m).sum();
		System.out.println(sum);
		
	} // main

} // class
