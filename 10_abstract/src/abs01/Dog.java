package abs01;

public class Dog extends Pet {
	//Dog()만 생성된 상태에서 클래스이름 Dog에 밑줄뜸
	//unimplemented methods생겨서 클릭하면 아래 오버라이드된 sound, pattern생김
	/*
	Dog(String kind, String color) {
		super(kind, color);
	}
	*/
	Dog(String color) {
		super("강아지", color);
	}

	//추상메서드는 반드시 오버라이딩하여 구현해야 한다
	//만약 구현내용이 없으면 빈 채로 놔두어도 된다
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void pattern() {
	}
	
}
