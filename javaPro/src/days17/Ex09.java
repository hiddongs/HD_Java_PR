package days17;

import java.util.Objects;
import java.util.Random;

import days13.Point2D;

/**
 * 
 * @author kenik
 * @date 2025. 1. 17. - 오후 3:08:09
 * @subject java.util.Arrays 클래스
 * @content java.util.Random 클래스
 *          java.util.Objects 클래스
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// [1]
		Random rnd = new Random();
		// rnd.nextInt(int bound) // 0 <= int < bound
		// rnd.netBoolean();
		// rnd.nextDouble();
		// rnd.nextInt()
		
		// [2]
		// Object의 보조클래스 : Objects 클래스
		// static 멤버 
		
		Point2D p = null;
		// if( p != null ) {
	    if( !Objects.isNull(p)) {
	    	
		} // if
	    
	    // if( p == null ) {}
	    if ( Objects.nonNull(p)) {
	    }
	    
	    Point2D p2 = null;
	    if ( p != null && p.equals(p2) ) {
		
     	}
	    if ( Objects.equals(p, p2)) {}

     }
}