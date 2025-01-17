package days12;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정적으로 함수 선언하면 바로 사용가능 왜? 이미 메모리에 올라갔기 때문에
		dispA();
		
		//그러나 일반 함수는 같은 클래스 안에 있더라도 따로 객체로 선언해서 메모리에 올려주고 사용해야함
		Ex10 obj = new Ex10();
		obj.dispB();

	}
	
	public void dispB() {
		System.out.println(" dispB()...");
	}
	
	public static void dispA() {
		System.out.println(" dispA()...");
		
	}

}
