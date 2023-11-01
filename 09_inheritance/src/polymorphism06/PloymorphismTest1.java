package polymorphism06;

class A{
	int aa = 10;
}
class B extends A{
	int bb = 20;
}
class C extends A{
	int cc = 30;
}
class D extends C{
	int dd = 40;
}
class E extends B{
	int ee = 50;
}

public class PloymorphismTest1 {

	public static void main(String[] args) {
		B b1 = new B();//객체가 만들어지는 곳에 B라는 객체가 만들어지고, 상속받은 A의 객체도 생성됨.
		A a1 = b1;//A클래스로 형변환 : A클래스의 인스턴스 멤버만 사용 가능.
		//b1이라는 객체가 2개 생성된 상태. 하지만 사용은 A객체에 있는 것만 사용됨.
		
		a1.aa = 100;
		//a1.bb = 200;//B객체가 있지만 A a1 = b1의 형변환을 통해 A객체만 사용할 수 있게 됐으므로 bb를 사용하는 것은 오류
		System.out.println(a1.aa);//A객체에 100
		
		C c1 = new C();//객체공간에 객체C 생성, A를 상속받으므로 A객체도 동시에 생성되므로 c1는 A,C 모두 사용 가능.
		a1 = c1; //c1은 A,C둘 다ㅏ사용할 수 있는데, a1만 사용하도록 정의됨.
		System.out.println(a1.aa);//출력 10
		//여기서 a1이 갖는 값은 c1에 있는 A객체의 a1이므로 10이 출력됨.
		//같은 a1이지만 형변환으로 서로 다른 값을 갖게 됨

		D d1 = new D(); //C,A 둘 중 하나로 형변환 가능. 상속을 2개 받으므로
		C c2 = d1;//이런 경우 D값은 사용하지 못하고, C, A값은 사용 가능함.
		
		c2.cc = 300;
		c2.aa = 1000;
		
		A a2 = d1;
		a2.aa = 10000;
		//a2.cc = 34; C클래스 사용 불가.
		
		E e1 = new E();
		A a3 = e1; //A클래스의 멤버만 사용가능
		B b3 = e1; //B클래스와 A클래스의 멤버 사용 가능
		
		//A-B-E상속
		//A-C-D상속
		//이 형태에서 D는 B를 상속하지 않고, E는 C를 상속하지 않음. 그래서 사용불가
	}

}
