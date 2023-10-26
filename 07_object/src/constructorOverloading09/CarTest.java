package constructorOverloading09;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("기아","K7","빨강");//객체 생성할 때 생성자 넣어줘야함.
		//Car메서드의 생성자 순서대로 company, model, color에 값이 들어감.
		//car1의 값들을 호출 할 때 car1에서 지정한 3개 값이 Car()안에 들어감.
		//생성자가 3개의 값을 반드시 넣으라고 했으므로 그렇게 작성해야만 객체생성이 됨.
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		
		System.out.println();
		
		Car car2 = new Car("현대","H8","노랑");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		
		System.out.println("-------------------");
		
		Car car3 = new Car();//매개변수 0개짜리 호출
		//오버로딩을 통해서 생성자가 없는 Car()를 만듦.
		//현재 값이 null, null, null, 0인 게 만들어짐
		//추가적으로 Car()에 this("삼성");을 선언해줬음
		//
		System.out.println("-------------------");
		
		Car car4 = new Car("삼성","SM7","흰색");//매개변수 3개짜리 호출
		Car car5 = new Car("BMW"); // 매개변수 1개짜리 호출
		Car car6 = new Car("벤츠","E클래스");//매개변수 2개짜리 호출
		
		/*
		Scanner sc = new Scanner();이때는 반드시 값을 넣어줘야함.
		매개변수 0개짜리 생성자가 없다는 의미.
		
		Scanner sc = new Scanner(System.in);
		Scanner(Object o){...}형태로 정의되어 있기 때문에 System.in이 없으면 오류남
		*/
		
	}
}
