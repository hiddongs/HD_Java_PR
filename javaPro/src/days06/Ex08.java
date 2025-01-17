package days06;

import java.io.IOException;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//가위(1)/바위(2)/보(3) 
		Scanner sc = new Scanner(System.in);
		int com;
		int user;
		char con = 'y';
		
		do {

			com = (int) (Math.random() * 3) + 1;
			boolean flag = false;
			int count = 0;
			do {
				if(flag) {
					count++;
					System.out.printf("\t\t[%d]번 실패. 가위바위보 선택 잘못!!!\n> 다시", count);
					
					if(count >= 3)
					{
						System.out.println("허용된 횟수를 초과하셨습니다.");
						return;
					}
				}
				System.out.print("user는 가위(1), 바위(2), 보(3) 중에서 정수 하나를 입력하세요. ");
				user = sc.nextInt();
				flag = true;
			}while(!(user == 1 || user == 2 ||user == 3));
			
		    
			
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
			System.out.print("\n게임을 계속 합니까? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} //1번째 do 실행문
		while (con == 'y' || con == 'Y');
	}
}
