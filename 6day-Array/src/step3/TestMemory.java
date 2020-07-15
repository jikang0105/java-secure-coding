package step3;

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Exam{
	public void test1(Person p) {
		System.out.println(p);
		p = new Person("�����");
		System.out.println(p);
	}
	public void test2(Person p) {
		System.out.println(p);
		p.setName("������");
		System.out.println(p);
	}
}

public class TestMemory {
	public static void main(String[] args) {
		Person p = new Person("�˼���");
		System.out.println(p);
		Exam e = new Exam();
		e.test1(p);
		System.out.println(p.getName()); // �˼���
		e.test2(p);
		System.out.println(p.getName()); // ������
	}
}
