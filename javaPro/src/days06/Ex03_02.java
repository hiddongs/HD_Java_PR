package days06;

public class Ex03_02 {

	

	public static void main(String[] args) {
    // 1단부터 4단
		for (int x = 2; x <= 5; x++) {
			System.out.printf("[%d 단]\t", x); 
		}
		System.out.println(); 

		for (int y = 1; y < 10; y++) { 
			for (int x = 2; x <= 5; x++) { 
				System.out.printf("%d*%d=%02d\t", x, y, x * y);
			}
			System.out.println(); 
		}
		System.out.println(); 

    // 5단부터 8단
		for (int x = 6; x <= 9; x++) {
			System.out.printf("[%d 단]\t", x); 
		}
		System.out.println(); 

		for (int y = 1; y < 10; y++) { 
			for (int x = 6; x <= 9; x++) { 
				System.out.printf("%d*%d=%02d\t", x, y, x * y);
			}
			System.out.println(); 
		}
	}
}