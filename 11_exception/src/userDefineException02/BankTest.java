package userDefineException02;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(10000);
		System.out.println("현재 잔액 : " + bank.getBalance());
		
		//bank.withdraw(20000); //throws를 사용할건지 try-catch를 사용할건지 물음
		//try-catch사용
		try {
			bank.withdraw(20000);
			System.out.println( "현재 잔액 : " + bank.getBalance() );
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}

}
