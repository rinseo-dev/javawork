package ex05;

//책 p403 3번
public class DaoTest {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		
		//DataAccessObject dao = new OracleDao(); //오라클의 자식객체가 들어있음.
		//이런 방식으로 호출해도 되지만, 아래처럼 작성해도 됨
		//그럼 dbWorkd()괄호 안에 OracleDao, MySqlDao의 주소가 들어감
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

	/*
	  실행결과
	  oracle or mysql DB에서 검색, 삽입, 수정 삭제,
	 */
}
