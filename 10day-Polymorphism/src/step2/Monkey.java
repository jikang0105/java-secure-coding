package step2;

public class Monkey extends Animal {
	// �޼��� �������̵�
	@Override // ������̼� ( Override ���� check ) : �ǹ��ִ� �ּ�
	public void play() {
		System.out.print("�����̰� ����Ÿ��");
		super.play();
	}
}
