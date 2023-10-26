package repetitive;

public class Re07_for_여러변수사용 {

	public static void main(String[] args) {
		
		//int i, j, k;//같은 형은 1번 선언으로 사용 가능
		//int i=j=k=10; //이렇게 선언하면 i,j,k에 모두 10값이 들어가게 됨.오른쪽에서 왼쪽으로 값이 들어가니까


		//같은 자료형 일때만 사용 가능한 방법
		int num1, num2, num3;
		num1 = num2 = num3 = 10;
		
		int num4 = 8, num5 = 9, num6 =21;
		
		//for문에 여러개의 변수 사용 가능
		//단, 조건식에는 변수(어떤 변수든 상관 없음)가 하나만 들어가야함. 두개가 들어오면 문제 발생
		for(int i=1, j=20; i<=10; i++, j--) {
			//이 식대로면 i가 10번 실행될 동안 for문이 동작함.
			//i<=10, j>=5라고 조건식을 둘 다 넣어버리면 i는10번, j는 15번 실행해야 하는 식이 돼서 오류.
			System.out.println("i="+i+", j="+j);
		}
		
		//조건식은 무조건 하나
		for(int i=1, j=20, z=45; j>=10; i++, j--, z+=2) {//j는 감소 값이니까 >=
			System.out.println("i="+i+", j=" + j +",z="+z);
		}
		
		//while(true) 한 것과 동일
		//초기식 없음, 조건식 없음, 증감식도 없음
		for(;;) {//이런식으로 사용할 경우 무한 루프가 되므로 break로 빠져나와야함.
			System.out.println(num1++);//10~14까지 출력하고나서 ++되므로 15는 출력되지 않음.
			if(num1 == 15) { //15가 되었으므로 종료
				break; 
			}
		}
		
		//2중 for문을 실행했을 때 break를 만나면 멈춤

		loop : for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i );
				if(i==5) {
					break loop;//loop라고 이름 붙여준 for문을 빠져나오게 함.
				}
			}
			System.out.println();
		}
		System.out.println("구구단 종료");
		
		//
		outter : for(int dan=2; dan<=9; dan++) {
			mid : for(int i=1; i<=9; i++) {
					for(int z=1; z<=5; z++) {
					System.out.println(dan + ", " + i + ", " + z);
						if(z==3) {
							//break outter;//loop라고 이름 붙여준 for문을 빠져나오게 함.
							break mid;//mid를 종료하면 outter가 끝나지 않아서 outter개수만큼 반복됨
						}
					}
			}
			System.out.println("mid for문 종료");
		}
		System.out.println("outter 종료");
		
	}

}
