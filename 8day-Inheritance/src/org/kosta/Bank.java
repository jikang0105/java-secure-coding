package org.kosta;
// 접근 제어자 테스트 예제 : step2.TestAccessModifier 에서 접근한다
public class Bank {
	public void publicTest() {
		System.out.println("public");
	}
	protected void protectedTest() {
		System.out.println("protected에 접근");
	}
	void defaultTest() {
		System.out.println("default에 접근");
	}
	private void privateTest() {
		System.out.println("private에 접근:");
	}
}
