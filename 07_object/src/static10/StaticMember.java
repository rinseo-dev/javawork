package static10;

public class StaticMember {
	
	/*
	 JVM에서 자동으로 빈(empty) 생성자를 만들어줌
	 StaticMmber(){}를 만들지 않았지만 사용할 수 있음
	*/

	//인스턴스 필드
	//인스턴스 멤버와 정적멤버 모두 사용 가능 - 인스턴스를 호출 할 때 이미 객체가 생성되어 있으므로.
	int num = 1; //명시적 초기화 - 바로 초기화 값을 넣음.
	String name = "이턴스";
	//인스턴스는 객체 생성을 해야 접근 할 수 있음.
	
	//정적 필드 - 앞에 static붙임
	static int sNum = 2;
	static String sName = "김정적";
	
	//인스턴스 메서드
	//인스턴스 메서드는 반드시 객체를 생성해서 사용해야 함.
	void Me1() {
		System.out.println("인스턴스 메서드 Me1()");
	}
	
	String Me2() {
		System.out.println("인스턴스 메서드 Me2()");
		return "Me2()";//String형이라 반환값 필요.
	}
	//Me2를 호출했다는 건 이미 사용할 객체를 생성했다는 의미.
	
	
	//정적 메서드 - 객체를 생성하든 안하든 사용 가능
	//정적 메서드와 필드만 호출 가능
	static void sMe3() {
		//System.out.println(num);//오류 발생. 인스턴스 변수는 반드시 객체를 생성해야 사용 가능.
		//정적메서드나 정적 필드에서는 인스턴스 필드나 인스턴스 메서드를 사용할 수 없음.
		sMe4();//이건 호출 가능. 같은 static형태 이므로.
		//Me2();//호출 불가능. 객체 생성이 필요한 형태.
	
		
		System.out.println(sNum);//출력가능. 객체 생성을 하든 안하든 사용 가능
		
		System.out.println("정적 메서드 sMe3()");
	}
	
	static int sMe4() {
		System.out.println("정적 메서드 sMe4()");
		return 4;//int형으로 리턴해줘야 함.
	}
}
