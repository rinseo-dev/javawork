package list01;

public class Person {
	//전화번호를 받을 때 int로 받으면 010 -> 10으로 들어가서 보통 String 으로 받음.
	String name;
	int age;
	String phone;
	String address;
	
	public Person(String name, int age, String phone, String address) {
		this.name=name;
		this.age=age;
		this.phone = phone;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 전화번호 : " + phone + ", 주소 : " + address;
		
	}
}
