package inOverriding03;

//오버로딩과 오버라이딩의 예시

//오버라이딩 : 상속에서 자식이 부모의 메소드의 원형은 그대로 갖고, 실행 내용만 다르게 정의
//			오버라이딩한 자식의 메소드가 호출됨
class F {
	void show() {
		System.out.println("부모 클래스 show()메소드 호출");
	}
	void play(String title) {
		System.out.println("부모 클래서에서 " + title + "을 플레이합니다.");
	}
}

class G extends F{ // F로부터 상속받음
	//오버라이딩
	@Override //상위에 같은 메서드 이름이 있으면 오버라이딩 해줌/오버라이딩인 경우 shaw()라고 오타내면 오류밑줄 나옴.
			  //부모가 void, 자식이 int형태를 띄어도 오류 발생함. 원형이 같아야 함.
	void show() {//show() 라는 메서드 이름도 같고, 매개변수 없는 것도 같음 - 오버라이딩
		System.out.println("자식 클래스 show()메소드 호출");
	}
	
	//자식클래스에서 오버라이딩을 통해 상속받은 걸 사용하려면 메서드, 자료형, 개수를 그대로 가져와야 함. 변수이름은 달라도 됨
	//void play(String aa) {//오버라이딩 : 자료형(String), 개수(1개), 이름(play)이 같게 작성됨.
	
	//오버로딩 : 매개변수의 개수가 다르거나 자료형이 다름
	void play(int aa){//로 가져오면 오버로딩이 됨. 자료형이 다르므로.
		System.out.println("자식 클래스에서 " + aa + "를 플레이 합니다.");
	}
	//show()는 같은 메서드이고, play()는 int(정수형으로받음)와 string(문자열로 받음)의 차이가 있으므로 서로 다른 메서드
}

public class OverridingTest1 {

	public static void main(String[] args) {
		G g = new G();
		g.show();//똑같은 show()를 호출하면 우선순위로 '나'자신의 메소드가 먼저 호출됨.
		g.play("영화"); //play에서 String을 받는건 F에 있으므로 부모클래스로 호출
		g.play(4);//play int형을 C에서 사용하므로 자식클래스 호출
	}

}
