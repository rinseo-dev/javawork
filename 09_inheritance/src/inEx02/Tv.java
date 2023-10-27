package inEx02;
/*
클래스:TV에 공통으로 들어가는 기능
필드:전원, 채널, 볼륨,

클래스:스마트TV기능 - 일반TV기능을 사용할 수 있음.
필드:인터넷 기능, OTT

클래스:인공지능TV기능 - 일반TV, 스마트TV기능 모두 사용 할 수 있음
필드:내가 좋아하는 장르 추천

실행용 클래스

상속 순서) 일반TV -상속-> 스마트TV -상속-> 인공지능TV
*/
public class Tv {
	
	private String model;
	private int inch;
	
	private boolean power;
	private int channel;
	private int volume;

	public void power() {
		power = !power; //기존의 값을 바꿔서 false->true
		if(power)
			System.out.println("Tv를 켬");
		else
			System.out.println("Tv를 끔");
	}
	//getter/setter만 들어있어야 bean이라고 함
	
	//매개변수를 받아서 채널 변경
	public void setChannel(int channel) {
		this.channel = channel;//channel값을 받아서 전역변수 channel에 입력-
	}
	
	public int getChannel() {//채널 값을 알고 싶을 때 get으로 가져옴
		return channel;//channel에 있는 값 반환
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
}
