package days07;
/**
 * 
 * @author kenik
 * @date 2025. 1. 3. - 오전 11:08:28
 * @subject
 * @content
 */


import java.util.Scanner;



public class Ex02 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학을 입력 받아서 
		// 총점, 평균, 계산 후 출력 하는 코딩
		// 출력하는 함수 따로
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;
		double avg;




		//오히려 함수 호출을 먼저하고 하는 것이 함수를 만드는 것이 더 빠를 것 같다
		name = getName(sc);
		kor = getScore(sc,"국어");
		eng = getScore(sc,"영어");
		mat = getScore(sc,"수학");

	

		printScore(name, kor, eng , mat);

	}
	
	public static void printScore(String name, int kor, int eng, int mat) {
		
		System.out.printf("kor : %d, eng : %d, mat : %d",kor,eng,mat);
		
		
	}
	private static int getScore(Scanner sc, String subject) {

		
		
		int score = 0;
		while(true) {
			//Scanner sc = new Scanner(System.in);
			System.out.printf("%s 입력 : ", subject);
			String strScore = sc.next();	
			String regex = "^(100|[1-9]?[0-9])$";
			if(strScore.matches(regex)) {

				System.out.println("검사 통과");
				score = Integer.parseInt(strScore);
				break;
			}
			else{
				System.out.println("0 ~ 100 사이 정수 값만 입력하세요. 다시 입력하세요.");
			}

			
			
		}
		
		return score;
	}

	public static String getName(Scanner sc) {

		//Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();		 
		return name; //스트링의 기본 값 null
	}

}





