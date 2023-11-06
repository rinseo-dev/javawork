package set_map02;

class A{
	int a1;
	int a2;
	A(int a1, int a2){
		this.a1 = a1;
		this.a2 = a2;
	}
}

class B extends A{
	int b1;
	int b2;

	B(int a1, int a2, int b1, int b2){
		super(a1,a2); //부모의 생성자로 넘겨줌. 값은 A(int  a1, int a2)에 각각 넘어감. A에 있는 this를 통해서 class A{int a1; a2;로 넘어감.
		this.b1 = b1;
		this.b2 = b2;
	}
}

public class Test {

	public static void main(String[] args) {
		B b = new B(1,2,3,4);

	}

}
