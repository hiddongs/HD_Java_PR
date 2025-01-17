package days16;

public class Ex04_04 {

	public static void main(String[] args) {
		
		// 업로드      클라이언트 -> 서버
		// 다운로드            <- 
		// A 사람 a.txt         [upload 폴더]
		//                     a.txt

		// [문제]
		// path 라는 전체 경로 속에서 Sample.java 순수한 파일명...
		// 파일명에서 확장자 (.java) 만 얻어와서 출력...
		String path = "C:\\temp\\src\\Sample.java";
		String fileName; // Sample.java
		String ext;      // .java
		
	    int index = path.lastIndexOf("\\");
	    //System.out.println(index);
	    fileName = path.substring(index + 1);
	    System.out.println(fileName);
	    
	    
	    
	    /* [1] split(String regex)
	    String [] pathArr = path.split("\\");
	    fileName = pathArr[pathArr.length-1];
	    System.out.println(fileName);
	    
	    
	    ext = "." +  fileName.split("\\.")[1];
	    System.out.println(ext);
	    System.out.println("end");
	    
	    /*
	    int index = path.lastIndexOf(ext);
		String build = path.substring(0, index);
		System.out.println(build);
		build = parseInt
		String ext = path.substring(index, build - index);
		*/
		
		/*
		// [문제]
		
		String dir = "C:\\temp\\src\\";
		String fileName = "Sample.java";
		
		// 열고자 하는 전체 경로 dir + fileName
		//String path = dir + fileName;
		
		if(dir.endsWith("\\")) {
			
			dir += "\\";
			
		} // if
		
		// String path = dir + fileName;
		String path = String.join("", dir,fileName);
		// C:\temp\src\\sample.java
		
		
		 
		System.out.println(path);
		*/
	}

}
