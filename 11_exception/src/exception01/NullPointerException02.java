package exception01;

public class NullPointerException02 {
//NullPointerException라는 예외클래스가 실존하므로, 똑같은 이름으로 클래스를 생성하면
//내가 새로 만든 클래스가 우선시 되기 때문에 예외처리가 불가능해짐. 그래서 02붙임

	public static void main(String[] args) {
		
		try {
			String str = null;
			System.out.println(str.toString()); //주소가 없는데 주소를 통해 toString을 출력하라고 하니까 오류가 발생하는 것
			//실행하면 NullPointerException발생.
		}catch(NullPointerException e) {//변수는 마음대로 써도 되지만 보통 예외처리는 e로 사용함.
			System.out.println("데이터가 들어 있지 않습니다");
			System.out.println("예외 메시지 : " + e);
			//e라는 변수 안에 exception에 대한 메시지가 들어있어서 e를 출력해도 됨
		}
		//오류가 발생한 부분이 있어도 끝까지 내용이 실행됨. 예외처리를 했으므로
		System.out.println("끝까지 실행 완료");
	}

}
