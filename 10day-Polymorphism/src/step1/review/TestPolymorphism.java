package step1.review;

class Animal{
	public void sleep() {
		System.out.println("�ڴ�");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal{
	// �޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� ������
	public void eat() {
		System.out.println("����� ������ ���� �Դ�");
	}
	// �ڽ��� �������� �޼���
	public void study() {
		System.out.println("����� �����ϴ�");
	}
}

public class TestPolymorphism {
	public static void main(String[] args) {
		// �θ�Ÿ���� ������ �ڽ� Ÿ���� ��ü�� ������ų�� �ִ�.
		Animal a = new Person();
		// �� ��� �ٷ� �����Ͽ� ��밡���� ����
		// �θ�κ��� ��ӹ��� ���(����, �޼���)�� �������̵��� �޼����̴�.
		a.sleep(); // ��ӹ��� ��
		a.eat(); // �������̵��� ��
		// a.study(); // �������ΰ��� �ٷ� ������ �Ұ����ϴ�. �ٿ�ĳ������ �ʿ��ϴ�.
		// �����ϱ����ؼ��� Object Down Casting�� �ʿ��ϴ�.
		((Person)a).study();
	}
}
