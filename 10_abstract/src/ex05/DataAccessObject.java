package ex05;

public interface DataAccessObject {

	//abstract로 만들면 된다고..?그런데 이제 반환형이 없는 
	void select();
	void insert();
	void update();
	void delete();

}
