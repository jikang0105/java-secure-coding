package step5;
// abstract method�� �ϳ� �̻� �����ϸ� �� Ŭ������ abstract�� �����ؾ��Ѵ�.
abstract class Parents{
	Parents(){
		System.out.println("Parent ��ü ����");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
	public abstract void study();
	// abstract �޼���� ������ ' { } '�� ���� �� ����.
	// ���� ���� ����
}
class Child extends Parents{
	Child(){
		super();
		System.out.println("Chlid ��ü����");
	}
	
	@Override
	public void study() {
		System.out.println("Child �����ϴ�");
	}
	
}
public class TestAbstract1 {
	public static void main(String[] args) {
		// abstract Ŭ���� �̹Ƿ� ���� ��ü������ �� ����.
		//Parents p = new Parents();
		Child c = new Child();
		c.study();
		c.eat();
	}
}


