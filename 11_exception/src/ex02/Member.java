package ex02;

//Book, Member는 java bean이라고 보면 됨.

public class Member {
	String name;
	int age;
	char gender;

	Member(){
	} //세미콜론은 익명객체일때만
	
	Member(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//toString으로 member만 호출하면 가능하도록
	@Override //오버라이딩추가
	public String toString() {
		return "이름:" + name + " 나이:" + age + " 성별:" + gender;
	}
	
	
}
