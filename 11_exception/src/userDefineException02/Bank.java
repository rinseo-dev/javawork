package userDefineException02;

public class Bank {
	//잔액 필드
	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws UserException{ //UserException으로 던져줄것.
		//if문이 true일 때 throw로 예외문쪽으로 날려버림.
		if(balance < money)
			throw new UserException("잔고 부족 : " + (money-balance) + " 모자람"); //()안의 String값이 message로 감.
		//System.out.println("잔액 부족");대신 UserException만들어서 사용.
		else
			balance -= money;
	}
	
	public int getBalance() {
		return balance;
	}

}
