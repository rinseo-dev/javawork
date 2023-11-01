package final05;


//클래스에 final을 붙이면 상속할 수 없음
final class Final01{
	
}

/*
class FinalInheri extends Final01{ //상속하려는 부모 클래스가 final이면 상속할 수 없음.
}
*/

class Final02{
	int num = 10;
	
	//변수 앞에 final을 붙이면 상수가 됨 : 값이 한번 저장되면 변경 불가
	final int NUM2 = 34;//상수 - 소문자는 변수라고 생각하게 되므로 대문자로 작성
	
	//메서드 앞에 final을 붙이면 오버라이딩 불가. - 상속받았을 때 똑같은 이름으로 재정의 할 수 없다.
	final int play() {
		//NUM2 = 40;처럼 다른 값으로 변경 불가
		return NUM2;//사용은 가능함.
	}
	int show() {
		return num;
	}
}

class Final02Infer extends Final02{
	//메서드 재정의 불가 - final
	/*
	int play() {
		return 3;
	}
	*/
	@Override
	int show() {//이건 재정의 가능.final이 없으므로
		return 5;
	}
}

public class FinalTest {

	public static void main(String[] args) {

	}

}
