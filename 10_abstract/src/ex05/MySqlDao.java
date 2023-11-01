package ex05;

//구현 클래스를 작성하라고 했으므로 DataAccessObject interface를 상속
public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySql DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}

}
