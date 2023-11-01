package polymorphism07;

public class CarTest {

	public static void main(String[] args) {
		Car car = null;//주소를 넣을 수 있는 공간만 만듦
		
		//FireCat fc = new FireCat();인 경우 매개변수가 없는 메서드가 호출됨
		//FireCar.java에 매개변수 없는 메서드를 선언하지 않은 경우에는 오류로 표시됨.
		
		FireCar fc = new FireCar("E9","black");//매개변수가 2개인 메서드가 호출되면서 super를 통해 부모값에 있는 model, color에 값이 들어감.
		//FireCar fc2 = null;
		
		fc.getPower();
		fc.water();
		fc.speedUp();
		System.out.println(fc.info());
		
		FireCar fc2 = new FireCar();
		System.out.println(fc2.info());//생성자가 비어있는 메서드가 호출됨
		
		
		System.out.println("-------------------------------------------");
		//자식FireCar의 자료형을 부모Car의 자료형에 넣을 수 있음.
		//자동형변환 : 자손타입 -> 부모타입으로 형변환
		//다형성 : 호출은 같은 이름이지만 어떤 객체가 있느냐에 따라 값이 달라짐
		car = fc; //fc값 중 car만 사용하도록 정의됨. FireCar값을 사용할 수 없음.
		System.out.println(car.info()); //여기서는 E9, black값을 넣은게 출력됨
		car = fc2; //여기서도 FireCar를 사용할 수 없음.
		System.out.println(car.info()); //여기서는 기존의 매개변수가 없는 메서드 값이 출력됨.
		
		
		//강제형변환 : 부모타입 -> 자손타입 형변환
		FireCar fc3 = null;
		fc3 = (FireCar)car; //자식타입으로 객체생성 -> Car타입으로 형변환 -> 자식타입으로 형변환 
		//여기서 car가 가리키는 주소는 fc2?
		
		//강제형변환하려는 객체가 '자식타입'으로 만들어진건지 확인 해야 함. 처음부터 '자식타입'이 아닌 상태였다면 자식객체로 변환할 수 없음.
		
		Car car2 = new Car();
		//형변환 불가
		//fc2 = car2; //Car타입으로 생성(car객체로만 생성됨), 자식객체로 변환하려면 객체 2개(자식객체, car객체)가 필요.
				    //처음부터 자식객체가 없었다고..?그런 이유로 형변환 안된다고 함.
					//fc2 = (FireCar)car2;이렇게 캐스팅(형변환)해도 안됨. 근본적인 문제
	}

}
