package polyEx09;

public class Tv extends Product {
	
	Tv(){
		super(3000);
	}
	
	@Override
	public String toString() {//toString에는 주소값이 들어가있음.
		return "tv";
	}
}

