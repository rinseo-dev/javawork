package polyEx09;

public class Buyer {
	int money = 5000;
	int bonusPoint;
	
	/*
	Computer, Game, Tv로 서로 자료형이 다 다름
	이렇게 각각 만들면 복잡함
	void buy(Computer c){}
	void buy(Game g) {}
	void buy(Tv tv) {}
	
	부모타입을 사용하면 한번에 해결 가능함.
	*/
	
	//이렇게 부모타입을 사용하면 해결됨. 이래서 부모타입을 쓰는 것
	void buy(Product p){//product를 사용하면 자동형변환으로 컴퓨터,게임,티비 모든 객체가 올 수 있음
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없음");
			return; //여기서 왜 리턴함..?if에 하는건가
		}
		money -= p.price;//price - 부모클래스가 가진 금액. 제품에 따라 다른 금액이 들어옴
		//총 액에서 선택한 제품만큼의 금액이 차감됨
		
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + " 구입");
		
	}
}

