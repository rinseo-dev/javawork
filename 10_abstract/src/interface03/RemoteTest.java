package interface03;

public class RemoteTest {

	public static void main(String[] args) {
		//인터페이스는 객체 생성을 할 수 없다
		//형변환 가능
		RemoteControl rc = null;
		
		Audio rcAudio = new Audio(); //주소 0x345가 할당됐다면, rc =rcAudio에도 같은 주소가 할당됨
		Tv rcTv = new Tv();//여기 주소 0x123이 할당됐다면,rc = rcTv;에도 0x123이 할당됐을 것.
		//언제든지 핋요한 값을 주소를 통해서 불러올 수 있음.
		
		//rc = new Audio();//이건 또 다른 주소를 가짐. 새로운 객체가 생성됐으므로
		
		//rc = new Audio(); // 0x465처럼 다른 주소를 가짐
		rc = rcAudio;//0x345
		rc.turnOn();
		rc.setVolume(200);//MAX_VOLUME이 100이므로 100출력됨
		rc.setVolume(-200);//MIN_VOLUME보다 작은 값이 들어오면 0
		rc.turnOff();
		
		System.out.println();
		
		//rc = new Tv();
		rc = rcTv;
		rc.turnOn();
		rc.setVolume(400);
		rc.turnOff();
		
		rc = rcAudio;//0x345
		// rc = new Audio();는 또 다른 주소를 가짐. 0x789
		
		//익명객체(새로운 클래스 정의) - 딱 한번만 사용할 때 씀.
		//단 한번 사용한다면 굳이 클래스를 만들 필요가 없으므로 익명객체를 활용함
		Tv tv = new Tv() {

			int a = 3;
			
			//새롭게 만든 메서드 사용 불가
			void tvShow() {
				System.out.println("익명객체 tvShow()메서드");
			}
			
			//메서드 재정의 사용
			//기존에 Tv에 만들어져있었던 내용을 재정의한 메서드는 사용할 수 있음
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다");
			}
		}; //Tv tv = new Tv(); 원래 이런 형탠데 중괄호를 붙여서 사용하기 때문에 마지막에 세미콜론 찍어야함.
		
		//tv.tvShow();//원래는 이런 형태로 사용할 수 있어야 함. 하지만 '정의되지 않음'
		
		//인터페이스는 익명객체로 생성할 수 있다
		//단 한번만 사용할 때 만들어 사용함.
		//Remotecontrol rc2 = new RemoteControl(); //RemoteControl은 인터페이스여서 객체를 생성할 수 없음.
		RemoteControl rc2 = new RemoteControl() { //괄호와 세미콜론 사이에 중괄호를 넣어주면 add unimplements버튼 활성화
					//익명객체에서 선언한 변수 이름 rc2로만 사용 가능함.
			int volume = 0; //이 변수는 원래 객체를 생성해야 사용할 수 있으므로, 익명객체에서는 잘 사용하지 않고 지역변수를 써도 됨.
			
			@Override
			public void turnOn() {
				System.out.println("익객체에서 라디오를 켬");
			}

			@Override
			public void turnOff() {
				System.out.println("익명객체에서 라디오를 끔");
			}

			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME)
					//volume = RemoteControl.MAX_VOLUME; //int volume=0;을 선언하지 않고 지역변수 사용하는 방법
					this.volume = RemoteControl.MAX_VOLUME;
						//= 100;이라고 최대치인 값을 명시해줘도 됨
				else if(volume < RemoteControl.MIN_VOLUME)
					this.volume = RemoteControl.MIN_VOLUME;
				else
					this.volume = volume;
				
				//int volume=0;을 선언하지 않고, if문에서도 this없이 지역변수 volume을 사용
				System.out.println("익명객체의 라디오 볼륨 : " + this.volume);
			}
			
		};
		rc2.turnOn();
		rc2.setVolume(45);
		rc2.turnOff();
		
		System.out.println("-----------------------------");
		
		//마지막에 rc에 Audio를 넣은 상황.
		rc.setMute(true);
		System.out.println("=============================");
		
		rc = new Radio();//rc를 Radio()로 변경
		rc.turnOn();
		rc.setMute(true);
		RemoteControl.info(); //info는 static이므로 클래스명.xxx로 불러옴
		rc.turnOff();
	}
}
