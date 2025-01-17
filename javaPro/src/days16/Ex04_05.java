package days16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author kenik
 * @date 2025. 1. 16. - 오후 3:25:41
 * @subject
 * @content
 */

public class Ex04_05 {

	public static void main(String[] args) {
		
		String team1 = "권용법, 김대원, 김민곤, 김하은, 박세훈";
		
		String regex = "\\s*,\\s*";
		String [] nameArr = team1.split(regex);

		// System.out.println(Arrays.toString(nameArr));
		
		// [람다와 스트림]
		//            T...a
		//            T String
		// String []   -> List<String> 변환
		
		/*
		List<String> list = Arrays.asList(nameArr);
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
			
				
				System.out.println(name);
			}
			
		});
		*/
		// [2]
		
		Arrays.asList(nameArr).forEach(name -> System.out.println(name));
		
		// [3]
		
		Arrays.asList(nameArr).forEach(System.out::println);
		/*
		  <ol>
		     <li>권용법</li>	
		     <li>김대원</li>	
		     <li>김민곤</li>	
		     <li>김하은</li>	
		     <li>박세훈</li>	
		  </ol>	  
		 */
		
		/*
		String content  = "<ol>";
		for(int i = 0; i < nameArr.length; i++) {
			content += String.format("<li>%s<li>", nameArr[i]);
		} // for i
		content += "</ol>";
				
	    System.out.println(content);
	    */
		String content = 
		"<ol><li>".concat(String.join("</li><li>", nameArr).concat("</li></ol>"));
		System.out.println(content);
	}

}
