package abs02;

public class PhoneTest {

	public static void main(String[] args) {
		/*
		Phone p = new SmartPhone("김복보");
		p.turnOn();
		
		//p.search();이렇게 했었는데 [Add cast to 'p']문구 눌러서 나옴
		((SmartPhone) p).search("자바");
		
		p.turnOff();
		System.out.println("핸드폰 주인:"+p);
		
		p = new FolderPhone("김폴더");
		*/
		
		//부모클래스가 갖고 있는 메서드는 turnOn, turnOff뿐임.
		//폴더폰과 스마트폰에서 공통적으로 사용할 수 있는건 두가지 뿐.
		
		Phone phone = new FolderPhone("홍길동");
		phone.turnOn();
		phone.turnOff();
		
		FolderPhone fp = new FolderPhone("아무개");
		fp.message("[좋은 하루 입니다]");
		//message()는 FolderPhone에서만 사용 가능
		
		phone = new SmartPhone("김기남");
		phone.turnOn();
		phone.turnOff();
		
		SmartPhone sp = new SmartPhone("이건왜");
		sp.search("사기꾼");
	}

}
