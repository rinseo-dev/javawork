package 접근제한11;

public class 접근제한 {

	private int balance; //잔고는 모두가 공용으로 사용해선 안되므로 private
	
	void deposit(int money) { //잔고에 입금
		balance += money;
	}
	
	void withdraw(int money) {
		//출금은 잔고가 찾고자 하는 금액보다 많아야 출금 가능 if문으로 조건 걸어줌
		if(balance < money) {
			System.out.println("잔액이 부족합니다");
		}else {
			balance -= money;
		}
 	}
	
	//private 지정된 값을 가져가서 사용하려면 getter/setter를 사용함
	//getter (변수의 값을 얻어 올 때)
	//steer (변수에 값을 넣을 때)
	
	int getBalance() {
		return balance;
	}
	
	void setBalance(int balance) {//int형으로 값을 받아옴
		this.balance = balance;
		
	}
}
