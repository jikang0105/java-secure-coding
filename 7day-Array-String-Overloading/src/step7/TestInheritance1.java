package step7;
// ������ ��� �׽�Ʈ ����
class Animal{
	int age = 1;
	public void eat() {
		System.out.println("�Դ�");
	}
}

// Animal�� ��ӹ޾ƺ���
class Person extends Animal{
	// �θ� Animal�� ���� �ڽ��� ����� �����Ѵ�.
	public void study() {
		System.out.println("����� �����ϴ�");
	}
}

public class TestInheritance1 {
	public static void main(String[] args) {
		// �ڽ� Person ��ü�� �����Ѵ�.
		Person p = new Person();
		p.eat(); // ��ӹ޾����Ƿ� ��밡���ϴ�.
		System.out.println(p.age); // ��ӹ޾����Ƿ� �����
		p.study(); // �ڽ��� �޼���� �翬�� ��밡���ϴ�.
	}
}
