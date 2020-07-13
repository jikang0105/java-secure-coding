package step4;

public class MyAccount {
	
	private int balance; // 인스턴스 변수는 선언만 할 경우 기본 초기화 0으로 할당.
	
	public void setBalance(int balance) {
		if(balance > 0) {
		this.balance = balance;
		}else {
			System.out.println("잘못된 금액입니다");
		}		
	}
	
	public int getBalance() {
		return balance;
	}
	
	// 입금 메서드 : 기존 balance(잔액)에 금액을 누적한다
	public void deposit(int money) {
		if(money > 0) {
			balance += money; // balance = balance + money;
		}else {
			System.out.println("잘못된 입금액입니다.");
		}
	}

	public void withdraw(int money) {
		if(money  < 0) {
			System.out.println("잘못된 출금액입니다.");
		}else if(balance < money) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance -= money;
		}
	
	
	}
}
