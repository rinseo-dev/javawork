package polyEx09;

public class ProductTest01 {

	public static void main(String[] args) {
		Buyer b = new Buyer(); //Buyer클래스가 올라오고 New Buyer를 통해서 객체가 생성됨.
		//b.buy(new Product(5000)); //Product를 객체생성해서 넣어도 됨. 단, int형 숫자를 넣어줘야됨. 그래서 안씀
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Game());
	
		System.out.println("현재 남은 돈 : " + b.money + "만원입니다");
		System.out.println("보너스 점수 : " + b.bonusPoint + "점 입니다");
		
		b.buy(new Tv());//남은 금액보다 Tv금액이 비싸므로 잔액부족이라서 구매하지 못한다고 나옴
	}

}
