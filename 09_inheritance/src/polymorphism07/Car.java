package polymorphism07;

public class Car {
	private boolean power;
	private String model;
	private String color;
	private final int MAX_SPEED = 300;
	private int speed;
	
	
	Car (){
		this("AIE2023","white");//Car()매개변수 없을 때 기본 값.
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	void getPower() {
		power = !power;
		if(power) {//power가 true이면
			 System.out.println("차가 출발합니다");			
		}else {
			System.out.println("차가 멈춥니다");
		}
	}
	
	 void speedUp() {
		 speed += 10;
	 }
	 
	 void speedDown() {
		 speed -= 10;
	 }
	 //speedUp, speedDown은 void라서 구문 내에 출력문이 없으면 출력 불가, return값이 없어서 저장도 불가능함.
	 //그래서 아래 info값 사용
	 
	 String info() {
		 return "모델 : " + model + ", 색상 : " + color +", 현재속도 : " + speed;
	 }
}
