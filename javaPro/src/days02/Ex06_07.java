package days02;

public class Ex06_07 {

	public static void main(String[] args) {

		// float, double 실수형 -> 2진수, 저장(표현)
		// 1) 실수 -> 2진수 표현(진법변환)
		//	  정수 10 -> 0000 1010
		/*
		 *  [예] 0.625 실수 -> 2진수로 변환(0, 1)
		 *  0.625 * 2 = [1].25 - 앞에 1은 남기고
		 *  0.25  * 2 = [0].5 - 앞에 0남기고
		 *  0.5   * 2 = [1].0 - 소숫점 값이 없으면 끝
		 *  
		 *  위에서부터 읽으면 됨. 0.101(2) //(2)는 2진수라는 뜻
		 * 
		 *  역으로 2진수 -> 10진수 실수
		 *  1*2^-1 + 0*2^-2 + 1*2^-3 == 0.625
		 *  
		 *  **float, double 모두 오차가 있다.
		 *  
		 *  2)
		 *  정수 자료형
		 *  int (4)
		 *  [s][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][]
		 *  long (8)
		 *  [s][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][]
		 *  
		 *  실수자료형
		 *  float (4)
		 *  //부호비트
		 *  		    8비트 E(지수): 뒤에 23비트가 남음 - M(가수를 나타냄)
		 *  [s(1)][E][][][][][][] [] [][][][][][][] [][][][][][][][] [][][][][][][][]
		 *  
		 *  double (8)            13비트 E(지수): 52비트 M(가수)
		 *  [s(1)][E][][][][][][] [][][][][][E][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][]
		 *  
		 *  예)
		 *  9.123456 실수(유한소수)
		 *  
		 *  		무한소수
		 *  1001.00011111100110101101101111100110101101101111001101011011011110011010110110111100110101101101...
		 *  
		 *  부동소수점 표기 - 1을 만나는 곳에서 소수점을 표기함
		 *  1.00100011111100110101101101111100110101101101111001101011011011110011010110110111100110101101101...
		 *  	x 2^3 (왼쪽으로 3칸땡겨서)
		 *  		3+127=130 E지수영역
		 *
		 *  //float보다는 더 범위가 넓은 double을 사용하여 오차범위를 줄일 수 있다.
		 *  //오차가 생길 수밖에 없다. - BigDecimal 클래스를 사용하여 해결할 수 있다.
		 *  
		 */
	}

}
