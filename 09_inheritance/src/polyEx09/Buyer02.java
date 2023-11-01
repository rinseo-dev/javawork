package polyEx09;

public class Buyer02 {
	int money = 5000;
	int bonusPoint;
	
	Product[] proList = new Product[3];
	//배열의 개수가 제한적인 경우 효율이 떨어짐. 개수를 추가할때마다 인덱스 개수가 늘어나야함.
	//중간에 반품 같은 경우로 배열에서 값을 삭제해야 할 경우도 발생함. 배열만 사용하는 경우는 지우고 땡겨주고, 번거로움
	//이 때,벡터나 ArrayList를 사용하면 자동으로 일정 개수를 만들어주고, 초과하면 자동으로 개수를 늘려주므로 그걸 사용하는게 더 나음

	int count;//기본값 0
	
	void buy(Product p){
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없음");
			return; 
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		proList[count++] = p; //[]안에 인덱스 숫자의 변화를 통해서 제품을 사게 되고, 0번부터 증가값이 생겨야함. count를 사용해서 증가값.
		
		System.out.println(p + " 구입");
	}
	
	void buyList() {
		//물건을 산 총 금액 -i번째에 있는 값을 proList에 더하기
		//물건 리스트 출력하기
		
		int sum = 0;//합계를 구할 지역변수. 초기화값 지정해줘야햠.
		String list ="";
		
		
		//향상된for문 proList의 타입은 Product[]
		for(Product pro : proList ){//타입 변수이름 : 배열이름
			sum += pro.price;
			//list += pro.toString() + ", "; //pro.toString()라고 명시하지 않아도 pro에 있는 toString()을 호출
			list += pro + ", ";
		}
		
		/*
		//proList를 돌아서 price에 값을 넣어줘야 함
		//for문, 향상된 for문 둘 다 사용 가능
		for(int i=0; i<proList.length; i++) {
			sum += proList[i].price; //합계를 구할 변수에 proList배열의 price를 넣어줌.
			
			list += proList[i]+", ";//물품 리스트 출력
			//주소를 toString으로 Override를 해서 String값으로 출력됨.
		}
		*/
		System.out.println("구입한 물품의 총합계 : " + sum + "만원입니다");
		System.out.println("구입한 물품 list : " + list);
		
	}
}

