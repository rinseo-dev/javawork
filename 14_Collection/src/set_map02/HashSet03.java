package set_map02;

import java.util.*;


public class HashSet03 {

	public static void main(String[] args) {
		//random -> 1~45값 뽑아서 set에 넣고 6개가 되면 빠져나오기
		/*
		//바깥에 클래스 따로 만들었음.
		class Lotto{
			int num; }
		Set<Lotto> set = new HashSet<Lotto>(6);
		
		int lotto = (int) ((Math.random()*45)+1);
		
		for(int i=0; i<6; i++) {
			set.add(new Lotto());
		}
		
		System.out.println(set);//이건 주소가 출력됨..
		*/
		
		//선생님 답
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			set.add( (int)(Math.random()*45 + 1) ); //set을 사용해서 중복 제거.
		}
		
		//for(int i=0;, i<6;, i++)해서 돌려도 됨.
		
		System.out.println(set);//이대로 출력하면 랜덤 숫자 그대로 나옴. 출력순서 X
		
		//작은 값, 큰 값 비교해서 순서대로 출력하기
		//index가 없기 때문에 할 수 없음 => List로 변경 후 사용
		List list = new LinkedList(set); //LinkedList를 ArrayList로 바꿔도 됨
		//LinkedList(set)에서 번호가 생긴다고..?
		
		//Collection에 sort를 통해서 정렬 가능
		Collections.sort(list); //Collection안에 있는 것들을 sort로 정렬 가능함.
		System.out.println(list);
		
		
	}	
	
}
