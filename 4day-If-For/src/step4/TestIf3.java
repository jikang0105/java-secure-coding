package step4;

public class TestIf3 {
	public static void main(String[] args) {
		MyAccount account = new MyAccount();
		account.setBalance(100);
		System.out.println(account.getBalance()); // 100
		account.setBalance(-1); // 잘못된 금액입니다 ( 0을 초과해야한다 )
		System.out.println(account.getBalance()); // 100
		account.setBalance(500);
		System.out.println(account.getBalance()); // 500 출력
		System.out.println("************입금*************");
		int money = 100;
		account.deposit(money);
		System.out.println(account.getBalance()); // 600
		money = -1;
		account.deposit(money); // 잘못된 입금액입니다.
		System.out.println(account.getBalance()); // 600
		System.out.println("************출금*************");
		money = 20;
		account.withdraw(money);
		System.out.println(account.getBalance()); // 580
		money = -1;
		account.withdraw(money); // 잘못된 출금액입니다.
		System.out.println(account.getBalance()); // 580
		money = 600;
		account.withdraw(money); // 잔액이 부족합니다.
		System.out.println(account.getBalance()); //580;
	}
	
	
}
