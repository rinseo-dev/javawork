package set_map02;

import java.util.*;

public class HashMap05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Map map = new HashMap();//부모로 형변환해서 사용해도 됨.
		HashMap map = new HashMap();
		map.put("myId", "pw1234");
		map.put("20230001", "pw0001");
		map.put("20230002", "pw0002");
		
		System.out.println("id와 pw 입력 : ");
		String id = sc.next();
		String pw = sc.next();
		
		if(map.containsKey(id)) {
			//pw를 보려면 id(key)에 해당하는 값을 가져오면 됨
			//String value = (String)map.get(id);//map.get(id)는 엔트리 형태로 가져와서 String으로 형변환
			//if(value.equals(pw)) { 
			//위 두 줄을 한줄로 정리
			if(map.get(id).equals(pw)){//값을 의미해서 String으로 형변환 하지 않아도 됨
				System.out.println("로그인 하였습니다");
			}else{
				System.out.println("pw가 틀립니다");
			}
			
		}else {//키가 없으면,
			System.out.println("id가 일치하지 않습니다");
		}
	}

}
