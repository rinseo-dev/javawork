package exception01;

public class Throws11 {

	//Thorws는 예외 떠넘기기
	
	/* 이 상태에서 예외처리 구문 만들건지 뜸.
	public static void main(String[] args) {
		Throws11.change();
	}
	
	//throws를 넣어두면 예외처리에 대한 try-catch를 만들 것인지, 아니면 throws를 지울건지 밑줄이 뜸
	public static void change() throws ClassNotFoundException{
		
	}
	*/
	
	public static void main(String[] args) {
		try {
			//Throws11.change();//내 걸 호출하는 경우 클래스 이름 없어도 됨
			change();
		} catch (ClassNotFoundException e) {
			//e.printStackTrace(); 예외구문 전체 출력 가능
			System.out.println("클래스가 없음"); //이렇게 출력도 가능
		}
	}
	
	//throws를 넣어두면 예외처리에 대한 try-catch를 만들 것인지, 아니면 throws를 지울건지 밑줄이 뜸
	public static void change() throws ClassNotFoundException{
		Class class01 = Class.forName("java.lang.String2"); // 자바 랭기지에 String2는 없으므로 에러
	}

}
