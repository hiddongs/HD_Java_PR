package days14;

/**
 * 
 * @author kenik
 * @date 2025. 1. 14. - 오후 3:22:21
 * @subject 인터페이스 설명 예제.
 * @content
 *          [인터페이스 사용 장점]
 *          1. 개발 시간을 단축.
 *             인터페이스 
 *             추상 메서드();
 *             추상 메서드();
 *             추상 메서드();
 * 
 *             class 클래스명 implements 인터페이스 {
 *             
 *             추상 메서드();
 *             추상 메서드();
 *             추상 메서드();
 * 
 *             }
 *             
 *          2. 표준화 가능.
 *             move(){
 *             attack(){
 *             
 *          }
 *          3. 서로 관련 없는 클래스들에게 관계를 맺어 줄 수도 있다.
 *          
 *          예) DBS - Oracle / MS SQL/ MY SQL 등등
 *                   연결
 *                   
 *                   
 *             IDBConn
 *          
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		// 
		IDBConn dbconn = new MSSQLDBConn();
		
		dbconn.open();
		dbconn.select();
		
		

	}

}
