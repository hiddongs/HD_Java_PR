package days07;

public class Ex01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample.drawLine(); //함수 호출
		System.out.println(" 부서명 : 사원명 ");
		Sample.drawLine(30);
		System.out.println(" 영업부 : 이태규 ");
		System.out.println(" 총무부 : 신희민 ");
		System.out.println(" 생산부 : 빅현주 ");
		System.out.println(" 기획부 : 김예지 ");
		System.out.println(" 기획부 : 하동호 ");
		Sample.drawLine("^", 25); //다른 클래스에 있는 메소드를 가져올때 ex) Sample클래스에 있는 메소드를 가져올 때
		
		//drawLine()과 darwLine(n)은 함수의 이름은 같지만 다른 기능을 수행한다
		
	}
	
	/*
	// 함수 선언
	// 1. 기능 : 선을 기르기 drawLine 
	// 2. 매개변수 : X
	// 3. 리턴값 : X, void
	public static void drawLine() {
		
		System.out.println("--------------");
	}
	
	
	//Duplicate method drawLine() in type
    public static void drawLine(int n) { 
		
         		
    	  System.out.print("-".repeat(n));
    	  System.out.println(); //개행

	}
    public static void drawLine(String style, int n) { 
		
 		
  	  System.out.printf(style.repeat(n));
  	  System.out.println(); //개행

	}
  */
    
    //*** 메소드 오버로딩(overloading 중복함수) -> 함수는 똑같은 이름(중복 선언) 가능. 단, 매개변수 갯수, 자료형은 다르게 해줘야 한다. 리턴은 상관없음 
 }
