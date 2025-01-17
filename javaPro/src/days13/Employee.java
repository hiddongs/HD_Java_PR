package days13;

// [사원클래스]
// 사원이라면 공통적으로 가지고 있어야할 멤버(필드, 메서드)를 구현한 클래스
// 추상 클래스 : 객체를 생성할 수 없는 불완전한 클래스
// 하나라도 추상 메서드를 가지고 있으면 추상 클래스가 된다.
// 추상클래스 : 공통적인 멤버로 클래스를 구현할 경우에는 추상클래스 선언할 경우가 많다
public abstract class Employee extends Object {

	// 필드

	private String name;       // 사원명
	private String addr;       // 사원주소
	private String tel;        // 사원 연락처
	private String hiredate;   // 입사일자

	public void dispEmpInfo() {
		System.out.printf("사원명 : %s, 주소 : %s, 연락처 : %s, 입사일자 : %s\n", this.name,this.addr,this.tel,this.hiredate);
	}


	// 메서드
	public Employee() {
		super();
		System.out.println(" Employee 디폴트 생성자 호출됨");
	}


	public Employee(String name, String addr, String tel, String hiredate) {

		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		
		System.out.println(" E 4 생성자 호출됨");
	}
	
	// 몸체 (body) {} X 구현이 안된 불완전한 메서드를 abstract 키워드를 붙여서 추상메서드를 한다
	//This method requires a body instead of a semicolon
	public abstract int getPay();



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getHiredate() {
		return hiredate;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	// 생성자

}
