package constructorOverloading09;

public class Car {
	//여긴 전역변수
	String company; // = null;
	String model; // = null;
	String color; // = null;
	int speed; // = 0;
	
	//초기화 블럭
	//클래스에 올라올 때만 사용 가능(?)
	{
		company = "대우";
		model ="kk";
		color="검정";
		speed=1;
	}
	//초기화블럭 static
	static String companys;
	static String models;
	static String colors;
	static int speeds;
	static {
		companys = "대우";
		models ="kk";
		colors="검정";
		speeds=1;
	}
	
	//생성자 오버로딩
	//this()->다른 생성자 호출(매개변수의 개수와
	
	Car(){//이름은 같고 매개변수의 개수가 다르게 오버로딩 된 상황
		this("삼성"); // 매개변수 1인 생성자를 선택하게 됨.
		//아래 매개변수 1개인 company값에 삼성이 들어가고, 전역변수 company에 삼성들어감
		//그래서 this를 지정한 상태에서 Car()를 출력을 하면 car(String company), car() 총 두개가 출력됨.
		//this("삼성")을 통해서 매개변수 1개인 Car(String company)로 가서 출력이 실행되고
		//company에 삼성 값이 들어감. 그리고 나서 Car()에 있는 출력문이 실행됨
		
		//this("삼성","SM5","흰색");을 지정해주면
		//매개변수 3인 생성자 출력문이 먼저 출력되고, 매개변수 없는 생성자가 출력됨
		
		System.out.println("매개변수 없는 생성자");
	}
	
	Car(String company){ //생성자를 통한 초기화
		this(company,"SM5","흰색");
		//이렇게 선언한 경우 car5에서 "BMW"를 가져온 상황이므로 매개변수 1개인 메서드에서 3개짜리 메서드로 가게 됨
		//매개변수 3개인 생성자에 company값은 BMW, model SM5, color 흰색이 들어감.
		//매개변수 1개인 값을 출력하고 매개변수 3개인 값을 출력하게 됨.
		
		//this(company, null, null);처럼 값을 넣지 않기도 가능함.
		//String의 기본값이 null이므로.
		
		System.out.println("매개변수 1개인 생성자");
		this.company = company;//지역변수로 받은 걸 전역변수 company에 넣음
		
	}
	
	Car(String company, String model){
		this(company, null, null);
		//이 경우, car6에서 벤츠, E클래스가 넘어오고 흰색이 추가되는 것
		System.out.println("매개변수 2개인 생성자");
		this.company = company;
		this.model = model;
	}
	
	//개수가 다르든지, 자료형이 달라야 하는데 아래 방식은 자료형도 같고 개수도 같음.
	//변수 이름이 다른 경우에는 오버로딩이 적용되지 않으므로 아래 방식은 오류임.
	//자료형이 같은데 변수 이름이 다르다고 해서 그걸 컴퓨터가 판단해서 값을 넣을 순 없음.
	/*
	Car(String color, String company){
		System.out.println("매개변수 2개인 생성자");
		this.color = color;
		this.company = company;
	}
	*/
	
	//매개변수 3개짜리들을 뒤에 0,1,2개 오버로딩 되게 메서드 생성함.
	//클래스 이름과 동일한 이름으로 생성자 작성. 사용자에게서 받을 값들
	Car(String company, String model, String color){//여기는 지역변수
		System.out.println("매개변수 3개인 생성자 호출 : ");
		this.company = company;
		//this없이 company를 사용하면 지역변수를 사용하는 것이므로 Car의 생성자인 company에 값이 다시 들어감.
		//this.company로 작성해주면 전역변수인 필드값 company에 값이 들어감.
		this.model = model;
		this.color = color;//지역변수를 통해서 전역변수에 입력..?
	}
	//CarTest.java에서 car1, car2로 넘어온 생성자들이 활용되는 것
	//car1을 기준으로 기아->(지역변수)company ->this.company->(전역변수)String company로 감
	//그래서 car1.company를 출력하면 "기아"가 출력됨.
}
