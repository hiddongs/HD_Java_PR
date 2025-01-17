package days14;

/**
 * 
 * @author kenik
 * @date 2025. 1. 14. - 오후 4:45:36
 * @subject
 * @content
 */



public class Ex10 {

	public static void main(String[] args) {
		
		
		IA obj = new Ex00();
		obj.aaa();
		
		IB obj2 = new Ex00();
		obj2.bbb();
		
		IC obj3 = new Ex00();
		obj3.ccc();
		obj3.aaa();
		obj3.bbb();
		obj3.ccc();
		
		

	}

}


interface IA{
	void aaa();
}

interface IB{
	void bbb();
}

interface IC extends IA,IB{
	
	// void aaa();
	// void bbb();
	void ccc();
	
	
}