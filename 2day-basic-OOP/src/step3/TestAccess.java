package step3;
// 접근제어자를 테스트하는 예제
public class TestAccess {
	public static void main(String[] args) {
		Account a = new Account();
		// public 이므로 접근이 가능하다.
		System.out.println(a.name);
		// default 이므로 접근이 가능하다.
		System.out.println(a.id);
		// private 이므로 접근이 불가능하다. (다른 클래스이므로)
		// System.out.println(a.password);
		
	}
}
