package inEx05;

public class Aarithmetic {
	private int num = 30;
	private int num2 = 20;
	private String name;
	private boolean flag;//false
	private double numDou;

	int plus() {
		return num+num2;
	}
	
	double divide() {
		return (double)num/num2;
	}
	
	int MaxNum(int x, int y) {
		if(x>y) {
			System.out.println("x값"+x+"가 더 큽니다");
		}else {
			System.out.println("y값"+y+"가 더 큽니다");
		}
		
		return MaxNum;
	}
	
	//int EvenSum(int, int) {//int(start)~int(end)까지 숫자 중 짝수의합(2의 배수)만 합하기
	//}

	void scan() {//사용자로부터 연산자와 두개의 숫자 입력받아서 연산 결과 출력
		
	}
	public static void main(String[] args) {

	}

}
