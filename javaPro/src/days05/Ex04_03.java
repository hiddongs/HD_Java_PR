package days05;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author kenik
 * @date 2024. 12. 30. - 오후 4:40:30
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //int 값 돌려줌 더이상 읽을게 없으면 -1 반환
		char one;
		
		System.out.println("문자 입력");
		//int i = System.in.read();
		//System.out.printf("%d\n", i);
		
		
		one = (char) System.in.read(); //read()는 int 값으로 돌려주는 거라 형변환
		System.out.printf("%c\n", one);
	}

}
