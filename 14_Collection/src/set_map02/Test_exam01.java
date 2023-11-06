package set_map02;

import java.util.*;

public class Test_exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Map map = new HashMap();//부모로 형변환해서 사용해도 됨.
		HashMap<String,String> map = new HashMap<>();
		map.put("myId", "pw1234");
		map.put("20230001", "pw0001");
		map.put("20230002", "pw0002");
		
		//int maxAttempts = 3; // 최대 시도 횟수 설정
		int att = 0;//시도횟수
		
		while(att < 3) {
			
			System.out.println("id와 pw 입력 : ");
			String id = sc.next();
			String pw = sc.next();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)){//값을 의미해서 String으로 형변환 하지 않아도 됨
					System.out.println("로그인 하였습니다");
				}else{
					System.out.println("pw가 틀립니다");
					att++;
					if(att < 3) {
						System.out.println("남은 시도 횟수: " + (3 - att));
					}else {
						System.out.println("닌 이제 로그인 못함");
					}
				}
				
			}else {//키가 없으면,
				System.out.println("id가 일치하지 않습니다");
				att++;
				if(att < 3) {
					System.out.println("남은 시도 횟수: " + (3 - att));
				}else {
					System.out.println("그만해라");
				}
			}
			
			
		}//while

	}

}