package abs02;

public class SmartPhone extends Phone{

	SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("옆으로 밀어 전화를 받습니다");
	}

	@Override
	public void turnOff() {
		System.out.println("종료를 눌러 전화를 끊습니다");
	}
	/*
	void search() {
		System.out.println("검색을 합니다");
	}
	*/
	void search(String search) { //String 으로 검색어를 받음
		System.out.println(search + "을 검색했습니다");
	}
}
