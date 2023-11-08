package test231107;

public class Student {
	String id;
	String name;
	String password;
	int age;
	
	public Student() {
	}
	
	public Student(String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"의 정보 : "+name+"의 정보 [id="+id+", age="+age+"]";
		//return "Student [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
	
}
