package days05;
/**
 * 
 * @author kenik
 * @date 2024. 12. 30. - 오후 5:22:53
 * @subject
 * @content 그냥 for문 보다 중첩 for문이 유지보수가 더 용이하기에 자주 활용
 */
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //[별 찍기의 3가지 방법] 마지막 방법이 제일 좋다
		//1)
		/*
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		*/
		
		//2)
		
		/*
		for(int i = 1; i <= 4; i++) {
			System.out.println("****");
		}
		*/
		
		
// 암기하기
// i = 1 1 <=4(T)
//      J = 1, 2, 3, 4
// i = 2 1 <=4(T)
//      J = 1, 2, 3, 4
// i = 3 1 <=4(T)
//		J = 1, 2, 3, 4
// i = 4 1 <=4(T)
//		J = 1, 2, 3, 4
		
		
		
		for(int i = 1; i <= 4; i++) { //행 갯수
			for(int j = 1; j <= 4; j++) { //별(열) 갯수
				System.out.print("*");
			}
		
		    System.out.println();
		}
		
		
		
	}

}
