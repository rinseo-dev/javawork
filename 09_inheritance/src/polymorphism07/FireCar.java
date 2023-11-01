package polymorphism07;

public class FireCar extends Car{
	
	FireCar(){}//이 경우는  Car(){this("AIE2023","white");}가 호출됨.
	FireCar(String model, String color){
		super(model, color);//매개변수가 2개인 부모값을 불러오게 됨.
	}
	
	void water() {
		System.out.println("물을 뿌립니다");
	}
}
