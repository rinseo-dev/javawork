package userDefineException02;

//유저가 직접 설정하는 Exception만듦
public class UserException extends Exception{
	public UserException() {}//생성자이름은 클래스와 동일하게 - 매개변수 없는거
	public UserException(String message) { //생성자 오버로딩
		 super(message); //부모클래스에 있는 message를 가져옴
		 
		 //message에 ("잔고 부족 : " + (money-balance) + " 모자람")이 들어옴.
	}
}
