package days13;


// [임시직 사원 클래스]
//  급여 = 근무일수 * 하루일당
public class Temp extends Employee{

	// 필드 : name, addr, tel, hiredate
	private int days;
	private int payOfDay;
	
	public Temp() {
		super();
		System.out.println(" Temp 디폴트 생성자 호출됨");
	}


	public Temp(String name, String addr, String tel, String hiredate,int days,int payOfDay) {

		super(name, addr, tel, hiredate); // employee
		this.days = days;
		this.payOfDay = payOfDay;
		
		System.out.println(" Temp 6  생성자 호출됨");
	}
	
	@Override
	public void dispEmpInfo() {
	

		super.dispEmpInfo();
		System.out.printf("근무일수 : %d, 하루일당 : %d\n", this.days,this.payOfDay);
	
	}
	
	public int getPay() {
		return this.days * this.payOfDay;
	}
	
}
