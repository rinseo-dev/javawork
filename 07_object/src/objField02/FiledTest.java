package objField02;

public class FiledTest {

	public static void main(String[] args) {

		//Car를 사용하기 위해서 main메소드가 있는 곳에 new키워드를 사용해서 객체를 생성함.
		Car car1 = new Car();
		//car1.xxx으로 하면 car1에서 생성한 주소를 기반으로 xxx을 가져오게 됨.
		
		String company = car1.company;
		System.out.println("car1 회사명 : " + company);
		
		System.out.println("car1 모델명 : " + car1.model);
		
		car1.model = "SM9";//car1의 model이 있는 곳을 SM9으로 변경함.
		System.out.println("car1 모델명 : " + car1.model);
		
		//car1.MAX_SPEED = 800; 상수는 한번 값을 넣으면 변경할 수 없다
		//final이 지정된 상수를 고치려고 하면 오류가 발생함.
		car1.maxSpeed = 800; //변수는 수정 가능
		
		
		System.out.println("-----------------------");
		
		Car car2 = new Car();
		System.out.println("car2 회사명 : " + car2.company);
		System.out.println("car2 모델명 : " + car2.model);
		//car1의 모델명은 sm9으로 변경됐지만 car2를 출력하면 sm7이 출력됨.
		//car1으로 생성한 객체와 데이터를 공유하지 않으므로 sm9으로 데이터 변경이 되지 않음.
		//각각의 객체는 데이터를 공유하지 않음
	}

}
