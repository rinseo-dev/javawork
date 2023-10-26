package array01;

public class Array_int01 {

	public static void main(String[] args) {
		//배열 : 같은 자료형을 연속된 저장공간에 저장
		//		배열의 길이는 늘리거나 줄일 수 없다
		//		int[] 변수명 = new int[개수] 
		//		int 변수명[] = enw int[개수] // 둘 중 원하는 방식 사용 가능.
		//		배열도 참조자료형이므로 'new'
		
		//저장 공간을 확보만 하고 값은 나중에 넣을 때
		int arrayInt[] = new int[10];
		int[] arrayInt2 = new int[5];
		
		//배열을 만들면서 값을 바로 넣을 때
		int arrayInt3[] = {1,2,3,4,5}; //값을 5개 넣어주면 5개짜리 배열이 만들어지는 것.
		//		   index = 0,1,2,3,4
		
		System.out.println(arrayInt3[0]); //1 출력. index번호가 0번인 것을 출력하므로
		System.out.println(arrayInt3[3]); //4

		System.out.println("-------------------------");
		
		arrayInt3[1] = 20; //index번호가 1번인 곳에 20을 넣음 {1,20,3,4,5} 배열이 됨.
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[1]);
		
		//배열의 값을 모두 출력하고 싶을 때 for나 while같은 반복문을 사용
		//내가 출력하고자 하는 값을 먼저 출력으로 쌓아줌.
//		System.out.print(arrayInt3[0]+", ");
//		System.out.print(arrayInt3[1]+", ");
//		System.out.print(arrayInt3[2]+", ");
//		System.out.print(arrayInt3[3]+", ");
//		System.out.print(arrayInt3[4]+"\n");//여기서 []안의 값이 0~4가 되면 되는 것
		System.out.println("-------------------------");
		for(int i=0; i<=4; i++) {
			if(i==4) {
				System.out.println(arrayInt3[i]);
			}else {
				System.out.print(arrayInt3[i] + ", ");//이렇게 되면 i값에 0~4가 돌게 됨.
			}	
		}

		// 배열의 값을 {0,2,3,6,8}로 바꿀 것.
//		arrayInt3[0] = 0; -> 0 * 2 = 0;
//		arrayInt3[1] = 2; -> 1 * 2 = 2;
//		arrayInt3[2] = 3; -> 2 * 2 = 4;
//		arrayInt3[3] = 6; -> 3 * 2 = 6;
//		arrayInt3[4] = 8; -> 4 * 2 = 8;
		//여기서 바뀌는건 []배열 안의 값 1~4와 배열 안에 집어넣을 값 0,2,4,6,8
		//index번호 * 2를 하면 넣으려는 값이 나옴.
		
		for(int i=0; i<=4; i++) {
			arrayInt3[i] = i*2;//i자리에 0~4까지 한번씩 돌게 됨
		}
		
		System.out.println("-------------------------");
		for(int i=0; i<=4; i++) {
			if(i==4) {
				System.out.println(arrayInt3[i]);
			}else {
				System.out.print(arrayInt3[i] + ", ");//이렇게 되면 i값에 0~4가 돌게 됨.
			}	
		}
		
	
		System.out.println("-------------------------");
		int int1[] = {3,4,5,6,7,8,9,10,11};
		int int2[] = new int[10];
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("int2의 길이 : " + int2.length);
		
		//length를 사용하면 배열의 길이가 바뀌어도 문제 없음.
		for(int i=0; i < int1.length; i++) { //length를 썼을 때는 '='릏 넣지 않음. index번호가 0부터 시작하므로 길이보다 1개 더 출력됨.
			System.out.println(int1[i]);	
		}
		
		System.out.println("-------------------------");
		//문제1. 길이가 5인 배열의 값을 for문으로 0,3,6,9,12를 넣고 합계를 구하여 출력하기
		
		int arrayInt4[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < arrayInt4.length; i++) {
			arrayInt4[i] = i*3;
			System.out.println(arrayInt4[i]);
			
			sum += arrayInt4[i];
		}
		System.out.println("합계 : " + sum);
	}
}
