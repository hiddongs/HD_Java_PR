package days21;

import java.io.FileReader;
import java.util.Properties;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// jdbc.properties -> Properties -> 환경설정 값 읽어와서 출력.
				String fileName = "jdbc.properties";
				
				Properties p = new Properties();
				
				// FileWriter / FileOutputStream 파일 쓰기
				// FileReader / FileInputStream 파일 읽기
				
				// getProperty() / getProp
				
		        // p.store();
				// p.storeToXML();
				
				// p.load(reader);
				// p.loadFromXML(in);
				
				try ( FileReader reader = new FileReader(fileName)) {
					p.load(reader);
					
					// p.list(System.out);
					String className = p.getProperty("className");
					String url = p.getProperty("url");
					String user = p.getProperty("user");
					String password = p.getProperty("password");
					
					System.out.println(className);
					System.out.println(url);
					System.out.println(user);
					System.out.println(password);
					
					
				}catch (Exception e) {
					System.out.println(e.toString());
				}
				//p.load(reader);
				
	}

}
