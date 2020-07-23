package step3;
class Person{
	static int age = 21; // class �� member -> ���� ��ü �������� ��밡��
	public static void eat() {
		System.out.println("static eat");
		//play(); // static eat() �޼���� ��ü�������� ���డ���ϰ�
		// play() �޼���� �ݵ�� ��ü�����Ǿ�߸� �����Ҽ� �ֱ� ������ compile error�� �߻��Ѵ�.
	}
	// non-static�迭 �� Object�� ���(�޼���)�� ��ü �����ؾ� ����� �����ϴ�.
	public void play() {
		System.out.println("object play");
		eat(); // play()�� ����Ǿ��ٴ� ���� ��ü ������ �������ϰ�
		// ��ü ���� ���� class loading�� �Ͼ�� ������ �翬�� ������ �����ϴ�.
	}
}
public class TestStatic2 {
	public static void main(String[] args) {
		// ���α׷� ����� ù������ class loading�� �ǰ� �� �� static�� �޸𸮿� ����ǹǷ�
		// age�� static �̹Ƿ� ������ ��ü �������� ����� �� �ִ�.
		System.out.println(Person.age);
		Person.eat(); // ��ü�������� Ŭ������. �޼���()�� ������ �����ϴ�.
		//Person.play(); // object�� member�̹Ƿ� ��ü������ �ʿ��ϴ�.
		Person p = new Person();
		p.play(); // �̷��� ����ؾ� �Ѵ�.
		
	}
}
