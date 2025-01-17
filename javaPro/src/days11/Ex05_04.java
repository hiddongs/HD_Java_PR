package days11;

public class Ex05_04 {

	public static void main(String[] args) {
	      int x = 100;
	     
	      Point p = new Point();
	      p.x = 100;
	      plus(p); // Call By Reference + 클래스 매개변수

	      
	      System.out.print(p); // 100
	   } // main

	
	  private static void plus(Point p) {
	       
	      p.x += 200;
	      
	   }

}

class Point{
	// field
	int x;
	
	//method
}
