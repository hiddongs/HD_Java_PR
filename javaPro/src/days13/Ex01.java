package days13;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
           10. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
	           String n = "keNik";   
	           String m= "kKnie";    
		 */
		
		 String n = "keNik";   
         String m= "kKnie";    
         
         // n = toUpperCase(n); 메소드
         n = n.toUpperCase(); // "KENIK" 오름차순 정렬
         m = n.toUpperCase(); // "KKNIE" 오름차순 정렬
         System.out.println(n);
         
         
         /*
         // n, m 문자열이 같냐
         // String -> Char[] 변환 -> 정렬 후 ->  String
         char [] nArr = n.toCharArray();
         Arrays.sort(nArr);
         // System.out.println(Arrays.toString(nArr));
         //char [] -> String
         n = String.valueOf(nArr);
         */
         
         n = stringSort(n);
         m = stringSort(m);
         
         System.out.println(n);
         System.out.println(m);
         
         // 두 문자열 비교 : String.equlas()
         if(n.equals(m)) {
        	 
         }else {
        	 
        	 System.out.println("다르다");
        	 
         }
	}
	
	
	private static String stringSort(String str) {
		
		char [] nArr = str.toCharArray();
        Arrays.sort(nArr);
        return String.valueOf(nArr);
	
	}


	// "keNik";  
	public static String toUpperCase(String str) {
		
		String result = "";
		char ch = '\u0000';
		for (int i = 0; i < str.length(); i++) {
			
			ch = str.charAt(i);
			//Character.isLowerCase(ch)
			//if('a' <= ch && ch <= 'z') {
			
			if(Character.isLowerCase(ch)) {
				
				result += (char) (ch - 32);
			}
			else {
				result += ch;
			}
			
		}
		
		
		return result;
		
		
	}

}
