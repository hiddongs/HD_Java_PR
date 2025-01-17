package days11;

public class Ex05 {

	public static void main(String[] args) {
	      int x = 100;
	      
	      plus(x); // Call By Value

	      System.out.println( x ); // 100
	   } // main

	   private static void plus(int x) {
	       
	      x+=200;
	      
	   }

}
