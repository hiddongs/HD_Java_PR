package days16;
/**
 * 
 * @author kenik
 * @date 2025. 1. 16. - 오전 11:06:53
 * @subject 어떤 객체로 부터 클래스 정보를 얻어오는 방법
 * @content Class<?> getClass()
 *          getName()   days15.Ex05 == fullName
 *  
 */
public class Ex03 {

	public static void main(String[] args) {
		
		/*
		Card c1 = new Card();
		System.out.println(c1.toString());
		System.out.println(c1);
		*/
		
		// Card c = new Card("HEART",3);
		
		// [첫 번째 방법]
		/*
		Class cls = c.getClass();
		String fullName = cls.getName();
		System.out.println(fullName); // days16.Card
		*/
		// [두 번째 방법] 모든 클래스 static 필드 : class
		/*
		Class cls = Card.class;
		// 얻어온 Class cls 객체를 사용해서 인스턴스를 생성할 수 있다.
		// new Card(); X
		
		// Unhandled exception type IllegalAccessException
		try {
			// The method newInstance() from the type Class is deprecated since version 9
			Card c = (Card) cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		// [세 번째 방법]
		String className = "days16.Card";

		try {
			
			// JDBC 사용하는 코드
			Class cls = Class.forName(className);
			// JDBC Driver
		} catch(ClassNotFoundException e){
			e.printStackTrace();// main
		}
	}
} // class


final class Card{
	
	String kind; // 카드 종류
	int num;     // 카드 번호
	
	// 디폴트 생성자
	
	Card(){
		this("SPADE",1);
		
	}
	
	Card(String kind, int num){
		super();
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}
	
	
	
}
