package days18;

public class Ex09 {

	public static void main(String[] args) {
		
		
		
		// jdk1.8 java.time 패키지 및 하위 패키지 추가
		//               ㄴ 날짜, 시간 클래스
		
		// 1. 5개 - 설명
		
		// 2. j.t 패키지의 핵심 클래스
		// ㄴ 날짜 클래스, 시간 클래스 분리
		// 1) 날짜 : LocalDate 클래스
		// 2) 시간 : LocalTime 클래스
		// 3) 날짜 + 시간 : LocalDateTime 클래스
		// 4) 날짜 + 시간 + 시간대 : ZonedDateTime 클래스
        //     ㄴ 모두 Temporal, TemporalAccessor, TemporalAdjuster
		//        인터페이스를 구현한 클래스이다.
		
		
		// 3. 날짜와 날짜 사이의 간격 : Period 클래스
 		//    시간과 시간 사이의 간격 : Duration 클래스
		//     ㄴ TemporalAmount : 인터페이스를 구현한 클래스이다.
		
		
		// 4. 객체 생성
		//    ㄴ new 객체 생성 XXX
		//    ㄴ now(), of()
		
		// 5. 특정필드(년, 월, 일, 시, 분, 초, 요일 ...) 가져올 때
		//   ㄴ get(feild)  --> 필드값도 줘서 가능
		//   ㄴ getXXX() --> 각각 기능에 맞는 메서드 이용도 가능
		//   ㄴ plus() / minus()
		//   ㄴ with()
		// 6. TemporalUnit 인터페이스
		//      ㄴ 날짜, 시간의 단위 정의해 놓은 인터페이스
        //      ㄴ 구현한 클래스 : ChronoUnit 클래스
        // 7. TemporalFiled 인터페이스
		//    get(int field)
		//    ㄴ 필드(field)를 정의해 놓은 인터페이스
        //    ㄴ 구현한 클래스 : ChronoFiled 인터페이스		
	}

}
