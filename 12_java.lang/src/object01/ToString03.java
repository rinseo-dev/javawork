package object01;

import java.util.Date;

class Card{
	String kind;
	int number;
	
	//생성자
	Card(){
		this("SPADE" , 1); //kind, number값을 호출
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}

public class ToString03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART",10);
		
		//toString()을  오버라딩 하지 않으면 c1.toString() 방식으로 출력해도 16진수 주소로 출력됨
		//주소 - ‘클래스이름@16진수해시코드’로 구성된 문자정보
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//오버라이딩이 된 상태에서는 c1을 출력해도 toString한 값으로 출력됨
		System.out.println(c1);//변수 이름만 호출해줘도 .toString()이 생락된 것과 같이 출력됨
		
		//오버라이딩 전 출력문
		//object01.Card@6f2b958e
		//object01.Card@5e91993f
		
		//오버라이딩 후 출력문
		//kind : SPADE, number : 1
		//kind : HEART, number : 10
		
		//String, Date클래스는 이미 toString이 오버라이딩이 되어 있는 걸 가져와서 사용하는 것.
		String str = new String("korea");
		Date today = new Date();//Date는 util에서 가져오므로 import
		
		//toString이 오버라이딩 되어 있어서 korea,날짜가 출력됨
		//str.toString(), today.toString() 으로 사용해도 되지만 생략된 상태
		 System.out.println(str);
		 System.out.println(today);
		 
		
		
	}

}
