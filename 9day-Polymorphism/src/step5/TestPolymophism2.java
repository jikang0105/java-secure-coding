package step5;

class Zoo{
	/*
	 * �̿� ���� ��ü�� ������ ���� ������ ��� �̿� �����ϴ� ó�� �޼����
	 * ��� �����Ǿ�� �Ѵ�. �̴� �ý����� ���յ������� ������������ ���� �ʴ�.
	 * public void pass(Person p) {
	 * 		p.eat();
	 * }
	 * public void pass(Monkey monkey) {
	 * monkey.eat();
	 * }
	 */
	// �Ʒ��� ���� �������� ����� �Ű� ������ ó���ϸ� Animal �ڽ� ��ü�� ����
	// ������� �ϳ��� �޼���(�޼��� ���)���� ��� ó���� �� �ִ�.
	public void pass(Animal a) {
		a.eat();		
	}
	
}

public class TestPolymophism2 {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.pass(new Person());
		z.pass(new Monkey());
		// �� �� �������� �پ��� ������ ��ü�� �ִٰ� �����Ѵ�.
	}
}
