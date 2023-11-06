package set_map02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User3> users = new ArrayList<>();

        // 사용자 정보를 ArrayList에 추가합니다.
        users.add(new User3("myId", "pw1234"));
        users.add(new User3("20230001", "pw0001"));
        users.add(new User3("20230002", "pw0002"));

        HashMap<String, Integer> loginAttempts = new HashMap<>();

        while (true) {
            System.out.println("아이디와 비밀번호를 입력하세요: ");
            String id = sc.next();
            String pw = sc.next();

            if (loginAttempts.containsKey(id)) {
                int attempts = loginAttempts.get(id);
                if (attempts >= 3) {
                    System.out.println("비밀번호 3회 연속 실패. 계정이 잠겼습니다.");
                    break; // 계정이 잠긴 경우 반복 종료
                } else {
                    User3 user3 = findUser(users, id);
                    if (user3 != null && user3.checkPassword(pw)) {
                        System.out.println("로그인 하였습니다");
                        loginAttempts.remove(id); // 로그인 성공 시 시도 횟수 초기화
                        break; // 로그인 성공 시 반복 종료
                    } else {
                        attempts++;
                        loginAttempts.put(id, attempts);
                        int remainingAttempts = 3 - attempts;
                        System.out.println("비밀번호가 틀렸습니다. 남은 시도 횟수: " + remainingAttempts);
                    }
                }
            } else {
                User3 user3 = findUser(users, id);
                if (user3 != null && user3.checkPassword(pw)) {
                    System.out.println("로그인 하였습니다");
                    break; // 로그인 성공 시 반복 종료
                } else {
                    loginAttempts.put(id, 1);
                    System.out.println("비밀번호가 틀렸습니다. 남은 시도 횟수: 2");
                }
            }
        }
    }

    static User3 findUser(List<User3> users, String id) {
        for (User3 user3 : users) {
            if (user3.getId().equals(id)) {
                return user3;
            }
        }
        return null;
    }
}

class User3 {
    private String id;
    private String password;

    public User3(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }
}