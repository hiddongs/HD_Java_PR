

package days10;

import java.io.IOException; 
import java.util.Scanner; 
import java.util.stream.IntStream;

import days09.Ex04;

/**
 * 
 * @author kenik
 * @date 2025. 1. 8. - 오후 12:09:23
 * @subject 3반 + 한 반 30명 이/극/영/수/총/평/등 입력 -> 등수처리 -> 출력
 * @content 2/3차원 배열 사용
 */
public class Ex02_02 {

	public static void main(String[] args) throws IOException {


		final int STUDENT_CNT = 30;

		Scanner sc = new Scanner(System.in);


		String [][] names = new String[3][STUDENT_CNT]; int [][] kors = new
				int[3][STUDENT_CNT]; int [][] engs = new int[3][STUDENT_CNT]; int [][] maths
				= new int[3][STUDENT_CNT];

				int [][] tots = new int[3][STUDENT_CNT]; int [] ranks= new int[STUDENT_CNT];

				double [][] avgs = new double [3][STUDENT_CNT];

				// 면 : 반 행 : 학생번호 열 : 0국 1영 2수 3총 4등 5전등 
				int [][][] infos = new int[3][STUDENT_CNT][6];

				int [] cnts = new int[3];

				// cnts[0] 1반 학생의 입력 받은 학생 수 // cnts[1] 2반 학생의 입력 받은 학생 수 // cnts[2] 3반 학생의입력 받은 학생 수

				char con = 'y';

				String name; int kor, eng, mat, tot, rank; double avg;

				Scanner scanner = new Scanner(System.in);


				int ban; int wrank; 
				do {

					// 1. 반 입력? // 2. 학생 정보?

					System.out.print("1. 반 입력 ? "); ban = sc.nextInt(); // 1,2 ,3


					// 2. 학생 정보?

					System.out.printf("2. %d반의 [%d]번 학생 이름, 국, 영, 수 입력하세요 ", ban, cnts[ban-1]+1);

					name = Ex04.getName() ; //scanner.next(); 
					kor = Ex04.getScore(); //scanner.nextInt(); 
					eng = Ex04.getScore(); // scanner.nextInt(); 
					mat =
							Ex04.getScore(); // scanner.nextInt();

					tot = kor + eng + mat; avg = (double)tot/3; rank = 1; //반 등수 wrank = 1; //전교등수

					// 각각의 배열에 어디에 채워넣을까?
					names[ban-1][cnts[ban-1]] = name;
					infos[ban-1][cnts[ban-1]][0] = kor; 
					infos[ban-1][cnts[ban-1]][1] = eng;
					infos[ban-1][cnts[ban-1]][2] = mat; 
					infos[ban-1][cnts[ban-1]][3] = tot;
					avgs[ban-1][cnts[ban-1]] = avg; 
					infos[ban-1][cnts[ban-1]][4] = rank;
					infos[ban-1][cnts[ban-1]][5] = wrank;

					cnts[ban-1]++;

					System.out.print("> 학생 입력 계속 ? "); con = (char) System.in.read();
					System.in.skip(System.in.available()); } 
				while ( Character.toUpperCase(con)== 'Y' );

				//[반, 전교 등수 처리]

				//

				// [2] 
				for (int i = 0; i < cnts.length; i++) { // 비교할 모든 학생과 관련된 for문
				for(int j = 0; j < cnts[i]; j++) { // 
					infos[i][j][3]; // 총점 
					infos[i][j][4] = 1;
					// 반 등수 
					infos[i][j][5] = 1; // 전체 등수

					for (int i2 = 0; i2 < cnts.length; i2++) { for(int j2 = 0; j2 < cnts[i2];
							j2++ ) {

						if(infos[i][j][3] < infos[i2][j2][3]) { infos[i][j][5]++;

						if( i == 12) {
							infos[i][j][4]++; } //if

						} //if } //for } //for }

				}



					// fo // //[전교생 출력] //
					int totalCnt = cnts[0] + cnts[1] + cnts[2]; 
					inttotalCnt = IntStream.of(cnts).sum();


					System.out.printf("[전체 학생 수 : %d 명]\n" , totalCnt);

					for(int i = 0; i < cnts.length; i++) {
						System.out.printf("[%d]반 학생 수 : %d명\n", i+1, cnts[i]);

						//실제 그 반 학생 정보 출력 ...

						// 실제 그 반 학생 정보 출력... \
						for (int j = 0; j < cnts[i] ; j++) { System.out.printf(
						"\t%d.\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n" , j+1 , names[i][j] ,
						infos[i][j][0], infos[i][j][1] , infos[i][j][2], infos[i][j][3] , avgs[i][j]
								, infos[i][j][4], infos[i][j][5]); } // for j }



					}
					}}
				}
	}
