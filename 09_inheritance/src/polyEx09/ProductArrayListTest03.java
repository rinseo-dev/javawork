package polyEx09;

public class ProductArrayListTest03 {

	public static void main(String[] args) {
		Buyer03 b3 = new Buyer03();
		Tv tv = new Tv();
		Computer com = new Computer();
		Game game = new Game();
		
		b3.buy(tv);
		b3.buy(com);
		b3.buy(game);
		b3.buyList();
		
		b3.refund(com);
		b3.buyList();
	}

}
