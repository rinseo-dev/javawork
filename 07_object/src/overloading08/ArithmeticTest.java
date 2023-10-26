package overloading08;

public class ArithmeticTest {

	public static void main(String[] args) {
		
		Arithmetic am = new Arithmetic();
		
		System.out.println("더하기 : "+am.plus(10,5));
		System.out.println("빼기 : "+am.minus(10,5));
		System.out.println("곱하기 : "+am.multiply(10,5));
		System.out.printf("나누기 : %.3f\n",am.divide(15,7));
		System.out.println("나머지 : "+am.remainder(15,4));
		//매개변수에 들어간 값은 '인자'라고 함

		am.plus(89);//매개변수가 1개인 plus를 찾아감.
		am.plus(89.56, 67);//일단 plus를 찾고, 매개변수가 2개인 것을 찾고, 실수형이므로 double형으로 감
		//앞 숫자 89.56이 실수형이라 자동으로 67도 67.0인 상태로 넘어감.double형 plus()가 실행됨.
		//둘 중에 하나만 double이어도 double형을 찾아감
		am.plus(50, 68);//정수, 정수를 찾아감
		am.plus(50,68.8);//int, double형에 맞춰서 찾아감.
		//단, int, double형처럼 자료형이 딱 맞는 게 없는 경우 double,double로 감
		//int는 double에 자동형변환으로 들어가지만 double은 int에 들어갈 수 없음.
		
		am.minus(5, 7);
		am.minus(78.94, 35);
		am.minus(100,67.5);
		
		am.multiply(3, 5);
		am.multiply(37.5, 10.7);
		am.multiply(25, 25.5);
		
		am.divide(10.5, 3);
		am.divide(50);
	}

}
