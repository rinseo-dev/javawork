package set_map02;

import java.util.*;

class User2 {
    private String id;
    private String password;

    public User2(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}

public class Test_exam02 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<User2> userList2 = new ArrayList<>();

        userList2.add(new User2("myId", "pw1234"));
        userList2.add(new User2("20230001", "pw0001"));
        userList2.add(new User2("20230002", "pw0002"));

        int att = 0; // 시도 횟수

        while (att < 3) {
            System.out.println("id와 pw 입력 : ");
            String id = sc.next();
            String pw = sc.next();

            boolean isAuthenticated = false;

            for (User2 user2 : userList2) {
                if (user2.getId().equals(id) && user2.getPassword().equals(pw)) {
                    isAuthenticated = true;
                    break;
                }
            }

            if (isAuthenticated) {
                System.out.println("로그인 하였습니다");
                break;
            } else {
                System.out.println("로그인 실패");
                att++;
                if (att < 3) {
                    System.out.println("남은 시도 횟수: " + (3 - att));
                } else {
                    System.out.println("로그인 시도 횟수 초과");
                }
            }
        }
    }
}