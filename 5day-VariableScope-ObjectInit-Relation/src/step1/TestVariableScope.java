package step1;
// ���� �޼��尡 �����ϴ� Ŭ�����μ� , ���α׷� ������ ���� ����
public class TestVariableScope {
	public static void main(String[] args) {
		// p �� ���� �޼��� ���� ����Ǿ� �����Ƿ� ���������� �ش��Ѵ�.
		// p �� ��ü�� �ּҰ��� �����ϹǷ� ���� ���� ( reference variable )
		// ��� �Ҹ���.
		Person p = new Person();
		p.setName("������");
		p.eat();
		System.out.println(p.getName());
	}
}
