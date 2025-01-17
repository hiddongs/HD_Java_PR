package days07;

import util.MyCalender;
public class Ex03_PR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int count = 0;


		for(int i = 2000; i <=2100; i++) {

			if(MyCalender.isLeapYear(i)) {

				System.out.print("윤년입니다\n");
                System.out.printf("년도 : %d\n", i);
				count++;
			}
			else
				System.out.print("평년입니다\n");
			    System.out.printf("년도 : %d\n", i);
		}
		
		System.out.printf("윤년 횟수 : %d ", count);
	}

}
