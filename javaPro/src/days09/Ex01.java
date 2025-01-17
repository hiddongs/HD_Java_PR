package days09;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 123;

		int 몫, 나머지;
		char [] hex = new char [4];
		Arrays.fill(hex, '0');

		int index = hex.length - 1;

		while( n != 0 ) {
			몫 = n / 16;
			나머지 = n % 16;
            char value = (char) (나머지 += 나머지 >= 10 ? 55 : 48);
            hex[index--] = value;
			/*
			if(나머지 >= 10) {
				switch (나머지) {
				case 10:
                    hex[index--] = 'A';
					break;

				case 11:
					hex[index--] = 'B';
					break;
				case 12:
					hex[index--] = 'C';
					break;
				case 13:
					hex[index--] = 'D';
					break;
				case 14:
					hex[index--] = 'E';
					break;
				case 15:
					hex[index--] = 'F';
					break;


				
				}

			}
			else {
				// '0' - 48
				// '7' - 55     7
				hex[index--] = (char) (나머지 + '0'); // '5'
			}
			*/
			n = 몫;
		}
		System.out.println("0x" + Arrays.toString(hex));
	}

}
