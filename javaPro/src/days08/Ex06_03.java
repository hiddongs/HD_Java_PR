package days08;

public class Ex06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[문제] 문자열을 역순으로 뒤집어서 문자열을 반환하는 메서드를 선언하세요
        String s = "abcde";
        s = reverse(s);
        System.out.println(s);    //"edcba"
 
	}

	private static String reverse(String s) {///****
		// TODO Auto-generated method stub
		char [] sReverse = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			sReverse[s.length()-1-i] = s.charAt(i);
		}
		
		String sr = String.valueOf(sReverse);
		
		return sr;
	}

}
