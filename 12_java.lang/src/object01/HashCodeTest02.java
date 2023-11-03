package object01;

public class HashCodeTest02 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc"); //abc란 값을 가진 객체 2개(str1,2)가 생성된 것
		
		String str3 = "def";
		String str4 = "def"; // 객체 def 1개가 만들어지고 같은 주소가 할당됨.
		//def값을 가진 객체가 주소0x12를 가지고, str3,4가 모두 0x12를 가리킴
		
		//str1 = "jjj"; //str1이 가리키고 있던 주소를 끊고 jjj를 가리키게 됨.
		
		//객체는 덮어쓰기가 없으므로 새로운 객체가 생성되고 주소만 바뀜
		//int a = 3;
		//a = 5; 이런 경우만 값을 덮어쓰기
		
		System.out.println(str1.equals(str4));
		
		//HashCode를 출력해서 str1, str2의 hash code가 같은지 봐야함.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//고유의 주소가 같은지 다른지를 보려면 identityHashCode를 사용하면 됨
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
