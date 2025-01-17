package days13;


// [영업직 사원 클래스]
public final class SalesMan extends Regular{

	// [영업직 사원 클래스]
	// subclass를 가질 수 없는 최종 클래스이다.
	// 필드 : name, addr, tel, hiredate, basePay
	// 메서드 : dispEmpInfo(), getPay(), getter/setter
	private int sales;
	private int comm;
	
	
	
	// 급여 계산해서 반환한느 메서드
	@Override
		public int getPay() {
			// return this.getBasePay() + this.sales + this.comm; // 영업직은 기본급 + 판매량 + 커미션;
		  return super.getPay() + this.sales + this.comm;
 		}
	// 생성자
	
	
	
	public SalesMan() {
		super();
		System.out.println("SalesMan  디폴트 생성자 호출됨");
	}
    
	public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {

		super(name, addr,tel, hiredate, basePay);
		
		this.sales= sales;
		this.comm = comm;
		
		System.out.println(" SalesMan 7 생성자 호출됨");
	}
	
	

	//재정의 함수
	@Override
	public void dispEmpInfo() {
		/*
		super.dispEmpInfo(); //  name, addr, tel, hiredate
		System.out.printf("기본급 %d\n", this.basePay);
		*/
		
		
		System.out.printf("사원명 %s 주소 %s 연락처 %s 입사일자 %s 기본급 %d" + "판매량 %d 커미션 %d\n", 
				this.getName(),this.getAddr(), this.getTel(),this.getHiredate(),this.getBasePay(),this.sales,this.comm);
	
	}
}

/*
//The type LastChild cannot subclass the final class SalesMan -> // final이 붙으면 더는 상속이 불가하다
class LastChild extends SalesMan{
	
	
}
*/