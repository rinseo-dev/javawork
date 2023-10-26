package 접근제한11;

import ex02.Car;

//import objCar05.Car;

public class 접근제한자Test {

	public static void main(String[] args) {

		
		접근제한 b1 = new 접근제한();
		/*
		b1.balance = 100_000_000;//private로 선언됐으므로 접근 불가능
		System.out.println(b1.balance);//출력도 안됨
		*/
		
		b1.deposit(50000);
		System.out.println("현재 잔액 : " + b1.getBalance());//입금 후 잔액
		
		b1.withdraw(30000);
		
		int balance = b1.getBalance();//잔액 값을 받아옴
		System.out.println("현재 잔액 : " + balance);//출금 후 잔액
		
		/*
		//objCar05패키지의 Car.java에 선언된 값들을 가져올 것
		Car car = new Car();//import를 objCar05로 선택
		//objCar05에 있는 Car클래스를 가져옴.- public으로 선언된 거라 가능.
		//그래서 클래스에는 default를 사용하지 않고 대부분 public을 사용함
		
		//car.company;//이걸 사용하려면 company를 public으로 바꾸든가, getter/setter를 만들어야 사용 가능
		System.out.println(car.company);
		//objCar05패키지-Car.java에서 String company에 public을 붙여서 다른 곳에서 호출 가능하게 함
		
		car.run();//void run()에 public붙여서 다른 패키지에서 사용 가능하게 수정.
		*/
		
		Car car = new Car();
		//07_object 우클릭-프로퍼티스-빌드패스-프로젝트탭-클래스패스 선택-add에서
		//06_Array프로젝트를 선택하고 apply.
		//Car()를 사용하기 위해 ex02를 import할 수 있게 됨.
		
	}	

}
