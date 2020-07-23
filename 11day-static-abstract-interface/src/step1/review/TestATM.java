package step1.review;
/*
 * 메서드에 리턴값이 없을 떄 void를 명시한 경우의 사용과
 * 메서드에 리턴타입이 명시되고 리턴값이 있을때 사용 되는
 * 경우의 특징을 공부하는 예제
 */

class ATM{
	int money = 100;
	// 입금하는 메서드 = 리턴값이 필요가 없으므로 void로 선언
	public void deposit(int money) {
		this.money += money; 
	}
	// 출금하는 메서드 - 리턴값이 필요(돈을 출금해야 하니까), money의 type이 int이므로
	// void대신 리턴값의 형을 명시한다.
	public int withdraw(int money) {
		this.money -= money;
		return money;
	}
}

public class TestATM {
	public static void main(String[] args) {
		ATM atm = new ATM();
		// 고객이 200을 입금한다.
		// void 이므로 return value가 없으므로 출력이 불가능하다.
		// System.out.println(atm.deposit(200));
		// int d = atm.deposit(200); // void 이므로 error
		atm.deposit(200);
		// 고객이 돈울 출금한다.
		// 리턴값이 있으므로 출금액을 반환받아 변수에 저장할 수 있다.
		int m = atm.withdraw(100);
		System.out.println("ATM에서 출금한 돈액수 : " + m);
		// 아래와 같이 바로 반환받아 출력도 가능하다.
		System.out.println("ATM에서 출금한 돈액수 : " + atm.withdraw(20));
	}
}
