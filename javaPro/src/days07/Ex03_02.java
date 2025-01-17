package days07;

import util.MyCalender;

public class Ex03_02 {

	public static void main(String[] args) {
		
		
		// [문제] 2000 ~ 2100 윤년 몇번? 몇년 출력 (확인)
		int count = 0;
		for(int i = 2000; i <= 2100; i++)
		{
			if(MyCalender.isLeapYear(i)) {
				count++;
				System.out.printf("year : %d\n", i);
			} //if
			
		} //for
		
        System.out.printf("윤년 횟수 : %d번\n", count);
        
        
        
	}

}

