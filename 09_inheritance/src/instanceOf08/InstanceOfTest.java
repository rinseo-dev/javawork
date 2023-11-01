package instanceOf08;

class Parent{
	
}
class Child extends Parent{
	
}

public class InstanceOfTest {

	public static void main(String[] args) {
		/*
		 	instanceof: 좌측의 객체가 우측의 타입으로 만들어졌냐를 검사
		 	결과는 true, false로 나옴
		 	- true : 우측타입으로 객체가 만들어졌다(즉, 강제 형변환 가능)
		 	- false : 우측타입으로 객체가 만들어지지않았다(강제 형변환 불가능)
		 */
		//자동형변환 - 자식타입으로 만들어진 객체를 부모 타입으로 형변환
		
		//형변환은 컴파일 오류로 발생하기 때문에 실행해봐야 앎
		Parent p1 = new Parent();
		
		if(p1 instanceof Child) { //p1이 처음부터 Child의 객체로 만들어졌다면 if문실행
			//강제형변환 - 부모타입을 자식타입으로 형변환
			//주의점 : 처음 객체를 만들 때 자식 타입으로 객체가 생성되어야함
			//자식 객체를 만들면 부모,자식 객체 2가지가 존재하므로 형변환 하려고 할 때 사용할 수 있지만
			//처음부터 부모객체로 만들어진 경우는 형변환 불가
			Child c1 = (Child)p1;//이거만 단독으로 쓰면 오류
			System.out.println("p1을 자식클래스 강제형변환 성공");
		}else {
			System.out.println("p1은 강제형변환 불가");
		}
		
		Parent p2 = new Child(); //자식객체와 부모객체를 만들어놓고 부모객체만 쓰는 상태(?)
		if(p2 instanceof Child) {
			Child c2 = (Child)p2;
			System.out.println("p2를 자식클래스 강제형변환 성공");//여기는 두 객체가 모두 성성된 상태이므로 사용 가능.
		}else {
			System.out.println("p2는 강제형변환 불가");
		}

	}

}
