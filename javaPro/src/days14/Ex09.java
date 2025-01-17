package days14;
/**
 * 
 * @author kenik
 * @date 2025. 1. 14. - 오후 4:15:29
 * @subject 인터페이스
 * @content   ㄴ  상수, 추상메서드
 *            ㄴ  *** jdk1.8 static 메서드, default 메서드 ***
 */
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parseable.test();
		
		// html 문서를 파싱(구문분석)을 해서 내가 원하는 내용 얻어오기.
		//  xml 문서를 파싱(구문분석)을 해서 내가 원하는 내용 얻어오기.

		
		String docType = "xml";
		String fileName = "sample.xml"; // xml 문서 파일명
		
		// 업캐스팅 개념, 다형성 개념
		Parseable parser = ParserManager.getParser(docType);
		parser.parse(fileName);
		parser.print();
		System.out.println(" end ");
	}

	
}


interface Parseable {
	
	// 구문 분석하는 메서드 ( 추상 메서드로 )
	
	void parse(String fileName);
	
	default void print() {
		System.out.println("인쇄 기능 구현");
	}
	
	static void test() {
		System.out.println("test...");
	}
	
	
	
}

// 인터페이스들끼리의 상속 
interface ParseablePlus extends Parseable{
	
	// 인쇄하는 추상 메서드
	
		void print();
	
}

//HTML 문서를 파싱하는 클래스 (파서)
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("HTML 파일 구문 분석 메서드 ");
		
	}
	
}

class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("XML 파일 구문 분석 메서드 ");
		
	}
	
	// 직접 print() 구현
	// 인터페이스 안에 default 메서드는 무시가 된다
	public void print() {
		System.out.println("코딩 직접 구현...");
	}
	
}

//2020년 개발자
class PDFParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("PDF 파일 구문 분석 메서드 ");
		
	}
	
}

//2025년 개발자
class WORDParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("WORD 파일 구문 분석 메서드 ");
		
	}
	
}

// HTMLParser, XMlParser 여러 개의 파서가 존재할 수 있다.
// 관리하는
class ParserManager{

	public static Parseable getParser(String docType) {

		Parseable parser = null;

		switch (docType) {
		case "xml":

			parser = new XMLParser();
			break;

		default :
			
			parser = new HTMLParser();
			break;

			
			
		}
		return parser;

	}
}