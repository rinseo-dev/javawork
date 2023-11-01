package interface03;

public interface RemoteControl {
	//interface에 들어가는 것은 모두 상수
	//상수
	public static final int MAX_VOLUME = 100; //final은 선언할 때 값을 넣어줘야함.
	
	//위에 이미 선언되어 있으므로 public static final을 붙이지 않으면 컴파일시 자동으로 붙인다
	int MIN_VOLUME = 0; //상수로 작성하면 static final을 안적어도 자동으로 붙는다고..?
	
	public abstract void turnOn(); //여기서 명시해둬서 아래엔 'abstract'을 안써도 자동으로 붙음.
	//public abstract를 붙이지 않으면 컴파일시 자동으로 붙인다
	void turnOff();
	void setVolume(int volume);
	
	//메서드 값을 추가하면 기존에 작성된 파일들(Tv,Audio.java)에서 재정의 다시 해줘야함.
	//이 때 default로 접근제한자를 지정해주고 실행부분{}을 지정하는 방법을 사용함. 전부 수정해주지 않아도 됨.
	
	//jdk 1.8버전부터 추가됨 ( static, default )
	//default 메서드 : 실행문을 넣을 수 있다
	//재정의 하지 않으면 아래 메서드 실행, 재정의하면 재정의한 메서드 호출
	default void setMute(boolean mute) {
		System.out.println("나중에 추가 된 메서드");
		if(mute) {
			System.out.println("무음 처리 완료");
		}else{
			System.out.println("무음 처리 해제");
		}
	}
	//static메서드 : 실행문을 넣을 수 있다
	static void info() { //static이므로 클래스 이름으로 호출 가능.
		System.out.println("static() 메서드 호출 가능");
	}
}
