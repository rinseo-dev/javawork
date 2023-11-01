package polyEx09;

public class Game extends Product {
	
	Game(){
		super(500);
	}
	
	@Override
	public String toString() {//toString에는 주소값이 들어가있음.
		return "game";
	}
}

