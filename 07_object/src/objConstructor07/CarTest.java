package objConstructor07;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("기아","K7","빨강");//객체 생성할 때 생성자 넣어줘야함.
		//Car메서드의 생성자 순서대로 company, model, color에 값이 들어감.
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		
		System.out.println();
		
		Car car2 = new Car("현대","H8","노랑");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
	}
	
	//car1의 값들을 호출 할 때 car1에서 지정한 3개 값이 Car()안에 들어감.
	//

}
