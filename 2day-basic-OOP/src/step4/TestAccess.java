package step4;
// import �� �ٸ� ��Ű���� �ڿ�(Ŭ����)�� �̿��� �� ����Ѵ�.
import step3.Account;
// ���������ڸ� �׽�Ʈ�ϴ� ����
public class TestAccess {
	public static void main(String[] args) {
		Account a = new Account();
		// public �̹Ƿ� ������ �����ϴ�.
		System.out.println(a.name);
		// default �̹Ƿ� ������ �Ұ����ϴ�. (�ٸ� ��Ű���̹Ƿ�)
		//System.out.println(a.id);
		// private �̹Ƿ� ������ �Ұ����ϴ�. (�ٸ� ��Ű���� Ŭ�����̹Ƿ�)
		// System.out.println(a.password);
		
	}
}
