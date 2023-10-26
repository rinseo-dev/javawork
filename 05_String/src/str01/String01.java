package str01;

public class String01 {
	//String이라는 이름으로는 class를 만들 수 없음.
	//기존에 만들어져있던 String보다 우선순위를 가지므로 String을 사용할 수 없게됨.
	//Math도 마찬가지.

	public static void main(String[] args) {

		String name = "홍길동";
		String hobby = "공부하기";
		//stack에 name이라는 공간이 생성되고, String은 참조변수니까 heap에 객체를 하나 만들어서 '홍길동'을 저장.
		//heap에서 '홍길동'을 생성하면서 0x120이라는 주소가 생성됐으면 stack에 name에 0x120이 저장되는 것.
		
		System.out.println(name);
		System.out.println(name == hobby);//false
		
		String str1 = "java";
		String str2 = "java";
		System.out.println(str1 == str2);//true
		
		String str5 = "홍길동"; //str5 == name -> true, new가 아니므로 같은 주소를 가짐
		System.out.println("name == str5? " + (name == str5));
		
		String str3 = new String("java");
		String str4 = new String("java");
		//Scanner scan = new Scanner(System.in); 틀래스 변수명 = new 클래스이름(매개변수); 같은 구성을 가짐.
		//원래는 Scanner처럼 객체 생성을 하고 나서 사용해야 함.하지만 String은 그걸 생략하고 String str3 = "java"도 가능.
		System.out.println("str3과 str4의 주소가 같은가 ?" + (str3 == str4)); //false
		System.out.println("str3과 str4의 값이 같은가 ?" + str3.equals(str4)); //true
		
		
		str3.equals(str4);//equals를 사용하면 주소가 아니라 실제 '값'이 같은지 비교
	}

}
