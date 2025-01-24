package days18;

import java.util.Date;

public class Ex01_03 {

	public static void main(String[] args) {
		
		
		Date now = new Date();

		System.out.println(now.toLocaleString());
        System.out.println(now.getTime()); //  지우는 표시가 없는 메서드 그나마 안 없어지고 많이 쓸 메서드
        
		
		
		Date open = new Date(2024-1900, 12-1 ,23, 9,0,0);
	    
		
		
	    
		System.out.println(open.toString());
		
		// 2421800446

		
		System.out.println(now.getTime() - open.getTime());
		// 2421800446 -> 얼마나 날짜가 차이나는지 알 수가 있다.
	}

}
