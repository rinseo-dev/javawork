package array01;

public class Array_Ex03 {

	public static void main(String[] args) {
		//예제
		
		int score[] = {100, 97, 56, 75, 90};
		int sum = 0;
		
		//합계 구하기
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}

		double avg = (double)sum / score.length;
		//정수 나누기 정수는 정수만 나옴. 소수점까지 나오려면 두 수 중에 하나는 double형이어야 함.
		//그래서 sum을 double로 형변환해줌.
		
		System.out.println("점수의 합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);//소수점까지 뽑게 printf, 2자리까지 2.f
		
		
		//2.최대값, 최소값 구하기
		//int num[] = {65, 26, 59, 98, 3, 73, 16, 84, 36, 8};

		//내 풀이 망함
//		int num2 = 0;
//		int num3 = 0;
//		int tmp = 0;
//		
//		for(int j=0; j<num.length; j++) {
//			num2 = num[j];
//			for(int k=0; k<num.length; k++) {
//				num3 = num[k];
//				
//				if(num2 > num3) {
//					
//				}
//			}
//		}
		//선생님 풀이
		//int max = 65;라면 65와 26을 먼저 비교해서 65가 크면 바꾸지 않음. 98과 비교했을때 더 크면 max=98이 되는 것
			
		/*
		max에 들어간 값과 이후의 값둘을 비교해서 max가 작으면 자리 바꿈을 해주면 됨.
		max < num[1] -> max = num[1]
		max < num[2] -> max = num[2]
		max < num[3] -> max = num[3]
		...
		max < num[9] -> max = num[9]
		이런 식으로 만들어짐.
		*/
		int num[] = {65, 26, 59, 98, 3, 73, 16, 84, 36, 8};
		int max = num[0];
		int min = num[0];
		
		//index번호도 +1,-1 연산 가능함.
		//num[i+1]하면 length는 -1해줘야 함.num[i+1]을 if조건에 넣으면 length개수가 맞지 않음.
		//그래서 아래 주석같은 형태가 되어야 한다고 ㅇㅇ.. 근데 굳이..?
		/*for(int i=0; i<num.length-1;i++) {
			if(max < num[i+1]) {	
			}
		}*/
		
		for(int i=1; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i]; //num[i]값이 max보다 클 경우 max에 넣어줌.
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		//index번호에도 연산 가능
		int k = 3;
		System.out.println(num[0+k]);//98
		System.out.println(num[0+8]);//36
		System.out.println(num[2*3]);//16
		
	}
}
