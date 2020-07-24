package step1;
interface Flyer{
	
	public void fly();//abstract �� ������ ������� �ʾƵ� �ȴ�.
	public static void landoff() {
		System.out.println("�����ϴ�");
	}
}
class Animal{}
class Person extends Animal{}
class Bird extends Animal implements Flyer{
	public void fly() {
		System.out.println("���� ����");
	}
	public void landoff() {
		System.out.print("���� ");
		Flyer.landoff();
	}
}
class Airplane implements Flyer{
	public void fly() {
		System.out.println("����Ⱑ ����");
	}
}
public class TestInterface1 {
	public static void main(String[] args) {
		// �������̽� ������ Ȯ���ϴ� ����
		//Animal a = new Airplane(); // ����Ÿ�Ը� ����� �����ϴ�.
		Flyer f1 = new Bird(); // ���� �������̽� Ÿ������ ���� ��ü�� ������ �� �ִ�. �������� �����.
		Flyer f2 = new Airplane();
		f1.fly();
		f2.fly();
		((Bird)f1).landoff();
		// �������̽��� ��� default or static �Լ��� ����� ��� �������� ���� �������̵��� ����������
		// ��ü(�����޸�)�� ���� �� ���⶧���� ���뼺�� ���ٰ� �� �� �ִ�.
		
	}
}
