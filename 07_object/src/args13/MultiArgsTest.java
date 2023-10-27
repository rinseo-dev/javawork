package args13;

public class MultiArgsTest {

	public static void main(String[] args) {
		/*
		인스턴스 메서드인 경우는 객체를 생성해서 활용해야 함.
		MultiArgsTest mt = new MultiArgesTest();
		String str = mt.concatenate("","","","");
		*/
		
		//MultiArgsTest클래스 안에 있으므로 MultiArgsTest.concatenate로 명시하지 않아도 이름이 같은 메서드를 사용 가능.
		//String str = concatenate("","","","");
		String str = concatenate("a","b","c"); //String...으로 현재 concatenate가 값을 배열로 받는 상태
		System.out.println(str);
		
		String strArr[] = {"홍길동","아무개","이순신","kkk","iwoeir"};
		System.out.println(concatenate(strArr));
		
		//con2(문자열+배열)의 조합으로 봄.
		System.out.println(con2("-","홍길동","아무개","이순신"));
		System.out.println(con2("/", new String[] {"1","2","3"}));//이런식으로 배열을 생성해서 출력도 가능
		
		//System.out.println(con2(strArr));//오류 발생.
		//strArr은 배열이라서 String...b값을 받는데, String delim은 배열이 아니고 문자열이어서 String인 문자열이 하나 들어와야 함.
		System.out.println(con2(" ",strArr));//문자열+배열의 조합이므로 이렇게는 출력 가능함.
		
		//합계 숫자가 몇개가 들어올지 모름
		//메소드 호출하여 합계 출력-아니 왜 풀이를 다 안해주는데..
		System.out.println(con3(1,3));

	}
	
	//static String concatenate(String i, String a, String b, String c) {
	//static String concatenate(String i, String... a ) {//하나 이상의 값을 받는다면 하나는 명시적으로 선언해줌
	static String concatenate(String...a) {
	//(String... a)라고 선언하면 'a'는 하나의 변수고, 아예 아무 값이 안들어와도 되고, 몇개가 들어와도 상관 없음.
		//'...'으로 들어오는 값은 배열로 받게 됨
		
		String result = ""; //지역변수여서 기본값이 없으므로, 초기값을 만들어줘야함.
		
		//result = i + a + b + c; String i,a,b,c를 사용했을 때
		
		for(String str : a) { //str에 a가 들어오고, 그 다음 b가 들ㅇ옴.
			result += str + ", ";
		}
		//concatenate("a","b","c")의 값이 for문 str로 하나씩 넘어오고, result라는 빈공간에 a,b,c가 순차적으로 더해짐
		//result값에 abc가 생성됐고 return 반환으로 main에 정의한 String str은 abc가 됨. 
		
		return result;
	}
	
	static String con2(String delim, String...b) {
		String result = "";
		for(String str : b) {
			result += str + delim;
		}
		return result;	
	}
	
	//합계를 구하는 메서드 구현
	static int con3(int a, int...b) {
		int result = 0;
		for(int num : b)
			result += num + a;
		
		return result;
	}
	
	
	//이걸 제일 처음에 작성했었음 ㅇㅇ 다른 설명 하면서 주석처리됨.
	//static이 안붙었으므로 concatenate()는 인스턴스 메서드
		/*
		String concatenate(String i, String a, String b, String c) {
			String result = ""; //지역변수여서 기본값이 없으므로, 초기값을 만들어줘야함.
			
			//result = i+a+b+c; 이 값을 return할 것.
			
			return result;
		}
		*/
}
