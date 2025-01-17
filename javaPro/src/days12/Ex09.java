package days12;



public class Ex09 {

	public static void main(String[] args) {
		// 클래스 메소드 ( == static 메소드 )
		// 1. static 변수를 사용할 메소드
		// 2. 프로그램 코딩 시 반드시 필요한 메소드
		
		// Math클래스의 함수들은 전부 다 static으로 구성됐다. -> 자주 쓰기 때문에 아예 이렇게 한 것
		 
		Math.abs(10); //앞에 클래스 안붙히고 싶으면 임포트해서 사용하면 된다 Ex) import static java.lang.Math.abs;
                      //                                                          특정이 아니라 전부 안쓰고 싶으면 Math.*/
		Math.random();
		Math.max(1, 10);
		Math.min(1, 0);
		Math.pow(2, 3);
	}

}
