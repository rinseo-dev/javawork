package inSuper04;

//this.: 지금 객체를 생성한 '나' 자신.
//super: 상속받은 부모를 의미
class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20;
	//int y = 20;
	
	void method() {
		int x = 30;//메서드 안에 있는 지역변수 x
		//int y =30;
		System.out.println("x=" + x);
		//지역변수x가 있나 찾음->인스턴스변수중에 x가 있나 찾음->부모클래스에x가 있나 찾음.
		//지역변수가 x가 없이 y라면 Child에 있는 인스턴스 변수인 x를 찾아가므로 x = 20이 된다는 것.
		//지역변ㄴ수도 인스턴스변수도 없으면 부모클래스에 있는 x =10을 출력하게 됨
		
		System.out.println("this.x=" +this.x); //this는 인스턴스에 있는 x값을 가짐. 20
		System.out.println("super.x=" + super.x);//super는 상속받은 부모의 것에서 가져옴. 10
		//super가 붙으면 처음부터 부모클래스를 참조하게 됨.
		
		//우선순위 로컬>인스턴스>부모클래스
	}
}
public class SuperTest1 {
	
	public static void main(String[] args) {
		Child ch = new Child();
		//이렇게 객체를 생성하면 자식의 x값이 올라옴.부모의x도 올라옴
		ch.method();
	}

}
