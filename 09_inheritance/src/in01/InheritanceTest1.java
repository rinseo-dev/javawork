package in01;

//class라이브러리는 보통 따로만들어서 사용함. 편의상 main이랑 같이 작성
class A{
	int aa = 1;//필드
}

class B extends A{//클래스A를 상속받은 클래스B
	int bb = 2; //bb,aa사용가능
}

class C extends B{//클래스B를 상속받은 클래스C
	int cc = 3;//cc,bb,aa모두 사용가능
}

//cc라는 객체를 생성하면 메모리에 aa,bb,cc의 공간이 모두 생성됨.

//상속은 1개만 가능함. A->B->C형태르 C가 받는 것은 가능하지만
//class C extends B extends A{}는 불가능함.

public class InheritanceTest1 {

	public static void main(String[] args) {
		C objC = new C(); //C는 B를 상속, B는 A를 상속하므로 C는 A,B클래스를 모두 상속받으므로 A,B의 필드를 모두 사용할 수 있음.
		System.out.println("C클래스 객채에서 aa속성 값 : " + objC.aa);
		System.out.println("C클래스 객채에서 bb속성 값 : " + objC.bb);
		System.out.println("C클래스 객채에서 cc속성 값 : " + objC.cc);
		
		B objB = new B();
		System.out.println("B클래스 객채에서 aa속성 값 : " + objB.aa);//class A로부터 상속 받아서 사용 가능.
		System.out.println("B클래스 객채에서 bb속성 값 : " + objB.bb);
		//System.out.println("B클래스 객채에서 cc속성 값 : " + objB.cc); 사용 불가능 cc값은 상속된 값이 아님.
		
		A objA = new A();
		System.out.println("A클래스 객채에서 aa속성 값 : " + objA.aa);//class A로부터 상속 받아서 사용 가능.
		//System.out.println("A클래스 객채에서 bb속성 값 : " + objA.bb);
		//System.out.println("A클래스 객채에서 bb속성 값 : " + objA.cc); class B, C의 값은 A에서 사용할 수 없음
	}

}
