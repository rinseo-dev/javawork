package in01;


class D{
	int x;
	static int sx;
}

class E extends D{
	String x; //String z;처럼 다른 변수명을 가지면 상관없음. 같은 이름을 사용해서 우선순위 발생.
	static String sx;
}

public class InheritanceTest3 {

	public static void main(String[] args) {
		E e = new E();
		e.x = "혼자 공부하는 자바";
		System.out.println(e.x);
		//e.x = 1234;
		//1.객체가 생성된 필드부터 확인하고, 존재하면 그 필드를 사용함 - 존재하는 경우는 2번으로 가지 않음
		//2.만약 객체가 생성된 필드명이 없으면 사옹받은 부모 필드를 살펴본다
		
		//상속도 우선순위가 있음. 지역변수가 제일 높음.
		//'나'의 객체가 생성된 인스턴스 변수가 부모클래스보다 우선 순위가 높음.
		//그래서 x는 E에 생성된 것에 들어감. D에서 생성
		
		D d = new D();
		d.x = 9;
		System.out.println(d.x);
		
		e.sx = "마이바티스";
		d.sx = 123;
		//static인 경우 클래스이름.변수 가 되므로, 이름이 같아도 자료형이 다르면 사용 가능함.
	}

}
