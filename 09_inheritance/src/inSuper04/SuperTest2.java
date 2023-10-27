package inSuper04;

//같은 패키지 안에서 클래스 이름은 중복되면 안됨
class Parent2{
	int x = 10;
	
	void display() {
		System.out.println("부모클래스의 display() 메소드");
	}
}

class Child2 extends Parent2{
	int x = 20;
	
	//오버라이딩. 메서드, 자료형, 개수는 같고 실행 내용만 다름.
	void display() {
		System.out.println("자식클래스의 display() 메소드");
	}//부모것만 쓰겠다면 오버라이딩을 할 필요가 없음. 자식걸 쓴다면 선언해줘야하는 것.
	
	void method() {
		display();//Child2에 있는 display()를 호출함.
		super.display();//Parent2가 갖고 있는 display()메소드를 호출함
		
		System.out.println("Child2클래스의 x = " +this.x);
		System.out.println("Parent2클래스의 x = " + super.x);
	}
}
public class SuperTest2 {
	
	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		ch2.method();
		ch2.display();//무조건 Child2가 실행됨. 오버라이딩된 경우 '나'의 것이 우선됨.
	}

}
