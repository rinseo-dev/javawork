package polyEx09;

public class Product {
	//필드 : 제품의 가격, 보너스
	int price;
	int bonusPoint;
	
	Product(int price){ //지역변수에는 '기본값'이 없으므로 값이 들어가는 생성자를 만들었다면, 자식 객체에도 값이 들어가는 공간이 필요함.아니면 오류 발생
		this.price = price;
		bonusPoint = price / 10;
	}
	
//	Product p = new Product(값); 형태로 객체를 생성하든가
//	Product()생성자를 만들어줘야 오류가 발생하지 않음.
}
