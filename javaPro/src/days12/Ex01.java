package days12;
import days11.Student;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days09.Ex04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT = 3;
		
	

		Student [][]students = new Student[CLASS_COUNT][STUDENT_COUNT];

		int con = 'y';

		int [] cnts = new int[CLASS_COUNT];

		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		tot = kor + eng + mat;
		avg = (double)tot/3;
		rank = 1;

		Scanner sc = new Scanner(System.in);
		do {
			// 
			
			int ban = new Random().nextInt(3)+1;
			int banIndex = ban - 1;
			int banNoIndex = cnts[banIndex];
			
			System.out.printf("%d반 [%d]번 학생의 이름 국, 영, 수 입력", ban,banIndex+1);
			
			name = Ex04.getName() ; //scanner.next();
			kor = Ex04.getScore(); //   scanner.nextInt();
			eng = Ex04.getScore(); //   scanner.nextInt();
			mat = Ex04.getScore(); //   scanner.nextInt();

			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;

			// 각각의 배열에 어디에 채워넣을까?
			students[banIndex][banNoIndex] = new Student();

			students[banIndex][banNoIndex].name = name;
			students[banIndex][banNoIndex].kor = kor;
			students[banIndex][banNoIndex].eng = eng;
			students[banIndex][banNoIndex].mat = mat;
			students[banIndex][banNoIndex].tot = tot;
			students[banIndex][banNoIndex].avg = avg;
			students[banIndex][banNoIndex].rank = rank;
			students[banIndex][banNoIndex].wrank = wrank; 
			cnts[banIndex]++;

			names[ban-1][cnts[ban-1]] = name;
			infos[ban-1][cnts[ban-1]][0] = kor; 
			infos[ban-1][cnts[ban-1]][1] = eng;
			infos[ban-1][cnts[ban-1]][2] = mat; 
			infos[ban-1][cnts[ban-1]][3] = tot;
			avgs[ban-1][cnts[ban-1]] = avg; 
			infos[ban-1][cnts[ban-1]][4] = rank;
			infos[ban-1][cnts[ban-1]][5] = wrank;

			System.out.print("> 학생 입력 계속 ? "); con = (char) System.in.read();
			System.in.skip(System.in.available()); } 
		while ( Character.toUpperCase(con)== 'Y' );

		processingRanks(students, cnts);


		// 전교생 출력
		printStudents(students, cnts);	
}

private static void printStudents(Student[][] students, int[] cnts) {
	

	// fo // //[전교생 출력] //
	//int totalCnt = cnts[0] + cnts[1] + cnts[2]; 
	int totalCnt = IntStream.of(cnts).sum();


	System.out.printf("[전체 학생 수 : %d 명]\n" , totalCnt);

	for(int i = 0; i < cnts.length; i++) {
		System.out.printf("[%d]반 학생 수 : %d명\n", i+1, cnts[i]);

		//실제 그 반 학생 정보 출력 ...

		// 실제 그 반 학생 정보 출력... \
		for (int j = 0; j < cnts[i] ; j++) { 
			System.out.printf( "\t%d.\t%s\n" , j+1 , students[i][j].getStudentInfo());
	         
		// for j 
		}


		
	}
}

private static void processingRanks(Student [][] students, int [] cnts) {
	for (int i = 0; i < cnts.length; i++) { // 비교할 모든 학생과 관련된 for문
		for(int j = 0; j < cnts[i]; j++) { // 
			//infos[i][j][3]; // 총점 
			students[i][j].rank = 1;
			// 반 등수 
			students[i][j].wrank = 1;; // 전체 등수

			for (int i2 = 0; i2 < cnts.length; i2++) { 
				for(int j2 = 0; j2 < cnts[i2]; j2++ ) {

				if(infos[i][j][3] < infos[i2][j2][3]) { 
					infos[i][j][5]++;
				}
				if( i == 12) {
					infos[i][j][4]++; } //if

				} //if } //for } //for }

			}

		}


	}
}
}