package abs01;

public class PetTest {

	public static void main(String[] args) {
		/*
		추상클래스는 객체를 생성할 수 없음.
		Pet pet = new Pet("강아지","흰색");//Cannot instantiate the type Pet
		추상메서드에 실행부분이 없으면 오류 발생함.
		*/
		
		Dog dog = new Dog("검정");
		
		//부모의 자료형으로 형변환 할 수 없다는 내용은 없으므로 형변환 가능
		//Pet pet = dog;
		
		//형변환 가능
		//자식객체를 만들어서 부모의 주소에 넣는것
		Pet pet = new Dog("갈색");
	}

}
