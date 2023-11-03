package set_map02;

import java.util.*;

public class Map04 {

	public static void main(String[] args) {
		//키는 중복 불가, 값은 중복 가능
		//Map<키값,입값>
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//Map에서는 add가 아니라 put으로 입력 (키 번호,입력값)
		map.put(1, "홍길동");
		map.put(2, "김첨지");
		map.put(2, "홍길동");//같은 키에 값을 넣으면 새로운 값으로 변경
		//key:2에 김첨지가 있었는데 홍길동을 key:2에 넣으면서 값이 홍길동으로 변경됨.
		System.out.println(map);
		
		Map<String, Double> map2 = new HashMap<String, Double>();
		map2.put("java", 34.55);
		map2.put("oracle",87.697);
		map2.put("html",14.892);
		System.out.println(map2);
		
		//값을 찾을 때 key로 찾음
		System.out.println(map2.get("html")); //key에 해당하는 값 14.892출력
		
		//삭제 - 키를 지정해서 삭제
		System.out.println(map2.remove("html"));
		System.out.println(map2); //출력해보면 html삭제되어 있음.
		
		System.out.println("----------------");
		mapPrint(map);
	}
	
	//static으로 메서드 만들어서 (키:값)을 호출 하기 위함.
	static void mapPrint(Map<Integer,String> map) { //String,Double로 만들면 map2
		Set<Integer> keyset = map.keySet(); //key를 가져와서 set에 담음
		Iterator<Integer> keyIterator = keyset.iterator();
		while(keyIterator.hasNext()) {
			int key = keyIterator.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}

}
