package exception01;

public class Exception01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			//예외가 발생할 수 있는 경우
			System.out.println(3);
			
			//오류가 없는 경우 1,2,3,4,6실행됨
			//오류가 나는 상황을 만듦 - 1,2,3,5,6실행됨
			int result = 30/0;//0으로 나누기 하면 오류 발생.4번 실행없이 5번 실행 될 것.
			
			System.out.println(4);
		}catch(Exception e) { //여기에 모든 Exception을 다 넣을 수 있음.
			//예외가 발생했을 때만 실행 - try에서 예외가 발생했을 때 catch문 실행됨.
			System.out.println(5);
		}
		//try-catch문이 있으므로, 오류가 있어도 예외문 이후의 문구는 실행됨
		//예외가 없는 경우 실행됨
		System.out.println(6);
	}

}
