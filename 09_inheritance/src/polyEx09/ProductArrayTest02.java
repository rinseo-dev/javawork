package polyEx09;

public class ProductArrayTest02 {

	public static void main(String[] args) {
		Buyer02 b = new Buyer02();
		
		b.buy(new Tv());
		b.buy(new Game());
		b.buy(new Computer());
		b.buyList();
	}

}
