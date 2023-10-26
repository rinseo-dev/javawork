package repetitive;

import java.util.Scanner;

public class Re06_continue {

	public static void main(String[] args) {
		//break: 반복문을 빠져나올 때
		//continue: continue하위의 실행문을 실행하지 않고 반복문을 다시 실행
		//			~을 제외 할 때 많이 사용
		
		// 1~100까지의 숫자 중 3의 배수를 제외한 합계를 구하기
		
		int sum = 0;//합계를 구할 변수를 바깥쪽에 만들어줌
		for(int i=1; i<=100; i++) {
			
			if(i%3 == 0) { //3의 배수인 것 조건
				continue;//3의 배수일 때 continue로 제외함.
			}
			sum += i; //1~100까지의 합계에서 if문을 달면서 3배수 제외한 것의 합계가 됨
		}
		System.out.println("1~100까지 중 3의 배수를 제외한 합계 : " + sum);
	
		//1.1~100까지 중 3의 배수의 합 구하기
		int sum2 = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 != 0) {
				continue;
			}
			sum2 += i;
		}
		System.out.println("1~100까지 중 3의 배수의 합 : " + sum2);
		
		
		//2.사용자로부터 숫자 양수를 입력받아 1~입력받은 숫자까지 합계 구하기
		//숫자를 입력하세요 : -2
		//양수를 입력하세요
		//숫자를 입력하세요 : 10
		//1~10까지의 합 = 55
		
//		int sum3 = 0;
//		int user2 = 0;
//		
//		Scanner scan2 = new Scanner(System.in);
//		user2 = scan2.nextInt();
//		
//		
//			if(user2 <= 0) {
//				System.out.println("양수를 입력하세요");
//			}else {
//				for(int i=0; i<=user2; i++) {
//					sum3 += i;
//				}
//				System.out.println("합계 : " + sum3);
//			}
		
		//3.1~100까지의 숫자를 맞추기 게임
		//랜덤으로 1~100까지의 숫자를 추출하고
		//scan으로 사용자로부터 숫자를 입력받아 맞추기
		//ex)
		//랜덤 추출한 숫자 : 5
		//숫자를 입력하세요 : 10
		//더 작은 숫자를 입력해보세요
		//숫자를 입력하세요 : 2
		//더 큰 숫자를 입력해보세요
		//숫자를 입력하세요 : 5
		//축하합니다 맞췄습니다 종료
		
//		int ran = (int)(Math.random() * 100) + 1;
//		int user3 = 0;
//		
//		do {
//			Scanner scan3 = new Scanner(System.in);
//			user3 = scan3.nextInt();
//			
//			if(ran > user3) {
//				System.out.println("더 큰 숫자를 입력해보세요");
//			}else if(ran < user3) {
//				
//				System.out.println("더 작은 숫자를 입력해보세요");
//			}else{
//				System.out.println("축하합니다 맞췄습니다");
//			}
//		}while(ran != user3);
//	}
		
		//선생님 풀이
//		Scanner scan = new Scanner(System.in);
//		int com = (int)(Math.random()*100)+1; //1~100까지의 랜덤 숫자
//		int user = 0;
//		
//		 do {
//			 System.out.println("1~100 사이의 숫자를 입력하세요 : ");
//			 user = scan.nextInt();
//			 
//			 if(user > com) {
//				 System.out.println("더 작은 숫자를 입력해보세요");
//			 }else if(user < com){
//				 System.out.println("더 큰 숫자를 입력해보세요");
//			 }
//		 }while(user != com);//while문은 정답이 아닐 때 실행 돼야 함.
//		 System.out.println("축하합니다 맞췄습니다");
	
	//4. 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	//단, 입력한 수는 1보다 크거나 같아야 합니다. 
	//ex.
	//1이상의 숫자를 입력하세요 : 0
	//1 이상의 숫자를 입력해주세요.

	//1이상의 숫자를 입력하세요 : 4			
	//4 3 2 1
	
		//역순을 모르겠음
//	int user4 = 0;
//	int k = 0;
//	int[] num = new int[k];
//	
//	
//	Scanner scan4 = new Scanner(System.in);
//	user4 = scan4.nextInt();
//	
//	for(k = 0; k < user4; k ++) {
//		if(user4 <= 0) {
//			System.out.println("1 이상의 숫자를 입력하세요");
//		}else {
//			System.out.println(k+1);
//		}
//	}
	
		//선생님 풀이1 - while(true)
//		while(true) { //여기서 true만 해도 되지만 변수넣는 것도 가능.
//			Scanner scan = new Scanner(System.in);
//			int user = 0;
//			System.out.println("숫자 입력 : ");
//			user = scan.nextInt();
//			
//			if(user == 0) {
//				System.out.println("1이상의 숫자를 다시 입력하세요");
//				continue;//0과 같을 땐 for문을 수행하지 않고 다시 위로 올라감 while로
//			}
//			//역순으로
//			for(int i=user; i>=1; i--) {//이걸 못하네 멍청
//				
//				if(i == 1) {//i가 1일 때는 ','없이 출력
//					System.out.print(i + "\n");
//				}else {
//					System.out.print(i + ", ");
//				}
//				//break를 여기 넣으면 for문만 정지되는 것.
//			}
//			break;//여기서 break를 해줘야 while을 빠져나옴.
//		}
		//System.out.println();//여기서 new line을 하든가 if i== 1에서 \n을 하든가 그래야 보기 좋음

		
		//선생님 풀이2 - 변수 활용
//		Scanner scan = new Scanner(System.in);
//		boolean change = true; //while문을 돌리기 위해서 change라는 변수를 사용
//		
//		while(change) {
//			System.out.print("두 수를 입력하세요 ex) 56 8 : ");//숫자를 한 줄에 한꺼번에 받을 수도 있음.
//			int num1 = scan.nextInt();
//			int num2 = scan.nextInt(); //nextLine을 제외한 것은 '단어'로 인식해서 띄어쓰기를 하면 각자 인식됨
//		
//			//System.out.println("num1=" + num1 + ", num2=" +num2); //test code
//			
//			
//			if(num1 == 0 || num2 == 0) {
//				System.out.println("0보다 큰 숫자 입력");
//				continue;//num1, num2중 하나라도 0이 들어오면 continue적용해서 다시 scan받기
//			}
//			
//			if(num1 >= num2) {
//				for(int i = num2; i <= num1; i++) {
//					System.out.println(i + ", ");
//				}
//			}else {
//				for(int i=num1; i <= num2; i++) {
//					System.out.println();
//				}
//			}
//			change = false; //변수를 false로 바꿔서 while문을 종료시킴.
//		}
		
		//선생님 풀이3 - 변수 활용, num1 작은 수, num2 큰 수 인 경우로 
		Scanner scan = new Scanner(System.in);
		boolean change = true; //while문을 돌리기 위해서 change라는 변수를 사용
		
		while(change) {
			System.out.print("두 수를 입력하세요 ex) 56 8 : ");//숫자를 한 줄에 한꺼번에 받을 수도 있음.
			int num1 = scan.nextInt();
			int num2 = scan.nextInt(); //nextLine을 제외한 것은 '단어'로 인식해서 띄어쓰기를 하면 각자 인식됨			
			
			if(num1 == 0 || num2 == 0) {
				System.out.println("0보다 큰 숫자 입력");
				continue;//num1, num2중 하나라도 0이 들어오면 continue적용해서 다시 scan받기
			}
			
			//num1은 작은 수, num2는 큰 수
			if(num1 >= num2) { //자리바꿈
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
				//num1=10, num2=2인 경우. tmp에 10을 넣어두고 num1에 num2값 2를 넣어둠.
				//그리고 나서 num2에 tmp값을 넣어서 num1=2, num2=10으로 자리바꿈이 됨.
				//자리바꿈이 필요 할 때, 변수를 저장할 수 있는 공간(tmp)를 선언하고 나서 진행.
			}
			
			//자리바꿈이 됐으므로 작은 숫자, 큰 숫자가 정해진 상황이라 for문 돌리면 됨
			for(int i= num1; i<=num2; i++) {
				System.out.println(i+", ");
			}
			
			change = false; //변수를 false로 바꿔서 while문을 종료시킴.
		}

	//5. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	//만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
	//ex
	//첫 번째 숫자 : 9
	//두 번째 숫자 : 0
	//1 이상의 숫자를 입력해주세요.

	//첫 번째 숫자 : 8
	//두 번째 숫자 : 4 
	//4, 5, 6, 7, 8
//	
//	Scanner scan5 = new Scanner(System.in);
//	Scanner scan6 = new Scanner(System.in);
//	
//	int user5 = scan5.nextInt();
//	int user6 = scan6.nextInt();
//	
//	if( 0 >= (user5 | user6) ) {
//		System.out.println("1 이상의 숫자를 입력해주세요");
//	}else if(user5 > user6){
//		for(user6 < user5; user6++ )
//			System.out.println(user6+1);
//	}else {
//		System.out.println("워매");
//	}
		
		//선생님 풀이
		
	
	}
}
