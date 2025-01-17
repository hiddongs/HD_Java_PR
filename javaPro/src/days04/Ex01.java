package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String name;
		int kor, eng, math, total;
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름 입력 : ");
		name = br.readLine();
		
		System.out.print("> 국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("> 영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("> 수학 점수 입력 : ");
		math = Integer.parseInt(br.readLine());

		total = kor + eng + math;
		avg = (double)total / 3;
		
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor, eng, math, total, avg);
		
	}

		
		
}
