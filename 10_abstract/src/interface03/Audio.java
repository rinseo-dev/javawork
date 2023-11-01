package interface03;

public class Audio implements RemoteControl {
	private int volume; //기본값 0

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) { 
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
				//= 100;이라고 최대치인 값을 명시해줘도 됨
		else if(volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
		//지역변수 volume에 200이 들어갔다면, if문을 통해 최대값으로 설정된 100이 this.volume을 통해 전역변수에 들어감
		//하지만, System.out.println("현재 Tv 볼륨 : " + volume);라고 출력하면 지역변수인 200을 출력하게 됨.지역변수가 우선순위.
		//그래서 실제 적용된 값을 출력하려면  this.volume으로 출력해줘야 MAX_VOLUME인 100이 출력됨
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	

}
