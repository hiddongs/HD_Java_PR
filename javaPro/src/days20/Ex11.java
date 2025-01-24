package days20;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 22. - 오후 5:06:09
 * @subject Map - TreeMap, Hashtable, [HashMap], LinkedHashMap
 * @content  Properties 컬렉션 클래스 
 *                ㄴ Key String, value String
 *                ㄴ Hashtable의 자식 클래스이다.
 *                ㄴ 환경설정
 *                     속성(property) = 속성값
 * 
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 오라클 DBMS
		// DATABASE 연결하기 위한 설정값...
		
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";
		
		// 1) 위의 4개 설정값 -> Properties 저장 -> 파일 저장.
		Properties p = new Properties();
		
		// p.put(k, v); 이것도 가능하지만 
		p.setProperty("className", className); // 이걸 쓰는 게 더 낫다
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
	
		// {password=tiger, className=oracle.jdbc.driver.OracleDriver, user=scott, url=jdbc:oracle:thin:@localhost:1521:xe}
		System.out.println(p);
		
		// 파일로 저장. FileWriter/FileReader
		/*  **********************************
		String fileName = "jdbc.properties";  // 이걸 더 많이 쓰긴 한다
		try (FileWriter writer = new FileWriter(fileName)) {
			
			p.store(writer, "[DB ConnectionString]");
			System.out.println("= Save End =");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.toString());
		}
		
	     **************************************	*/ 
		
		// XML 파일 저장

		String fileName = "jdbc.xml";
		try (FileOutputStream fos = new FileOutputStream(fileName)) {
			
			// p.store(writer, "[DB ConnectionString]");
			p.storeToXML(fos, "[DB ConnectionString]" , "UTF-8");
			System.out.println("= Save End =");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.toString());
		}
		
		// 내일...
		// 2)              <-                 <- 
		
		
		
	} // main

} // class
