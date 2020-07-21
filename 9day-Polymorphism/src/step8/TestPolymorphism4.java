package step8;
class Animal{
	public void eat() {
		System.out.println("�Դ�.");
	}
	public void sleep() {
		System.out.println("�ڴ�.");
	}
}
class Person extends Animal{
	public void study(){
		System.out.println("�����ϴ�.");
	}
	// �޼��� �������̵�
	public void eat() {
		System.out.println("����� ������ �Դ�.");
	}
}
public class TestPolymorphism4 {
	public static void main(String[] args) {
		// ������ ����� Ư¡
		// �Ʒ��� ���� �θ� Ÿ���� ������ �ڽİ�ü�� ����
		Animal a = new Person();
		a.sleep(); // ��ӹ��� �θ�޼��忡 ������ ��밡���ϰ�
		a.eat(); // �������̵��� �޼��� ��� �����ϴ�.
		// a.study(); // a�� Ÿ���� Animal �θ������� �ڽ� Person�� ������ ���(study �޼��� )���� ���� �Ұ�, complie error
		// �����ϱ� ���ؼ��� Object down casting ������ �ʿ��ϴ�.
		((Person) a).study();
		((Person) a).sleep();
		((Person) a).eat();
		
		Person p = (Person)a;
		a.sleep();
		a.eat(); 
		p.study();
		p.eat();
		p.sleep();
		//p.super.eat(); �������̵� ������ ��ɿ� ������ �� ����(?)
		Animal a2 = new Animal();
		a2.eat();
	}
}