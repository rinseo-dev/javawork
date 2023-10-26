package exSnack12;

import java.util.Scanner;

public class SnackTest {

	public static void main(String[] args) {
		
		Snack s1 = new Snack();//비어있는 Snack()에 대한 객체 생성
		Snack s2 = new Snack("비스켓","참크래커","퍽퍽한맛",1,3000);//생성자가 있는 Snack()
	
		Scanner sc = new Scanner(System.in);
		System.out.print("과자 종류 입력 : ");
		//s1.kind = sc.next(); 이렇게 넣으면 안됨.
		s1.setKind(sc.next());//set으로 받고 사용자 입력값이니까 sc.next()로 넣어줌.
		
		System.out.print("이름 입력 : ");
		s1.setName(sc.next());
		
		System.out.print("맛 입력 : ");
		s1.setFlavor(sc.next());
		
		System.out.print("개수 입력 : ");
		s1.setNumOf(sc.nextInt()); //int형이므로 nextInt로 넣어줌
		
		System.out.print("가격 입력 : ");
		s1.setPrice(sc.nextInt());//int형
		
		//Snack라이브러리에서 information()을 통해 모든 값을 출력할 수 있게 만들어뒀음. 그걸 사용.
		System.out.println("s1객체의 정보 : "+ s1.information());//s1 사용자로부터 데이터 입력 받음
		System.out.println("s2객체의 정보 : "+ s2.information());//s2 생성자를 통해 데이터 넣음

		//s1객체의 수량을 3개로 변경
		s1.setNumOf(3);
		//s1객체의 금액도 3개만큼 변경
		s1.setPrice(9000);
		//s1객체의 정보 출력
		System.out.println("바뀐 s1객체의 정보 : " + s1.information());
		
		//s2객체의 이름 변경
		s2.setName("새우깡");
		//s2객체의 금액 변경
		s2.setPrice(2500);
		//s2객체의 정보 출력
		System.out.println("바뀐 s2객체의 정보 : " + s2.information());
	}
}
