package abs01;

//추상클래스 : 추상메서드가 1개 이상 있으면 반드시 추상클래스로 만들어야 함
//정의된 메서드 중 abstract가 하나라도 있으면 클래스에도 명시되어야 함.아니면 오류
public abstract class Pet {
	private String kind;
	private String color;
	
	Pet(String kind, String color){
		this.kind = kind;
		this.color = color;
	}

	//추상메서드 : 선언부만 있고 실행부분이 없는 메서드
	public abstract void sound();
	public abstract void pattern();
	
}
