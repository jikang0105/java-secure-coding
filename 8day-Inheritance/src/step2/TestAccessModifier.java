package step2;

import org.kosta.Bank; // �ٸ� ��Ű���� �ڿ��� ���

class KostaBank extends Bank{
	public void test() {
		publicTest();
		// protected�� ����� �Ʒ� �޼���� ��Ӱ��迡 ���� ��,
		// �ٸ� ��Ű���� ���� �����ϴ�.
		protectedTest();
		//defaultTest();
		//privateTest();
	}
}

public class TestAccessModifier {
	public static void main(String[] args) {
		// import ����Ű ctrl + shift + o
		Bank bank = new Bank();
		bank.publicTest();
		//bank.protectedTest();	// �ٸ� ��Ű���̹Ƿ� ���� �Ұ���
		//bank.defaultTest(); 		// �ٸ� ��Ű���̹Ƿ� ���� �Ұ���
		//bank.privateTest();		// �ٸ� ��Ű���̹Ƿ� ���� �Ұ���
	}
}
