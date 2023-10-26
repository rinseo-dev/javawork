package objCar05;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();//Car를 사용하기 위해서 객체 생성.
		
		Car fCar = new Car();
		
		fCar.company = "기아자동차";
		fCar.model = "K9";
		fCar.color = "흰색";
		fCar.speed = 0;
		//fCar.MAX_SPEED=250;변경 불가능.final지정된 상수라서.
		
		System.out.println("------내 차 정보------");
		System.out.println("회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model);
		System.out.println("컬러 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.MAX_SPEED);
		
		System.out.println("------친구 차 정보------");
		System.out.println("회사 : " + fCar.company);
		System.out.println("모델 : " + fCar.model);
		System.out.println("컬러 : " + fCar.color);
		System.out.println("최고 속도 : " + fCar.MAX_SPEED);//상수라 같은 값나옴
		
		/*
		myCar.run -> 변수 run
		myCar.run(); -> 메소드 run
		*/
		System.out.println("--------------------");

		//run()은 void형이어서 반환형(결과)이 없기 때문에 sysout에 넣을 수 없음.
		//void는 저장해서 사용할 수도 없음.
		System.out.print("내 차를 ");//이런 방식으로 먼저 '내 차를'을 출력해줘야함 
		myCar.run();
		
		/*
		System.out.println("내 차 현재 속도 : " + myCar.speedUp());
		System.out.println("내 차 현재 속도 : " + myCar.speedUp());
		//speedUp()으로 현재 속도를 불러올때마가 1씩 증가됨.
		System.out.println("내 차 현재 속도 : " + myCar.speedDown());
		//speed++, speed--를 쓸 때 사용했던 출력문.
		*/
		
		System.out.println("내 차 현재 속도 : " + myCar.speedUp(30));
		System.out.println("내 차 현재 속도 : " + myCar.speedUp(50));
		System.out.println("내 차 현재 속도 : " + myCar.speedDown(20));
		
		System.out.print("내 차를 ");
		myCar.run();//run()을 한번 더 실행하면 멈춤
		
		System.out.println();
		System.out.print("친구 차를 ");
		fCar.run();
		System.out.println("친구 차의 현재 속도 : " + fCar.speedUp(70));
		System.out.println("친구 차의 현재 속소 : " + fCar.speedDown(10));
		System.out.print("친구 차를 ");
		fCar.run();
		
	}

}
