package objMethod04;

public class ArithmeticTest {

	public static void main(String[] args) {
		
		Arithmetic am = new Arithmetic();
		
		System.out.println("더하기 : "+am.plus(10,5));
		System.out.println("빼기 : "+am.minus(10,5));
		System.out.println("곱하기 : "+am.multiply(10,5));
		System.out.printf("나누기 : %.3f\n",am.divide(15,7));
		System.out.println("나머지 : "+am.remainder(15,4));
		//매개변수에 들어간 값은 '인자'라고 함

	}

}
