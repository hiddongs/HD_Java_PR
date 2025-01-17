package days05;

/**
 * 
 * @author kenik
 * @date 2024. 12. 30. - 오후 4:13:41
 * @subject
 * @content
 */


public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Scanner 한문자(char) 읽어오는 메소드 X
		
		// "가나다" -> '가' 첫 번째 한 문자를 얻어오는 방법
		// "가" = '가' + '\0'
		
		String name = "HONG GIL DONG";
		
		//문자열.length() 문자열 길이를 가져오는 함수
		//System.out.println(name.length());
		
		for (int i = 0; i < name.length(); i++)
		{
			System.out.println(name.charAt(i));
		}
		
		
	}

}
