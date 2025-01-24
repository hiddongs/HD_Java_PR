package days20;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 22. - 오전 11:07:25
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
	
//	Student s1 = new Student("2001001","김대원",25);
//	System.out.println(s1.hashCode()); // 985922955
//	
//	Student s2 = new Student("2001002","윤형식",26);
//	System.out.println(s2.hashCode()); // 1435804085
	
	
    // 순서 유지 O 중복 허용 X
	LinkedHashSet<Student>  sSet = new LinkedHashSet();
	
	sSet.add(new Student("2001001","김대원",25));
	sSet.add(new Student("2001002","윤형식",26));
	sSet.add(new Student("2001003","이찬희",28));
	
	sSet.add(new Student("2001001","김대원",25));
		
	System.out.println(sSet.size());
	// new Student() 객체 요소로 채워넣고 있습니다.
	
	} // main

} // class

class Student{
	
	String no;    // 학번   "001"  학번 -> 학생을 구별할 수 있는 고유한 필드
	String name;  // 학생명  
	int age;      // 나이

	public Student() {
		super();
	}
	public Student(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	@Override
	public int hashCode() {
		return this.no.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student && obj != null) {
			
			Student s = (Student) obj;
			return this.no.equals(s.no);
		}
		return super.equals(obj);
		
	}
	
	
	
	
}


