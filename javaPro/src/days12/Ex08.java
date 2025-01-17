package days12;

/**
 * 
 * @author kenik
 * @date 2025. 1. 10. - 오후 3:19:40
 * @subject [static 키워드]
 * @content 클래스 앞 X 중첩 클래스
 *          메소드 앞
 *          필드  앞
 */
public class Ex08 {

	public static void main(String[] args) {

        //인스턴스 변수는 인스턴스가 만들어질때마다 각각 만들어질 때마다 생성되는 변수
		
		// 1. 농협은행 - 저축 ( 이자율 동일 )
		// 2. 저축 관련된 클래스 선언 + 사용 예제 + [static 키워드]
		//   Save

		/*
		Save s1 = new Save("유형식", 10000, 0.02);     
		Save s2 = new Save("김대원", 4000, 0.02);      
		Save s3 = new Save("박정현", 16000, 0.02);     
		Save s4 = new Save("오재문", 34000, 0.02);     
		Save s5 = new Save("김민곤", 2000, 0.02);      

		s1.printSave();
		s2.printSave();
		s3.printSave();
		s4.printSave();
		s5.printSave();
		 */
		
		// 클래스 변수
		// 클래스 명. 클래스 변수명
		
		// The field Save.rate is not visible -> 접근지정자 떄문에 생기는 오류
		// Save.rate = 0.04;
		
		// private 필드를 사용하기 위해 스태틱이 붙혀진 getter, setter를 사용해야한다
		
		
		// [3] 클래스 배열 초기화 사용
		Save [] ss = {
				new Save("유형식", 10000, 0.02),   
				new Save("김대원", 4000, 0.02),     
				new Save("박정현", 16000, 0.02),    
				new Save("오재문", 34000, 0.02),    
				new Save("김민곤", 2000, 0.02)   

		};
		Save.setRate(0.04);
		ss[3].setRate(0.07);

		for(int i = 0; i < ss.length; i++) {
			ss[i].printSave();
		}

		// [3] 클래스 배열 초기화 사용
		  

		}
}



