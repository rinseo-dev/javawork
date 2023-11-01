package pet10;

public class Pet {
	private String kind;
	private String color;
	//1.private로 바꿔서 get메서드를 이용해서 가져오는 방법(이번에 사용할 것)
	//2.toString을 사용해서 오버라이딩으로 가져옴
	//3.별도의 메서드 정의 후 출력
	
	Pet(String kind, String color){
		this.kind = kind;
		this.color = color;
	}

	/*
	 할 줄 몰라서 이렇게 냅뒀는데 선생님이 오버라이딩할거라 출력문 안써줘도 된다고..얼떨결에 맞춤
	 근데 쓰는 방법으로 진행
	void sound() {}
	void pattern() {}
	*/
	void sound() {
		System.out.println("울음소리");
	}
	void pattern() {
		System.out.println("특징");
	}
	
	//1.getter메서드
	String getKind() {//괄호 안에 굳이 뭔가를 받을 필요는 없음
		return kind;
	}
	void getColor() {
		System.out.println(color);
	}
	
	//2.toString()오버라이딩
	//오버라이딩을 할때, 접근 제한자는 부모클래스보다 자식클래스가 더 넓은 범위를 가지거나 동일한 범위를 가져야함.
	//Pet에서  sound가 public이면, Dog에서도 public 이어야 사용 가능.
	@Override 
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color;
	}
	
	//3.별도의 메서드 정의 출력
	void info() {
		System.out.println("종류 : " + kind + ", 색상 : " + color);
	}
}
