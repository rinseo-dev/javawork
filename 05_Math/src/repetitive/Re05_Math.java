package repetitive;

import java.util.Scanner;

public class Re05_Math {

	public static void main(String[] args) {
		//랜덤으로 1~6까지의 숫자 추출하기
		
		//랜덤으로 숫자를 뽑음
		int com = (int)(Math.random() * 6) + 1; //1을 더해줘야 함 5.9999~라서
		int user = 0;
		
		//while, do while을 사용해서 계속 값을 받아올 수 있음.
		
		do {
			//사용자에게서 숫자를 받아옴.
			Scanner scan = new Scanner(System.in);
			System.out.println("주사위의 숫자를 맞춰보세요 : ");
			user = scan.nextInt();//사용자가 값을 넣으면 user에 저장됨.
			//기존 int user에서 밖으로 빼서 user를 선언해줌.
			
			if(com == user) //user가 넣은 숫자가 같으면
				System.out.println("축하합니다. 맞췄습니다");
			else
				System.out.println("틀렸습니다. 다시 입력하세요");
		}while(com != user);//사용자가 넣은 값과 com의 값을 비교해야함.
		//기존에는 user라는 변수가 do라는 지역 안에서 선언된 변수를 사용할 수 없음. user변수 선언을 최상위로 뺐음.
	}

}
