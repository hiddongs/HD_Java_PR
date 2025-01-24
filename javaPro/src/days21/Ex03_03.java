package days21;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 23. - 오전 10:36:29
 * @subject [ 제네릭의 제한 ]
 * @content 1. 객체별로 다른 타입으로 지정해서 동작하도록 만든 기능이기 때문에
 *             static 필드는 선언할 수 없다. -> 제네릭은 제네릭을 사용하는게 실행할 때 메모리에 올라가는데
 *             static 은 프로그램 시작과 동시에 가기 때문에 순서가 안 맞다.
 *          2 . 따라서 static 메서드의 매개변수 타입으로 T를 사용할 수 없다.  X
 *          3. T 타입의 배열 선언 할 수 있다.
 *          
 */
public class Ex03_03 {
	
	
	

}

class Box2<T>{
	
	// static T item2; X 1) 설명

	// 2) 설명 
	/*
	 
	 static int compare(T t1, T t2){
	 
	    return 0;
	   
	 }
	 */
	// 3) 설명
	  
	T [] itemArr; // 가능
	
	
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
