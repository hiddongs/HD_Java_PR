package days14;

public class MySQLDBConn implements IDBConn{

	@Override
	public void open() {
		System.out.println(" MySql DB 연결 구현 코딩 ");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(" MySql 조회 구현 코딩");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
