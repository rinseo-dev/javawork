package objConstructor07;

public class Car {
	String company;//여긴 전역변수
	String model;
	String color;
	int speed;

	//클래스 이름과 동일한 이름으로 생성자 작성. 사용자에게서 받을 값들
	Car(String company, String model, String color){//여기는 지역변수
		System.out.println("생성자 호출 : ");
		this.company = company;
		//this없이 company를 사용하면 지역변수를 사용하는 것이므로 Car의 생성자인 company에 값이 다시 들어감.
		//this.company로 작성해주면 전역변수인 필드값 company에 값이 들어감.
		this.model = model;
		this.color = color;//지역변수를 통해서 전역변수에 입력..?
	}
	//CarTest.java에서 car1, car2로 넘어온 생성자들이 활용되는 것
	//car1을 기준으로 기아->(지역변수)company ->this.company->(전역변수)String company로 감
	//그래서 car1.company를 출력하면 "기아"가 출력됨.
}
