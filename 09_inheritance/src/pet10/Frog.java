package pet10;

public class Frog extends Pet{
	//아래 두 방법 모두 사용해도 되고, 하나의 인자만 받을 수도 있음
	Frog(String color) {
		super("개구리", color);
	}
	
	//Dog를 객체생성할 때 아무 것도 안넣으면 기본값에 들어감.
	Frog(){
		super("개구리","진연두");
	}
	
	//부모 클래스에서 오버라이드 해서 가져오는 것. 메서드에 값 집어넣기
	@Override
	void sound() {
		System.out.println("개굴");
	}
	
	@Override
	void pattern() {
		System.out.println("소주모델이다");
	}
}
