package days11;

/**
 * 
 * @author kenik
 * @date 2025. 1. 9. - 오후 2:49:54
 * @subject
 * @content
 */
public class Ex05_05 {

	public static void main(String[] args) {
		
		// 클래스 복사 == 객체 복사 ( copy )
		// 클래스 복제 == 객체 복제 ( clone )
		
		
		// 서로 전혀 다른 객체 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv(); 
               // 인스턴스에서 메소드는 참조할 뿐이다
		// 아무리 인스턴스화 에서 객체를 만들어도 메소드는 참조할 뿐이다
		
		// t1.channelUp();
	    // 같은 인스턴스를 참조하고 있을 뿐 == 클래스 복사 (copy)

		Tv t3 = t1;
		
		// t3.channel = 100;
		// System.out.println(t1.channel);
		
		test(t1);
		System.out.println( t1.channel );
		
	} //main
    //                       Tv t = t1;
	private static void test(Tv t) {  // 클래스 복사의 개념
		// TODO Auto-generated method stub
		t.channel = 500;
	}

} // class
