package days11;

public class Ex05_03 {

	public static void main(String[] args) {
	      int x = 100;
	      
	      plus(x); // Call By Value

	      System.out.print(plus(x)); // 100
	   } // main

	
	  private static int plus(int x) {
	       
	      return x+=200;
	      
	   }
}
