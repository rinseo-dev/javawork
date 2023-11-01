package pet10;

public class PetTest {

	public static void main(String[] args) {
		/*
		이렇게 해놨었음.
		Pets p = new Pets();
		p.sound(new Dog());
		System.out.println();
		*/
		
		//Pet pet = new Dog();//이렇게 만들면 강아지, 점박이가 들어감
		Pet pet = new Dog("흰색"); //이렇게 하면 color에 흰색
		pet.sound();
		pet.pattern();
		//System.out.println(pet.kind);//필드에 private을 붙이지 않고 직접적으로 가져오는 방법은 권장하지않음
		
		//getter메서드로 가져옴
		String kind = pet.getKind();
		System.out.println(kind);
		
		//void로 선언된 것들은 호출만 가능
		pet.getColor();
		pet.info();
		
		//toString에 정의되어 있어서 pet의 주소가 아니라 오버라이딩 된 return 값이 출력됨
		System.out.println(pet);
		System.out.println();
		
		pet = new Frog();//인자 없는 값 가져오기
		pet.sound();
		pet.pattern();
		System.out.println(pet);// toString만 호출
	}

}
