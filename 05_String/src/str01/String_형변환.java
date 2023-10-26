package str01;

public class String_형변환 {

	public static void main(String[] args) {

		//문자 -> 숫자 형변환 : class이름.parse형이름(변환할 변수);
		String str1 = "100";
		//int num1 = (int)str1; //(X)이런 식은 안됨
		int num1 = Integer.parseInt(str1); //Integer class를 사용해서 그 값으로 변경해주는 것.
		double dou1 = Double.parseDouble(str1);//클래스를 사용해서 변환하기 때문에 앞글자 반드시 대문자
		
		System.out.println(dou1);
		System.out.println(num1+10);
		System.out.println(str1+10);
		
		//숫자->문자 형변환
		int num2 = 50;
		double dou2 = 78.12;
		//String str2 = (String)num2;//(X) 이런 식은 형변환이 아님
		String str2 = String.valueOf(num2);//어떤 자료형이든 valueOf해주면 됨
		String str3 = String.valueOf(dou2);
		
		System.out.println(str2+90); //문자열+90 이라서 5090이 출력됨
		
	}

}
