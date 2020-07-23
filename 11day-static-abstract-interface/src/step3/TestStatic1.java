package step3;

public class TestStatic1 {
	// Object�� member ( instance variable )
	// �Ʒ� money ������, test �޼���� ��ü������ �� ���� �޸𸮿� �ε�ǰ� ��밡���ϴ�.
	int money = 100;
	public void test() {}
	
	// Class�� member�� static ������ �޼���� ���� ù ���� �� class loading ������
	// �޸𸮿� ����ȴ�. �� ������ ��ü������ �ʿ����.
	static int sMoney = 100;
	static {
		System.out.println("upstatic �޼��� �ε�");
		System.out.println(sMoney);
	}
	public static void sTest() {
		System.out.println("sTest �޼��� �ε�");
	}
	
	public static void main(String[] args) {
		System.out.println("���� �޼��� �ε�");
		// �Ʒ� �ڵ带 ����� compile error�� ���� ������ static method �����̹Ƿ�
		// non-static( Object�� member ) ���� ���� ������ �� ������ ���������� �����Ǿ� �ִ�.
		// �� static ���� non-static���� ���� ������ �� ����.
		//System.out.println(money);
		//test();
		// ���� static ������ ������ �����ϴ�.
		System.out.println(sMoney);
		sTest();
	}
	static {
		System.out.println("downstatic �޼��� �ε�");
		System.out.println(sMoney);
	}
}
