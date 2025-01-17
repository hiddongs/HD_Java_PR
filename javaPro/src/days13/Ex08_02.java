package days13;

/**
 * 
 * @author kenik
 * @date 2025. 1. 13. - 오후 5:14:55
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
	
		// E e = new R() 업캐스팅
		// R e2 = (R) e; 다운캐스팅
		
		Employee emp1 = new Employee("김민곤", "서울 양천구","010-1111-2222","2000-11-11");
		// 다운캐스팅 : 부모 -> 자식 형변환
		// Type mismatch : cannot convert from Employee to Regular
		
		//  java.lang.ClassCastException: class days13.Employee cannot be cast to class days13.Regular (days13.Employee and days13.Regular are in module javaPro of loader 'app')
		// 강제 형변환 하다 뜬 오류 -> 안되는 이유 객체 생성할 떄 employee가 아닌 regular였으면 가능 그러나 employee면 안된다
		Regular emp2 = (Regular) emp1;
		System.out.println("end");

		
	}

}
