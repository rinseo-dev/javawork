package polymorphism07;

public class CarTest2 {

	//CarTest 설명용으로 축약해서 만들어진것 - 형변환설명3번 그림
	public static void main(String[] args) {
		
		FireCar fc = new FireCar();
		Car car = fc;
		fc = (FireCar)car;
		
		Car car2 = new Car(); // 상속받지 않아서 Car만 생성됨.
		FireCar fc2 = (FireCar)car2; //FireCar타입으로 형변환 하려면 객체가 2개 필요함.
		                             //하지만 FireCar객체가 생성되어있지않음. 형변환 불가능
	}

}
