package static10;

public class StaticMemberTest {//클래스
	//main이 있는 곳에서도 라이브러리(API)선언 가능 - 클래스가 존재하므로.
	int a;//인스턴스 변수 - 클래스 안에서 선언한 것
	static int b;//정적 변수(클래스필드)

	public static void main(String[] args) {//main이라는 정적 메서드.
		//메서드 이름은 main에 반환형이 없음. String의 배열형을 받음.
		
		//System.out.println(a);인스턴스라 객체 없이 사용 불가능
		System.out.println(b);//출력 가능. static으로 선언돼서 static에서 사용하므로
		int c;//지역변수 - 메서드나 for문 안에서 선언된 변수.
		
		for(int i=0; i<10; i++) {//i = 지역변수 - for문에서만 사용 가능
			if(2<5) {
				int aaa = 9; //지역변수 - if문에서만 사용가능
			}
		}
		
		StaticMember.sMe3();//객체 생성하지 않고 호출.
		//하지만 num은 반드시 객체를 생성해야 사용 가능.
		//StaticMember는 클래스가 올라오는 곳에 생성이 되므로 sNum은 사용 가능.
		//num은 new를 해야 저장공간에 생성이 됨.
		//지금 현재까지는 new로 변수를 생성하지 않아서 저장공간에 num이 할당되지 않은 상태라 오류발생.
		
		//정적 필드, 메서드는 객체 생성 없이 출력 가능
		//클래스이름.정적필드이름(or정적메서드이름) 형태로 출력 가능.
		System.out.println("정적 변수(객체생성 안함) :" + StaticMember.sName);
		StaticMember.sMe3();//실행하려면 무조건 stack에 올라와야 함
		//정적필드와 메서드는 객체를 생성해도 사용가능, 객체 없이도 사용 가능함.
		//형태: 클래스이름.필드이름=대문자로시작.괄호없음=static이 있는 정적 필드
		
		//클래스이름 변수이름 = new 클래스이름
		StaticMember sm1 = new StaticMember();
		System.out.println("인스턴스 변수 : " + sm1.num);
		System.out.println("정적 변수 : " + sm1.sNum);////StaticMember.sNum이 형태가 맞음.
		
		sm1.Me1();
		
		//sm1.sMe3(); 정적 형태는 굳이 이렇게 사용하지 않음
		StaticMember.sMe3();//클래스이름.정적메서드이름 형태로 사용
		//정적 메서드는 글자도 이텔릭
		//보통 정적메서드를 사용할 때 변수 이름을 붙여서 사용하지 않음. 인스턴스와 헷갈릴 수 있으므로.
		
		//인스턴스 메서드, 정적 메서드 둘 다 호출되는 걸 볼 수 있음.
		//인스턴스 메서드, 인스턴스 변수는 객체 생성을 해야 호출 할 수 있음.
		//정적은 객체 생성 없이도 호출 가능함.
		
		//Scanner sc = new Scanner(System.in);
		//sc.next();//인스턴스 메서드 이므로 객체를 생성해서 사용
		
		StaticMember sm2 = new StaticMember();
		sm2.sNum = 100;
		
		//정적메서드와 정적필드는 클래스를 이용하는 모든 객체들에 공통으로 사용됨
		System.out.println(StaticMember.sNum);
		System.out.println(sm1.sNum);
		System.out.println(sm2.sNum);
		
		/////
		
		
		//StaticMemberTest st = new StaticMemberTest();
		//이렇게 사용하면 매번 변수 선언해줘야 함. 하지만 static은 그럴 필요가 없음.
		
		StaticMemberTest.Method1();//이 상태는 출력이 아니라 return값 10이 존재함.
		System.out.println(StaticMemberTest.Method1());//이렇게 해야 받은 값을 출력 가능
		//아니면 static int Method1()에 출력구문을 넣어주면 가능
		
	}//정적 main()메서드 끝

	//이 자리에 다른 메서드를 만들수도 있음.
	static int Method1() {
		return 10;
	}
	
}
