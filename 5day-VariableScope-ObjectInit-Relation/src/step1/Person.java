// ��Ű���� �ǹ��ִ� ���丮���� Ŭ������ �з��ϱ� ���� ����Ѵ�.
package step1;
// Ŭ������ �Ϲ������� ��ü ������ ���� Ʋ�� ���� �����Ѵ�.
public class Person {
	// �ν��Ͻ� ����(Instance Variable) : ��ü�� �Ӽ� ������ ����
	// �ڹ� �޸� ���� �� Heap ����(���� �޸� ����)�� ����
	// �ν��Ͻ� ������ ���� �ص� �ڵ� �⺻ �ʱ�ȭ�ȴ�. 
	// String�� �������̹Ƿ� null�� �ʱ�ȭ��.
	private String name;
	public void eat() {
		// �Ʒ��� count ������ �޼��� ����ÿ� �Ͻ������� ���� �� �޸𸮿��� �����ȴ�.
		int count = 2; // ��������(Local Variable) : �޼��� ���� ����
		System.out.println(count + "�κ� �Դ�.");
	}
	// �Ʒ��� name �� ������������ �Ű�����(parameter)�� �Ҹ�
	public void setName(String name) {
		// this.name : this�� ���� ��ü�� ����Ű�Ƿ� �ν��Ͻ� ���� name�� ��Ī�Ѵ�.
		// name : ������������ �Ű������� ����Ų��.
		this.name = name;
	}
	public String getName() {
		// �ν��Ͻ� ������ ����Ų��.
		return name;
	}
	public void sleep() {
		// �������� time�� �ʱ�ȭ �Ǿ����� �����Ƿ� compile error
		// int time;
		// System.out.println(time); 
		int time2 = 0; // �̿� ���� ����� �ʱ�ȭ�� �ʿ��ϴ�.
		System.out.println(time2);
	}
	public void testVariable() {
		// �ν��Ͻ� ���� name�� �����ؼ� ���
		System.out.println(name);
		// sleep() �޼��� ���� ������ time2�� �����غ���.
		// time2 ���������� �ش� �޼��忡���� �ӽ÷� ����ϹǷ�
		// �ٸ� �޼��忡���� ����� �� ����.
		// System.out.println(time2); // compile error
		sleep(); // �� �޼��忡�� �ٸ� �޼��� ȣ���� �����ϴ�.
	}
}







