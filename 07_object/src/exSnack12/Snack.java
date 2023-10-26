package exSnack12;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	//생성자 2개
	Snack(){
	}
	
	Snack(String kind, String name, String flavor, int numOf, int price){
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	//getter/setter 메서드
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	
	public int getNumof() {
		return numOf;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return kind + ", " + name + ", " + flavor + ", " + numOf + ", " + price;
		//", "대신 \t도 사용 가능
	}
}
