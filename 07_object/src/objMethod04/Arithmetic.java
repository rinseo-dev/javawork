package objMethod04;

public class Arithmetic {
	
	//5칙연산 메소드 만들기
	int plus(int x, int y) { //x,y는 매개변수
		return x+y;
	}
	
	/*
	int add(int x, int y){
		int re = x + y;
		return re; 이렇게도 가능.
	 */
	
	int minus(int x, int y) {
		return x-y;
	}

	int multiply(int x, int y) {
		return x*y;
	}
	
	double divide(int x, int y) {
		return (double)x/y; //소수점까지 뽑기 위해서
	}
	
	int remainder(int x, int y) {
		return x%y;
	}
}
