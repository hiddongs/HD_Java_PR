package days11;

public class Student {


	// 필드, 입력받은 한 학생의 정보를 저장할 변수
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	public int rank;
	public double avg;
	public int wrank;

	// 메소드
	public String getStudentInfo() {
		return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
				, name, kor, eng, mat, tot, avg, rank);
	}
	
}
