package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 모든 곳에서 사용할거라 밖으로 뺌

		// 선생님 답 - 전체

		/*1.
		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		ex.
		정수 : 5
		배열 0번째 인덱스에 넣을 값 : 4
		배열 1번째 인덱스에 넣을 값 : -4
		배열 2번째 인덱스에 넣을 값 : 3
		배열 3번째 인덱스에 넣을 값 : -3
		배열 4번째 인덱스에 넣을 값 : 2
		4 -4 3 -3 2 
		총 합 : 2*/

		/*System.out.print("배열의 길이 입력 : ");
		int num = sc.nextInt();
		
		int iArr[] = new int[num]; //num의 개수만큼 배열 만들기
		int sum = 0;
		
		for(int i=0; i<iArr.length; i++) {// i<num로 해도 됨.
			System.out.print("배열 [" + i +"] index에 넣을 값 입력 : ");
			iArr[i] = sc.nextInt(); //scanner로 받은 값을 배열에 입력.
			sum += iArr[i];
		}
		
		System.out.println(Arrays.toString(iArr));
		System.out.println("총합 = " + sum);*/

		/*2. 
		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요. 
		
		ex.
		정수 : 4
		다시 입력하세요.
		정수 : -6
		다시 입력하세요.
		정수 : 5
		1, 2, 3, 2, 1*/

		// 풀이1 - while문 사용
		while (true) {
			System.out.println("정수 입력 : ");
			int num2 = sc.nextInt();
			int iArr2[] = new int[num2];// 사용자가 넣은 개수(num2)만큼 배열 생성

			if (num2 % 2 == 1 && num2 >= 3) {
				int count = 1;// 값이 증가하거나 감소만 하면 i를 사용하면 되지만, 증,감이 모두 필요해서 변수 지정
				for (int i = 0; i < num2; i++) {
					if (i < num2 / 2) { // 5/2 배열이 5개면 index2번이 중간 [0][1][2][3][4]
										// 1 2 3 2 1
						iArr2[i] = count++; // 1부터 시작해서 ++을 count뒤에 놓음.
						// count로 증가되는 값을 iArr2에 넣어줌.
					} else {
						iArr2[i] = count--;// index번호가 중간을 넘어서면 감소해야하므로
					}
				}
			}else {
				System.out.println("다시 입력하세요");
				continue;
			}
			System.out.println(Arrays.toString(iArr2));
			break;// 출력 후 while문 빠져나가기.
		}

		// 풀이2 - if문 사용
		/*System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num2 % 2 == 1 || num2 > 3) {
			int iArr2[] = new int[num2];
			int count = 1;
			for(int i=0; i<num2; i++) {
				if(i < num2/2) 
					iArr2[i] = count++;
				else
					iArr2[i] = count--;
			}
			System.out.println(Arrays.toString(iArr2));
		} else {
			System.out.println("다시입력하세요");
			System.out.print("정수 입력 : ");
			num2 = sc.nextInt();
		}*/
		

		/*3.
		사용자가 입력한 값이 배열에 있는지 검색하여
		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		ex.
		치킨 이름을 입력하세요 : 양념			
		양념치킨 배달 가능
		
		치킨 이름을 입력하세요 : 불닭
		불닭치킨은 없는 메뉴입니다.*/

		/*String chickens[] = {"후라이드","양념","파닭","간장"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.next();//chickens의 배열과 menu가 맞는지 for문으로 비교해야 함
		
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) {
				flag = true;
				break; //같은게 있는가, 있으면 flag를 true로 하기 때문에 false에 대한 식은 필요없음.
			}
		}
		if(flag) {//flag가 true면 있는 메뉴이므로 아래 출력구문 실행
			System.out.println(menu + "치킨 배달 가능");
		}else {
			System.out.println(menu + "은(는) 없는 메뉴 입니다.");
		}*/
		

		/*
		4.
		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		
		ex.
		주민등록번호(-포함) : 123456-1234567
		123456-1****** */

//		System.out.print("주민번호 입력(-포함) : ");
//		String jumin = sc.next();

		// 기존 답
		/*char[] origin = new char[jumin.length()];//length()는 char에 들어있는 메서드.
		
		//여태까지 썻던 length는 변수. 괄호가 있는 건 메서드.
		for(int i=0; i<origin.length; i++) {
			origin[i] = jumin.charAt(i);//for문을 돌때마다 하나씩 쪼개서 넣는다는데
		}
		char[] copy = new char[origin.length];
		for(int i=0; i<copy.length; i++) {
			if(i<8) {//7개까지이므로
				copy[i] = origin[i];
			}else {
				copy[i] = '*';
			}
		}
		System.out.println(copy);//char이므로 그냥 출력 가능
		*/

		// 아래는 축약된 답 - 쌤거 다시 봐야함
		/*char[] origin = new char[jumin.length()];//length()는 char에 들어있는 메서드.
		
		//여태까지 썻던 length는 변수. 괄호가 있는 건 메서드.
		for(int i=0; i<origin.length; i++) {
			if(i<8) {//7개까지이므로
				origin[i] = origin[i];
			}else {
				origin[i] = '*';
			}
		}
		System.out.println(origin);//char이므로 그냥 출력 가능
		*/

		/*
		 5.교재 p201 6번문제 풀기
		 */

		/*boolean run = true;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생 수 입력 : ");
				int studentNum = sc.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = sc.nextInt();
				}
			}else if(selectNo == 3) {
				//System.out.println(Arrays.toString(scores)); 이렇게 해도 되지만 문제가 원하는 답이 아님
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
				
			}else if(selectNo == 4) {//4번을 선택하면 최고점수와 평균
				int max=0, sum=0;
				double avg = 0;
				
				for(int i=0; i<scores.length; i++) {
					max = scores[i]; //0번부터 넣어서 비교 식을 만들어야함.
					if(max < scores[i]) {//max와 scores를 비교해서 더 큰 숫자를 max에 넣어줌
						max = scores[i];
					}
					//if문 대신 삼항연산자 사용 - 조건 ? 참일때실행값 : 아닐때값
					max = max < scores[i] ? scores[i] : max;
					//max<scores[i]가 참이면 scores[i]값을 max에, 아니면max 유지
					sum += scores[i];
				}
				//avg = (double)sum/scores.length;
				
				System.out.println("최고 점수 : " + max);
				System.out.printf("평균 점수 : %.2f\n", (double)sum/scores.length);//avg 선언 대신 바로 값 넣어줌.
			}else if(selectNo == 5) {
				run = false;
			}
		}*/
	}
}
