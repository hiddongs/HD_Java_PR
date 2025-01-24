package days18;

import java.time.LocalTime;

public class Ex10_02 {

	public static void main(String[] args) {
		

		// 시간 .... LocalTime
		
		LocalTime t = LocalTime.now();
		
     	System.out.println(t); // 15:48:20.724677500

     	
     	//시 , 분, 초, 밀리초, 나노초
     	
     	int hour = t.getHour();
		int min = t.getMinute();
	    int s = t.getSecond();
	    int ms = t.getNano() / 1000000;
	    int ns = t.getNano();
	    
	    System.out.println(hour);
	    System.out.println(min);
	    System.out.println(s);
        System.out.println(ms);
        System.out.println(ns);
	    
	}
	    
	    
	

}
