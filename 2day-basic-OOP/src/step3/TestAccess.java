package step3;
// ���������ڸ� �׽�Ʈ�ϴ� ����
public class TestAccess {
	public static void main(String[] args) {
		Account a = new Account();
		// public �̹Ƿ� ������ �����ϴ�.
		System.out.println(a.name);
		// default �̹Ƿ� ������ �����ϴ�.
		System.out.println(a.id);
		// private �̹Ƿ� ������ �Ұ����ϴ�. (�ٸ� Ŭ�����̹Ƿ�)
		// System.out.println(a.password);
		
	}
}
