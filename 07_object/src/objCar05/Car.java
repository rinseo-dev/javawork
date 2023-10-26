package objCar05;

//클래스에는 필드, 메서드, 생성자만 들어감.
public class Car {//public이 없으면 default임.
	
	//필드 - 속성
	public String company = "현대자동차";//접근제한자Test.java에서 사용하기 위해 public 붙임
	String model = "그랜저";
	String color = "검정";
	final int MAX_SPEED = 350; //상수. 고정된 값
	int speed;	//기본값 : 0, 현재 스피드
	boolean run; //기본값 : false
	
	//메소드 - 동작, 기능
	public void run() {//다른 패키지에서 사용할 수 있게 public추가했음.
		//run()를 실행할때마다 run , !run으로 값이 바뀌는 상태.
		run = !run;//run에 !run을 넣어주고 시작
				
		// !run, run()를 호출 했을 때, 필드 run값을 true로 변경
		if(run) {
			System.out.println("출발합니다. 붕붕");
		}else {
			System.out.println("운행을 멈춥니다");
		}
	}
	
	/*
	int speedUp() {
		++speed; //speedUp을 호출하면 speed값이 증가
		return speed;
	}
	
	int speedDown() {
		--speed;
		return speed;
	}
	*/
	
	//매개변수가 있는 speed 조절
	int speedUp(int speed) { //여기서 speed는 지역변수
		this.speed  = speed;
		//this를 사용하면 객체를 생성한 '나 자신'이라고 봐야.
		//그래서 this.speed는 필드에서 지정한 speed
		return this.speed;//그냥 speed를 리턴하면 지역변수 speed가 호출됨.
		//this.speed라고 붙이면 '클래스변수'가 됨
	}
	
	//전역변수 사용 (뭐가 전역변수지..?) speedDown?
	int speedDown(int speed) {
		this.speed = speed;
		return this.speed;
	}
	
	
}
