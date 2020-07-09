package step4;
// import 는 다른 팩키지의 자원(클래스)를 이용할 때 명시한다.
import step3.Account;
// 접근제어자를 테스트하는 예제
public class TestAccess {
	public static void main(String[] args) {
		Account a = new Account();
		// public 이므로 접근이 가능하다.
		System.out.println(a.name);
		// default 이므로 접근이 불가능하다. (다른 팩키지이므로)
		//System.out.println(a.id);
		// private 이므로 접근이 불가능하다. (다른 팩키지의 클래스이므로)
		// System.out.println(a.password);
		
	}
}
