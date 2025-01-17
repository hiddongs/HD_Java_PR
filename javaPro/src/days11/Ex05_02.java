package days11;

public class Ex05_02 {

	public static void main(String[] args) {
	      int x = 100;
	      int [] m = new int[1];
	      plus(m); // Call By Reference

	      System.out.print(m[0]); // 100
	   } // main

	
	  private static void plus(int [] m) {
	       
	      m[0] +=200;
	      
	   }
	/*
	   private static void plus(int x) {
	       
	      x+=200;
	      System.out.println(x);
	   }
   */
}
