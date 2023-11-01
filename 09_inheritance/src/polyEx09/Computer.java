package polyEx09;

public class Computer extends Product {//생성자를 만들지 않으면 오류 발생함.
	//Computer라는 객체를 생성하려면 값이 필요함(price)값이 없으면 객체 생성 불가능
	
	//생성자 : 부모 생성자가 매개변수로 받는 생성자이면 반드시 자식에게도 생성자가 필요(부모의 매개변수로 전달할 값)
//	Computer(int price) {
//		super(price);//부모의 생성자 자동 호출.
//	}
	
	Computer(){
		super(1000);
	}
		//사용자마다 다른 값을 받을거라면 위 처럼 전달로 값을 받아도 되지만,
		//값이 고정되어 있는 경우라면
		//Computer(){super(1000000);} 이렇게 직접 전달할 값을 넣어도 됨. 

	
	//Computer c = new Computer(3000);//()안에 값을 넣어줘야 오류 발생하지 않음.
	//()사이의 값이 price에 들어가서 Product클래스에 들어감.
	
	@Override
	public String toString() {//toString에는 주소값이 들어가있음.
		return "computer";
	}
}

