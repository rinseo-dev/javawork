package objStream02;

import java.io.Serializable;

//객제 자체를 입출력 하고자 하면 반드시 '직렬화'과정 필수
/*
 * 직렬화(serialization) : 객체를 스트림으로 만드는 작업
 *  					 멤버변수만 직렬화 대상이 됨
 *  
 *  사용하는 이유 : 객체를 만들어 놓은 것들은 언겐가는(실행이 멈출경우) 소멸됨
 *  			 미리 파일로 저장해놓으면 필요할 때 다시 불러와서 사용 가능.
 *  
 *  main에서 객체를 생성해서 여기 저기서 사용하고 있었을 경우, main이 멈추면 자료가 날아감
 *  하지만 직렬화를 해놓으면 자료를 저장해놓을 수 있음.
 *  
 */

//implements Serializable하면 직렬화 됨
public class Phone implements Serializable { //implements는 인터페이스로 만들어져있다는 것. import해줌.
	private String name;
	private int price;
	
	public Phone() {
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}

}
