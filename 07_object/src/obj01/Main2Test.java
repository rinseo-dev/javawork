package obj01;

class B{
	int b1 = 10;
}

public class Main2Test {

	public static void main(String[] args) {

		B bb = new B();
		A aa = new A();//같은 패키지 안에 있으므로 A클래스도 생성 가능.
	}

}
