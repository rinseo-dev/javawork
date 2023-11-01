package exception01;

public class Throw10 { //Throw 는 예외를 일부러 발생시킬때를 나타남. throws와 다름.
	//throw는 강제로 예외를 발생시킬 때 사용.
	
	public static void main(String[] args) throws Exception {
		try {
			//int num = 3/0;//이걸 주석처리 풀면 아래 주석처리된 sysout(e)와 연결
			
			Exception e = new Exception("고의로 예외 발생시킴");
			throw e; //throw로 고의 예외를 발생시킴. add throws declaration 알림 뜸. 쿨릭하면 throws Exception이게 추가됨
			
			
		}catch(Exception e) {
			//System.out.println(e); //여기서 발생한 에외처리는 딱히 형태를 가지지 않음. 억지로 만든거라서
			
			//예외 발생시 어떻게 출력할지 방법들
			e.printStackTrace(); //전체 오류구문 출력됨
			System.out.println(e.getMessage());
			System.out.println("예외 발생");
			
		}
	}

}
