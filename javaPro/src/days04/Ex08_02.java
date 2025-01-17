package days04;
/**
 * 
 * @author kenik
 * @date 2024. 12. 27. - 오후 3:30:07
 * @subject 컴퓨터와 사용자가 가위(1)/바위(2)/보(3) 게임.
 * @content 1/2/3 키보드로 입력
 *            2       3
 *            바위      보
 *            사용자 이겼다.
 *            컴퓨터 이겼다.
 *            무승부.
 *            
 */
import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가위(1)/바위(2)/보(3) 
        int com;
		int user;
		com = (int) (Math.random() * 3) + 1;
		System.out.print("user는 가위(1), 바위(2), 보(3) 중에서 정수 하나를 입력하세요. ");
		
		Scanner sc = new Scanner(System.in);
		user = sc.nextInt();
		
		System.out.printf(" com = %d, user = %d\n",com ,user);
		
		//승자 판가름
		/*
		if(user == com) {
			System.out.print("무승부");
		}
		else if((com - user) == 1){
			
			System.out.println("컴퓨터가 이겼다");
		}
		else
			System.out.println("사용자가 이겼다");
		
	}
	 */
		
		
		switch (user - com) {
		case 0:
			System.out.println("무승부");
			break;
		case 1:
			System.out.println("사용자 승리");
			break;
		case 2:
			System.out.print("컴퓨터 승리");
			break;
		case -1:
			System.out.print("컴퓨터 승리");
			break;
		case -2:
			System.out.print("컴퓨터 승리");
			
			break;
		}
	}
		

}
