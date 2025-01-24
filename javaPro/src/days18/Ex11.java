package days18;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex11 {

	public static void main(String[] args) {
		
		// 1) 객체 셍성 : now(), of()
		// 2) 특정 필드 값을 얻어올 때 : get(), getXXX()
		// 3) 필드 값을 변경 : plusXXX(), minusXXX()
        //                  plus()     minus()
		//                  withXXX()
		
		// 개강일 24.12.23
		// [불변]
		/* [1]
		LocalDate d = LocalDate.now();
		System.out.println(d);
		d = d.withYear(2024); // 실제 객체는 안바뀌어서 객체를 하나 더 변수에 담아야함
		d = d.withMonth(12);
		d = d.with(ChronoField.DAY_OF_MONTH,23);
		
		System.out.println(d);
		*/
		
		// [2]
		/*
		LocalDate d = LocalDate.of(2024,12,23);
		System.out.println(d);
		
		
		System.out.println(d.isLeapYear());
		
		d.isAfter(d);
		d.isBefore(d);
		d.isEqual(d);
		*/
		
		// 생일 2000.1.15
		
		/*
		LocalDate today = LocalDate.now();
		LocalDate d = LocalDate.of(2000, 1, 15);
		LocalDate d1 = LocalDate.of(2000, 1, 20);
		LocalDate d2 = LocalDate.of(2000, 12, 15);
		
		LocalDate currentBirthYear = d.withYear(today.getYear());
		LocalDate currentBirthYear1 = d1.withYear(today.getYear());
		LocalDate currentBirthYear2 = d2.withYear(today.getYear());
		
		today.isAfter(d);
		
		if(today.equals(currentBirthYear)) {
			System.out.println("오늘 생일);
		}
	
		System.out.println(today.isAfter(d));
		*/
		  // A 생일  2000.1.15         오늘날짜    지났죠
	      // B 생일  2000.1.20                   오늘
	      // C 생일  2000.12.15                  지나지 않았죠..
	      
	      LocalDate aBirth = LocalDate.of(2025, 1, 15);
	      LocalDate now = LocalDate.now();
	      
	      System.out.println( now.isAfter(aBirth));   // true
	      System.out.println( now.isBefore(aBirth));
	      System.out.println( now.isEqual(aBirth));
	      
	   
	      LocalDate bBirth = LocalDate.of(2025, 1, 20); 
	      
	      System.out.println( now.isAfter(bBirth));   
	      System.out.println( now.isBefore(bBirth));
	      System.out.println( now.isEqual(bBirth));// true
	      
	      
	      LocalDate cBirth = LocalDate.of(2025, 12, 15); 
	      
	      System.out.println( now.isAfter(cBirth));  
	      System.out.println( now.isBefore(cBirth)); // true
	      System.out.println( now.isEqual(cBirth));
	    
	      System.out.println( now.compareTo(aBirth) ); 
	      System.out.println( now.compareTo(bBirth) ); 
	      System.out.println( now.compareTo(cBirth) );
		
	} // main

} // class
