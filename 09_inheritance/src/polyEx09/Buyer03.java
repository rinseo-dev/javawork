package polyEx09;

import java.util.ArrayList;

public class Buyer03 { //<Object> 를 사용하면 자동으로 extends Object가 된 상태임.
	int money = 5000;
	int bonusPoint;
	
	//ArrayList<Object> aList = new ArrayList<Object>();//이렇게 사용해도 됨 모든 클래스가 Object를 상속해서 자동 형변환이 됨.
	ArrayList<Product> aList = new ArrayList<Product>(); // 10개 -> 20개 ->40개 순으로 늚
	
	
	int count;//기본값 0
	
	void buy(Product p){//Product타입으로 받음
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없음");
			return; 
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		aList.add(p);//proList[count++] = p;이렇게 배열에 넣었던 걸 ArrayList에 넣음.
		//ArrayList는 배열 안에 내 앞,뒤 객체의 주소를 갖고 있음
		//p는 내가 넣을 때 객체..?
		
		System.out.println(p + " 구입");
	}
	
	void refund(Product p) {
		if(aList.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "반품");
		}else {
			System.out.println("구입한 상품이 아니라 반품 불가");
		}
	}
	
	void buyList() {
		//물건을 산 총 금액 -i번째에 있는 값을 proList에 더하기
		//물건 리스트 출력하기
		
		int sum = 0;//합계를 구할 지역변수. 초기화값 지정해줘야햠.
		String list ="";
		if(aList.isEmpty()) { //aList가 텅비었다면
			System.out.println("구입한 제품이 없습니다");
		}
		
		//향상된for문은 배열에서만 사용가능함. ArrayList 에서는 사용 불가능
		
		//proList를 돌아서 price에 값을 넣어줘야 함
		//for문, 향상된 for문 둘 다 사용 가능
		for(int i=0; i<aList.size(); i++) { //aList 의 size를 얻어옴.
			Product p1 = aList.get(i);
			
			sum += p1.price;
			list += (i==aList.size()-1) ? p1 : p1 + ", "; //0번부터 시작해서 1개가 적어야 제일 마지막 거.
		}
		
		System.out.println("구입한 물품의 총합계 : " + sum + "만원입니다");
		System.out.println("구입한 물품 list : " + list);
		
	}
}

