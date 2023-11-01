package interface04;

public class Car {
	//여기서 Tire는 interface Tire를 말함.
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new KumhoTire();
	Tire backLeftTire = new KumhoTire();
	Tire backRtightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRtightTire.roll();
	}
}
