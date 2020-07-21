package step2;

public class Person extends Animal {
	@Override
	public void play() {
		System.out.print("사람이 데이트하며");
		super.play();
	}
	// Person의 독자적인 메서드
	public void buyTicket() {
		System.out.println("사람이 티켓을 구매하다");
	}
	
}
