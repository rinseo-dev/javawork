package ex02;

public class Member {
	String name;
	int age;
	char gender;
	
	Member(){
	}
	
	Member(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		return "이름:" + name + "나이:" + age + "성별:" +gender;
	}
}
