package overloading08;

public class Arithmetic {
	
	int j = 10;
	
	//5칙연산 메소드 만들기
	int plus(int x, int y) { //x,y는 매개변수
		return x+y;
	}
	
	void plus(int x){//메서드 이름은 같고, 매개변수 개수를 다르게 넣었음
		//double x, double y처럼 개수가 같으면 자료형이 다르게 가능.
		System.out.println(x + "+10=" + (x+10));
		//void형은 저장, 출력이 불가능하므로 바로 출력문 작성
		System.out.println(x + "+" + j + "=" + (x+j));
	}
	//plus를 호출 했을 때, 매개변수가 1개면 void형이 불러와지고, 2개면 int형으로 자동 배정 됨.
	
	void plus(double x, double y) {
		System.out.println("double, double");
		System.out.println(x + "+" + y + "=" + (x+y));
	}
	
	void plus(int x, double y) {
		System.out.println("int, double");
		System.out.println(x + "+" + y + "=" + (x+y));
	}
	
	int minus(int x, int y) {
		return x-y;
	}
	
	void minus(double x, double y) {
		System.out.print("double - double : ");
		System.out.println(x + "-" + y + " = " + (x-y));
	}
	
	void minus(int x, double y) {
		System.out.print("int - double : ");
		System.out.println(x + "-" + y + " = " + (x-y));
	}

	int multiply(int x, int y) {
		return x*y;
	}
	
	void multiply(double x, double y) {
		System.out.print("double * double : ");
		System.out.println(x + "*" + y + " = " + (x*y));
	}
	
	void multiply(int x, double y) {
		System.out.print("int * double : ");
		System.out.println(x + "*" + y + " = " + (x*y));
	}
	
	double divide(int x, int y) {
		return (double)x/y; //소수점까지 뽑기 위해서
	}
	
	void divide(double x, double y) {
		System.out.print("double / double : ");
		System.out.println(x + "/" + y + " = " + (x/y));
	}
	
	void divide(int x) {
		System.out.print("int / j : ");
		System.out.println(x + "/" + j + " = " + (x/j));
	}
	
	int remainder(int x, int y) {
		return x%y;
	}
}
