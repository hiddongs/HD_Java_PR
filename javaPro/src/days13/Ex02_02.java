package days13;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document();
		Document doc4 = new Document();
		Document doc5 = new Document();	
	}

}

class Document
{
	
	String fileName;
	static int count = 1;
	
	// 인스턴스 초기화 블럭 - 생성자가 초기화 될 때마다 호출 되는 블럭
	{
		count++;
	}
	
	public Document() {
		this(String.format("Noname%d.txt", count));
	}
	public Document(String fileName) {
		
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
	}
	
}