package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 23. - 오전 10:08:31
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Box box = new Box();
//		box.setItem(100);
//		int item = (int) box.getItem(); // 다운캐스팅
//		System.out.println(item);
				
//		Box box2 = new Box();
//		box.setItem("문자열");
//		String sItem = (String) box2.getItem();
//		System.out.println(sItem);
//	
		
		
		// 컴파일 시에 타입을 결정하는 Box 클래스 선언
		Box<Integer> b1  =new Box<Integer>(); // 제네릭을 통해서 박스 객체 내의 변수의 타입을 인티저로 
		b1.setItem(100);
		int item = b1.getItem();
		System.out.println(item);
		
		Box<String> box2 = new Box<String>();
		box2.setItem("문자열");
		String sItem = box2.getItem();
		System.out.println(sItem);
		
		
//		ArrayList list = new ArrayList();
//		Collections.addAll(list, 3,5,2,4,1);
//		System.out.println(list);
		
//		int first = (int) list.get(0); // 형변환
//		
//		Iterator ir = list.iterator();
//		while (ir.hasNext()) {
//			int n = (int) ir.next();
//			System.out.println(n);
//			
//		}
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 3,5,2,4,1);
		System.out.println(list);
		
		Iterator<Integer> ir = list.iterator();
		while (ir.hasNext()) {
			int n = ir.next();
			System.out.println(n);
			
		}
		
		
		
		
		
		System.out.println(" end ");
	}

}
/*
class Box{
	
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
	
}
*/

// [ 제네릭 클래스 ] 클래스명 뒤에 <T> 붙이면 된다.
// T 타입변수 또는 타입 매개변수
// Box 원시타입( Raw Type )
// Box<T> 제네릭 클래스

class Box<T>{
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}

/*

class Box{
	
	private int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
	
}


class Box2{  // double
	
	private double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
	
	
}


class Box3{  // String
	
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
}

class Box4{  // Char
	
	private char item;

	public char getItem() {
		return item;
	}

	public void setItem(char item) {
		this.item = item;
	}
	
	
}
*/
