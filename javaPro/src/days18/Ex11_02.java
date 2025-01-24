package days18;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex11_02 {

	public static void main(String[] args) {
	
		LocalDate d = LocalDate.now();
		d = d.plusDays(2);
		d = d.minusDays(1);
		
		System.out.println(d);
		
		
		// [2]
		LocalTime t = LocalTime.now();
		t.plusHours(1);
		t.minusMinutes(30);
		System.out.println(t);
		
	}

}
