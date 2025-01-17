package days11;

/**
 * 
 * @author kenik
 * @date 2025. 1. 9. - 오후 3:27:01
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		

		// [클래스 배열 == 객체 배열]
		Person p1 = new Person();
		p1.name = "홍길동";
		
		Person p2 = new Person();
		p2.name = "김대원";
		
		Person p3 = new Person();
		p3.name = "김민곤";
		
		Person p4 = new Person();
		p4.name = "오재문";
		
		Person p5 = new Person();
		p5.name = "양희동";
		
		// 배열 선언 형식
		// 자료형 [] 배열명 = new 자료형[배열크기];
		
		
		// 얘는 배열을 생성하는 것이지 객체를 생성하는 것이 아니다! (중요함)
		/*
		Person [] persons = new Person[5];
		
		persons[0] = new Person();
		persons[1] = new Person();
		persons[2] = new Person();
		persons[3] = new Person();
		persons[4] = new Person();
		*/
		// 클래스(객체 배열 초기화)
		
		Person [] persons = {
			new Person(),
			new Person(),
			new Person(),
			new Person(),
			new Person(),
		}; //이것도 같은 표현임 배열을 생성하면서 객체 생성까지 한번에 유용함
		
		
		persons[0].name = "홍길동";
		persons[1].name = "김대원";
		persons[2].name = "김민곤";
		persons[3].name = "오재문";
		persons[4].name = "양희동";
		
		for(int i = 0; i < persons.length; i++) {
			persons[i].run();
		}
		
		/*
	     persons[0] = new Person();
		persons[1] = new Person();
		persons[2] = new Person();
		persons[3] = new Person();
		persons[4] = new Person();
		
		 */ //인스턴스화 안시켜서 나는 오류 클래스를 배열로 만든거랑 클래스를 인스턴스화 한거랑은 전혀 다른 작업. 따로따로 해줘야한다
		//Exception in thread "main" java.lang.NullPointerException
		
		/*
		int [] m = new int [5];
		for(int i = 0; i < m.length; i++) {
			m[i] = i + 1;
		}
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		*/
	}

}
