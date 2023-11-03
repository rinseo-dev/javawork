package ex01;

class Person {
	
	int id;
	
	public Person(int id){
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		/* 내가 작성..
		Person p = (Person)obj;
		int num = p.id;
		
		return id == num;
		*/
		
		//instanceof를 사용하면 오류를 줄일 수 있음
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
			//id값을 비교해서 같은지 아닌지로 true, false값
		}else {
			return false; //참,거짓으로 결과값이 나와야 함.
		}
		/*
		@Override
		public boolean equals(Object obj) {
		return id == ((Person)obj).id; //객체 안에 있는 id와 받은 id가 같은가
		이렇게만 작성해도 됨. 
		*/
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(20231102);
		Person p2 = new Person(20231102);
		//p1과 p2으 ㅣ주소는 다름
		
		if(p1.equals(p2))
			System.out.println("p1,p2 값이 같다");
		else
			System.out.println("p1,p2 값이 다르다");
		
		System.out.println();
		
		if(p1 == p2)
			System.out.println("p1,p2 객체가 같다");
		else
			System.out.println("p1,p2 객체가 다르다");
	}

}
