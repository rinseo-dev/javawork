package exception01;

//예시로 상속 구조 만들어줌.
class Animal{
}
class Dog extends Animal{
}
class Cat extends Animal{
}

public class ClassCast05 {//상속받았을 때, 부모타입으로 형변환 시도하면 오류

	public static void main(String[] args) {
		//부모객체로 생성했는데 자식객체로 형변환 하려고 함
		
		try {
			Dog dog1 = new Dog();//Dog객체 생성. 부모거까지 객체 2개 만들어짐.
			Animal ani = dog1; //Dog객체를 사용하지않고 Animal만 사용함.
			Dog dog2 = (Dog)ani;
			System.out.println("Dog 형변환");
			
			//여기서부터 오류가 발생해서 Cat형변환은 출력되지 않음.
			Animal ani2 = new Animal();
			Cat cat = (Cat)ani2;
			System.out.println("Cat 형변환");
		}catch(ClassCastException e){
			System.out.println("클래스 형변환 불가");
		}
	}//main

}
