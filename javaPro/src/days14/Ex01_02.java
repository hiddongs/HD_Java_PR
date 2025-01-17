package days14;

import days13.Employee;
import days13.Regular;
import days13.SalesMan;
import days13.Temp;

/**
 * 
 * @author kenik
 * @date 2025. 1. 14. - 오전 10:38:33
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		//R / S/ T
		

		
		
		SalesMan emp3 = new SalesMan("이찬진", "경기도 남양주","010-9999-1234","2000.03.22",500000,20,150000);
		
       
		Regular emp2 = new Regular("양희동","경기도 고양지","010-1212-3434" ,"2000.12.27",500000000);
		
		// Temp 객체 생성
		Temp emp4 = new Temp("오재문", "서울 강북", "010-7777-5555", "2022.02.22",30,100000);
		
		Employee [] emps = {
				emp3,emp2,emp4
				
		};
		
		for (int i = 0; i < emps.length; i++) {
			empPayPrint(emps[i]);
		}
		empPayPrint(new TempTwo());
		

	}
	
	// getPay() X R(기본) S(기본 + 판매 * 커) T(일급 * 일수)
	/*
	public int getPay() {
		
		return 0;
		
	}// 정규직은 기본급...
	*/


	private static void empPayPrint(Employee emps) {
		// TODO Auto-generated method stub
	    // E emp = R/S/T + getPay()
		// E.getPay() X
		// --> emp.getpay(); X
		
		// [2] Employee.getPay() 추가 선언
	}


}


// 10년 후에 새로운 임시직 2가 생성되더라도 ...
class TempTwo extends Temp{
	
}
