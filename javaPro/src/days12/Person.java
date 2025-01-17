package days12;

public class Person {


	// 필드
	//alt shift s
	private String name;
	public int age;
	private boolean gender;

	// 메소드
	public Person() // 괄호가 없으면 메소드의 기본 형식이 아니기에 오류
	{

	}


	public Person(String n, int a, boolean g) {
		name = n;
		age = a;
		gender = g;
	}

	// getter, setter + 메소드 일종 (필드 설정, 필드 얻어가는 역할.)
	public String getName() {

		return name;
	}

	
	
	
	public void setName(String name) {
		// 경고 The assignment to variable name has no effect -> 값이 할당이 안됐다
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	
	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}else
		{
			// 강제로 오류(예외) 발생
			throw new RuntimeException("0 ~ 120 실행 범위 밖"); // throw는 예외를 던진다는 말 
		}
	}


	
	public boolean isGender() {//boolean 일때는 getGender가 아니라 isGender로 쓴다
		return gender;
	}
	


	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	// getter, setter 둘 중 하나만 쓸 수는 있다 다만, 용도의 차이가 존재(읽기 전용(getter)만, 쓰기 전용(setter)만)


} // class
