package days17;

import java.util.StringTokenizer;

/**
 * 
 * @author kenik
 * @date 2025. 1. 17. - 오후 12:13:42
 * @subject StringTokenizer 클래스 X -> split()  권장
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		//              Token
		
		
		/* [권장]
		String regex = "\\s*,\\s*";
		String [] names = team1.split(regex);
		System.out.println("end");
		*/
		
		StringTokenizer st = new StringTokenizer(team1, ",");
		
		System.out.println(st.countTokens());
		
		// true/false st.hasMoreTokens()
		
		
		/*
		String name = st.nextToken();
		
		System.out.println(name);
		
		name = st.nextToken().trim();
		System.out.println(name);
		
		name = st.nextToken().trim();
		System.out.println(name);
		
		name = st.nextToken().trim();
		System.out.println(name);
		
		name = st.nextToken().trim();
		System.out.println(name);
		*/
		
		String name = null;
		while(st.hasMoreTokens() == false) {
			
			name = st.nextToken().trim();
			System.out.println(name);
			
		} // while
		
		System.out.println("end");
		
	}
	
}
