package step2;

public class TestException1 {
	public static void main(String[] args) {
		// Exception �߻��ϸ� ���α׷��� ���� �ߴ��Ѵ�.
		// Exception�� �߻��ϸ� JVM�� ���� ���� ���� �� ������ �����Ѵ�.
		String name = "���ػ�";
		name = null;
		System.out.println(name.length());
		System.out.println("���α׷� ���� ����");
	}
}