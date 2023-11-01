package abs02;

public class FolderPhone extends Phone{

	FolderPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		 System.out.println("위로 열어 전화를 받습니다");
	}

	@Override
	public void turnOff() {
		System.out.println("종료를 눌러 전화를 끊습니다");
	}

	void message(String msg) { //String으로 메시지값 받음
		System.out.println(msg +"를 받았습니다");
	}
}
