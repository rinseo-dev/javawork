package exception01;

//예시로 상속 구조 만들어줌.
/*class Animal{
}
class Dog extends Animal{
}
class Cat extends Animal{
}
한 패키지에 선언되어 있으므로 가져와서 쓸 수 있음
*/

public class ClassCast06 {//상속받았을 때, 부모타입으로 형변환 시도하면 오류

	public static void main(String[] args) {
		//static이므로 클래스이름.메서드이름
		ClassCast06.changeIf(new Animal());//형변환 불가 Dog->Ani타입으로 변경 시도 
		ClassCast06.changeIf(new Dog());//다시 Ani -> Dog로 형변환 시도 성공
		//두번의 형변환이 일어남.
		
		System.out.println("====================");
		ClassCast06.changeTry(new Animal());
		ClassCast06.changeTry(new Dog());

	}
	//try-catch로 사용
	public static void changeTry(Animal ani) {
		try {
			Dog dog = (Dog)ani; //ani를 Dog 로 형변환
			System.out.println("Dog클래스로 형변환");
		}catch(ClassCastException e) {
			System.out.println("클래스 형변환 불가");
		}
	}
	
	//if문으로 사용
	public static void changeIf(Animal ani) { //Animal은 부모클래스이므로 형변환을 통해서 ani, dog, cat모두 들어올 수 있음. Dog ani로 하면 Dog,Cat 다 따로 만들어야함
		if(ani instanceof Dog) {//ani가 Dog객체로 만들어졌다면
			Dog dog = (Dog)ani; //ani를 Dog로 형변환.
			System.out.println("Dog클래스로 형변환");
			
		}else if(ani instanceof Cat){//처음부터 Cat으로 만들어져있었으면 Cat으로 형변환
			Cat cat = (Cat)ani;
		}else {
			System.out.println("클래스 형변환 불가");//animal로 만들어져있으므로 불가.
		}
	}

}
