package days21;



/**
 * 
 * @author goddxmn
 * @date 2025. 1. 23. - 오후 12:36:37
 * @subject [ 열거형에 멤버를 추가할 때 ]
 * @content
 */
public class Ex04_04 {

	
	// The constructor Ex04_04.Direction(int) is undefined

	enum Direction { 
		
		EAST(100, ">"), SOUTH(200, "V"), WEST(300, "<"), NORTH(400, "^");
		
		
		
		// 필드
		private final int value; // 100, 200, 300, 400
		private final String symbol;
		
		// 생성자
		
		/*
		private Direction(int value) {
			this.value = value;
			
			
		}

         */
		private Direction(int value, String symbol) {
			
			this.value = value;
			this.symbol = symbol;
		}

		public int getValue() {
			return value;
		}

		public String getSymbol() {
			return symbol;
		}
		
		// 추상메서드 선언할 수 있다.
		// abstract int test();
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Direction [] dirArr = Direction.values();
		for( Direction d : dirArr ) {
			System.out.println( d.name() + "/" + d.getValue() + "/" + d.getSymbol());
		}
		System.out.println(" END ");
		
		
	}

}

/*

 enum Direction { EAST, SOUTH, WEST, NORTH }  열거형(enum) 선언
        ↓
   실행될 때 컴파일러가 아래처럼 클래스 변환해서 내부적으로 실행한다 
        ↓
   class Direction{
        static final Direction EAST = new Direction("EAST"); // 열거형은 객체라는 것을 알 수 있다.
        static final Direction SOUTH = new Direction("SOUTH");
        static final Direction WEST = new Direction("WEST");
        static final Direction NORTH = new Direction("NORTH");
   } 
 
 
 
*/