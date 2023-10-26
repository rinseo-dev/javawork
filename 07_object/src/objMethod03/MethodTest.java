package objMethod03;

//실행 클래스
public class MethodTest {

	public static void main(String[] args) {
		//객체 생성
		Method m1 = new Method();
		
		m1.print1(); //method를 호출하므로 ()괄호를 꼭 써야함.
		//print1은 반환형이 없는 메소드이므로 출력할 수 없음.
		//void형은 들어오는 값이 없으므로 자료형도 없음.그래서 출력이 안됨.
		
		int re = m1.print2(); //이렇게 저장(?)해주지 않으면 출력이 안됨.
		//re라는 저장공간을 만들고 result에 들어가있던 1 값을 re가 받음
		System.out.println(re);
		//re를 출력하면 result에 있던 1값이 출력됨.
		
		System.out.println(m1.print3());//print1,2()처럼 저장하지 않고 바로출력도 가능
		
		boolean re1 = m1.print4();
		System.out.println(re1);
		
		m1.print5(10);//10처럼 넣는 값을 '인자'라고 함.
		//이 값이 print5()에 int x자리로 넘어감.
		
		int re2 = m1.print6(5);
		//print6(5)에서 5값이 int x로 넘어가고 x+y를 한 15가 return 값이 됨.
		//결과적으로 print6()는 15를 가짐.
		System.out.println(re2);//re에 print6()값이 넘어가므로, 15가 출력됨.
		
		String str = m1.print7(7);
		System.out.println(str);
		//여기서 str을 출력하면 반환값인 "* 연산함"만 출력됨.
		//Method.java에서 print7()이 출력문으로 re를 출력해줘야 값이 함께 출력됨

		System.out.println(m1.print8(5, 8));//m1.print8(re, re2)이 형태를 가짐
		
		m1.print9("java", 10);
		//print()의 자료형이 String, int 두가지이므로, 인자도 ','를 기준으로 2가지 자료형으로 넣어줌.
		
		m1.print10(13.89, "문자열", true, 4);//m1.print10(re, str, re1, re2)
	
	}

}
