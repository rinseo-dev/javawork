package set_map02;

import java.util.*;

class User{
	private String id;
	private String pw;
	private int loginNum;
	
	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		this.loginNum = 0;
	}

	public String getId() {
		return id;
	}
	
	public boolean checkPw(String inputPw) {
		return pw.equals(inputPw);
	}
	
	public int incrementLoginNum() {
		return ++loginNum;
	}
	
	public int getLoginNum() {
		return loginNum;
	}
}

public class Test2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		List<User> users = new ArrayList<>();
		
		//사용자 정보를 ArrayList에 추가
		users.add(new User("myId", "pw1234"));
		users.add(new User("20230001", "pw0001"));
		users.add(new User("20230002", "pw0002"));
		
		System.out.println("id와 pw 입력 : ");
		String id = sc.next();
		String pw = sc.next();
		
		//User user = findUser(users, id);
		
	}

}
