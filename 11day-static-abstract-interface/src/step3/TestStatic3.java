package step3;

public class TestStatic3 {
	public static void main(String[] args) {
		String s1 = "1";
		int s2 = 8;
		// ���ڿ��� �տ� ������ ���� ������ ���ڿ��� �ν��ѻ�
		System.out.println(s1+s2);
		System.out.println(s2+s1);
		// ���ڿ� String�� ������ ��ȯ
		// java.lang.Integer�� static method�� parseInt(String s)��
		// Ȱ���ؼ� ���ڿ��� ������ ��ȯ�Ѵ�.
		int i = Integer.parseInt(s1);
		System.out.println(i + s2);
	}
}
