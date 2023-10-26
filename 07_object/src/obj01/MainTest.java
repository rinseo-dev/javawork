package obj01;

//실행용 클래스
public class MainTest {

	public static void main(String[] args) {

		//같은 패키지 안에 있으므로 A클래스 사용 가능.
		A a1 = new A();//A클래스 객체 생성. A.java를 가져옴
		//A클래스 자료형 이라고 생각하면 편함.
		//A를 사용하면 A.java에서 클래스 선언된 A의 모든 값을 사용할 수 있음
		A a2 = new A();//A클래스 객체 하나 더 생성
		
		//객체는 여러개 생성 가능함.
	}

}
