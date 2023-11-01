package interface04;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		System.out.println("---------------");
		
		//바퀴 교환 - 왼쪽 뒷바퀴를 한국타이어로 바꿈
		myCar.backLeftTire = new HankookTire();
		myCar.run();
	}
}
