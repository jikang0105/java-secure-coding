package step1;

class Animal{
	private int age = 1;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
// Person(sub class)�� Animal(super class)�� ��ӹ޴´�.
// extends : Ȯ���ϴ�
class Person extends Animal{
	public void study() {
		System.out.println(getAge() + "���� �����ϴ�.");
	}
	
}

public class TestTnheritance2 {
	public static void main(String[] args) {
		Person p = new Person(); // �ڽ� ��ü�� ����
		// compile error : age������ private ���� �����ڷ� ����Ǿ��ְ�
		// private�� �ڽ��� Ŭ���� �������� ���� �����ϴ�.
		// ��ӹ޾Ҿ Ŭ������ �ٸ��Ƿ� ���������� �����ϴ� ���� �Ұ����ϴ�.
		//System.out.println(p.age);
		System.out.println(p.getAge());
	}
}
