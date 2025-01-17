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
public class Ex04_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //int 값 돌려줌 더이상 읽을게 없으면 -1 반환
		char one;
		System.out.println("문자 입력");
		one = (char) System.in.read(); //read()는 int 값으로 돌려주는 거라 형변환
		System.out.printf("%c\n", one);
		
		//System.in.read(); 얘를 쓰면 엔터키 -> \n, \r도 버퍼에 남아있어서 글자ㅏ 하나 입력하면 다음 글자 입력이 안된다
		/*해결법 1)
		 * 
		 * System.in.read();-> 이거를 지우고 싶은 만큼 더 써준다
		 * 
		 * 해결법 2)
		 * 
		 * 스킵함수를 사용한다
		 * System.in.skip(건너뛸 갯수);
		 * 그리고 아예 한글자 뒤에 다 지우고 싶으면
		 * System.in.skip(system.in.available()); 이게 더 유용하다
		 */
		
		System.out.println("문자 입력");
		one = (char) System.in.read(); //왜
		System.out.printf("%c\n", one);
	}

}
