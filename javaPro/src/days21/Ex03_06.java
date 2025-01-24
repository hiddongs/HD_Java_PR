package days21;

import java.time.temporal.JulianFields;
import java.util.ArrayList;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 23. - 오전 11:23:22
 * @subject 와일드 카드 ??
 * @content 
 *          <? extends T> T의 자손만 가능
 *          <? super T>   T의 조상(부모)만 가능
 *          <?> == <? extends Object> 타입 제한 없음 전부 사용 가능
 */
public class Ex03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		Juice juice = Juicer.makeJuice(fruitBox);
	    System.out.println(juice);
	    
	    // The method makeJuice(FruitBox<Fruit>) in the type Juicer is not applicable for the arguments (FruitBox<Apple>)
	    FruitBox<Apple> appleBox = new FruitBox<Fruit>();
	    juice = Juicer.makeJuice(appleBox);
	    System.out.println(juice);
	    */
		
		// [2] 제네릭 메서드를 호출하는 방법
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		// Juice juice = Juicer.<Fruit>makeJuice(fruitBox);
		Juice juice = Juicer.makeJuice(fruitBox); // 생략 가능
	    System.out.println(juice);
	}

}

class Fruit  {
	public String toString() { return  "Fruit";  }
}

class Apple extends Fruit {
	public String toString() { return  "Apple";  }
}

class Grape extends Fruit {
	public String toString() { return  "Grape";  }
}

class Box05<T> {
	
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		this.list.add(item);
		
	}
	T get(int i) {
		return this.list.get(i);
	}
	int size() {
		
		return this.list.size();
	}
	
	public String toString() {
		return this.list.toString();
	}
}

class FruitBox<T extends Fruit> extends Box05<T>{
	
}
// 쥬스
class Juice {
	
	// 구현
}

// 주스를 만드는 기기

class Juicer{
	
	public static void printAll (
			ArrayList<? extends Fruit> list,
			ArrayList<? extends Fruit> list2) {
			for(Fruit fruit : list2) {
				
				System.out.println(fruit);
			} // foreach
			
	}
	
	
	// [3] 위의 [2] 메서드를 " 제네릭 메서드 " 로 선언
	// ㄴ 리턴 자료형 앞에 <T> 타입변수를 선언
	// 제네릭 클래스의 <T>와는 별개 X
	/*
	static <T extends Fruit>  makeJuice(FruitBox<? extends Fruit> box) {

		return new Juice();


	}
	*/
	
	// [2] 와일드 카드를 이용해서 처리
	//                 Fruit 를 물려받은 무엇이든 간에 FruitBox 의 자식으로 쓰겠다는 의미
	static Juice makeJuice(FruitBox<? extends Fruit> box) {

		return new Juice();


	}
	
	/*
	static Juice makeJuice(FruitBox<Fruit> box) {

		return new Juice();


	}
	// 오버로딩 (중복함수)
	// Erasure of method makeJuice(FruitBox<Apple>) is the same as another method in type Juicer
	static Juice makeJuice(FruitBox<Apple> box) {

		return new Juice();


	}*/
}