package step2;

public class Person extends Animal {
	@Override
	public void play() {
		System.out.print("����� ����Ʈ�ϸ�");
		super.play();
	}
	// Person�� �������� �޼���
	public void buyTicket() {
		System.out.println("����� Ƽ���� �����ϴ�");
	}
	
}
