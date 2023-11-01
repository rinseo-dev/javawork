package interface03;

public class Radio implements RemoteControl {
	private int volume; //기본값 0

	@Override
	public void turnOn() {
		System.out.println("Radio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio를 끕니다");
	}

	@Override
	public void setVolume(int volume) { 
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if(volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 Radio 볼륨 : " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {//setMute가 default로 정의되어 있으므로 더 큰 접근제한자인 public으로 가져옴
									   //default도 해봤는데 오류 발생. 왜 안되지.?같은 레벨인데..?
		System.out.println("재정의한 setMute 메서드");
		
		if(mute)
			System.out.println("재정의한 무음 처리 동작");
		else
			System.out.println("재정의한 무음 처리 해제");
	}
	

}
