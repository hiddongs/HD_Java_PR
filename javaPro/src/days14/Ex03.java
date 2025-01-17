package days14;

/**
 * 
 * @author kenik
 * @date 2025. 1. 14. - 오전 11:44:49
 * @subject 싱글톤( Singleton ) - 특정 클래스에 대해 1개 객체 생성 패턴
 * 
 * @content  ㄴ 싱글톤 패턴은 일반적으로 자원관리( DB 처리 객체 )
 *           설정 정보 관리, 로깅 등을 위한 클래스에서 자주 사용됩니다.
 */

public class Ex03 {

	public static void main(String[] args) {
	
		/*
		
		BoardDAO dao1 = new BoardDAO();
		System.out.println(dao1.hashCode());
		BoardDAO dao2 = new BoardDAO();
		System.out.println(dao2.hashCode());
		BoardDAO dao3 = new BoardDAO();
		System.out.println(dao3.hashCode());
		
		*/
		
		BoardDAO dao = BoardDAO.getInstance();
		
		
		//days14.BoardDAO@3ac3fd8b
		System.out.println(dao);
		
		System.out.println(dao);
		System.out.println(dao);
		System.out.println(dao);
		
	}

}

// 싱글톤 패턴              CRUD

class BoardDAO { //Data Access Object
	
	
	private static BoardDAO dao;
	
	private BoardDAO() {
		
	}
	
	/*
	public static synchronized BoardDAO getInstance() {
		//Cannot use this in a static context( 문맥, 배경, 환경 )
		// return this.dao;
		
		if ( dao == null ) {
			
			dao = new BoardDAO();
		}
		return dao;
	}
	*/
	
	// 이중 확인 잠금 방식
	public static BoardDAO getInstance() {
	 if (dao == null) { // 첫 번째 체크
         synchronized (BoardDAO.class) {
             if (dao == null) { // 두 번째 체크
                 dao = new BoardDAO();
             }
         }
     }return dao;
}
}
