package days18;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		String source = "이름:홍길동, 나이:20살, 성별:여자";
		String name = null;
		int age = 0;
		boolean gender = false;
		
		
	
		String [] info = source.split(", ");
		
		for (int i = 0; i < info.length; i++) {
			name = info[0].split(":")[1];
			age = Integer.parseInt(info[1].split(":")[1].replaceAll("살", ""));
			gender = info[2].split(":")[1].equals("여자") ? false:true;
			
		}
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
		
	}
	
	
	

}
