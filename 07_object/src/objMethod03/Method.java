package objMethod03;

//라이브러리
public class Method {
	//반환형이 없는 메소드
	void print1() { //print1()을 호출했을 때 사용할 내용을 {}중괄호 안에 선언
		System.out.println("반환값이 없고 매개변수가 없는 메소드");
	}
	
	//반환형이 있는 메소드 - return
	int print2() {//int형은 반환이 필요하므로 return되는 값도 같은 int형이어야 함.
		System.out.println("반환형이 int형이고 매개변수가 없는 메소드");
		int result = 1;//지역변수에 1을 저장. print2안에서 사용하고나면 저장공간에서 사라짐
		return result; //MethodTest.java에서 re가 result값을 받음
		//리턴값이 있으면, 메서드를 호출한 곳으로 돌아갈 때 리턴값을 가지고 감
		
		//return 3; 이런식으로 작성하면 3을 MethodTest.java의 re가 받음.
		//숫자도 int형이므로 반환 가능.
		
		//출력문이 먼저 호출되고, 저장공간을 만들어서 1이 들어감.
		//return에 있는 result와, 반환형에 있는 int의 자료형이 같아야 함. 
		//return값이 있으면 저장도 되고 출력도 됨.
	}
	
	String print3() {
		System.out.println("반환형이 문자열이고 매개변수가 없는 메소드");
		return "반환하는 문자";//메서드가 String형이기 때문에 반환값도 String이어야 함
	}
	
	Boolean print4() {
		System.out.println("반환형이 불리언이고 매개변수가 없는 메소드");
		boolean re = 5>3; //true
		return re; //리턴 값이 있으므로 저장or출력 가능
		//return true;
	}
	
	//print1~4()는 매개변수가 없었음. print5에는 int x라는 매개변수가 있음
	
	//반환형이 없는 경우의 출력 방법
	void print5(int x) {//print5(10)에 지정된 값이 int x가 되는 것.
		System.out.println(x);//x를 출력하면 10이 출력됨.
	}
	
	int print6(int x) { //m1.print6(5)값이 넘어와서 x가 5가 됨.
		int y = 10;
		return x+y; //x5 + y10 = 15
	}
	
	//반환형과 메소드 인자(?)가 같은 자료형일 필요는 없음.
	String print7(int x) {
		int re = x * 5;
		System.out.print(re);//이 출력구문이 re를 출력하지 않으면 return값만 넘어감.
		return " * 연산함";
	}
	
	int print8(int x, int y) {//m1.print8(5,8)값을 가져와서 x5, y8이 됨
		int re = x+y;
		return re;
	}
	
	//여기선 매개변수가 String, int 두가지 자료형을 가짐. 인자는 ','기준으로 두 자료형이 들어와야함.
	void print9(String str, int z) {//m1.print9("java",10)을 받아와서 사용
		System.out.println("입력한 문자열 : " + str);
		System.out.println("입력한 숫자 : " + z);
	}
	
	String print10(double d1, String str, boolean b1, int num) {
		//m1.print10(13.89, "문자열", true, 4)값을 가져와서 아래 출력문 실행됨.
		System.out.println(str);
		System.out.println(!b1);//내가 넣은 값의 반대 출력
		System.out.println(d1*num);
		return "여러 매개변수 받기";
	}
	
}
