package test;

import model.CardDAO2;

/**
 * Ʈ����� ó���� ���� �ʾ��� �� �߻��Ǵ� ������ Ȯ���ϴ� ����
 * ī�� ���̺� ī�� ������ INSERT�ǰ�
 * ����Ʈ ���̺� ����Ʈ ������ INSERT�� ��
 * ����Ʈ ������ ��ϵ��� �ʰ� ī�������� �����ϴ� ������ �߻��ϴ� ��츦 ������.
 * -> ���� ����
 * TestTransaction2
 * Ʈ����� ó���� ���� ��� �۾��� ���������� ����Ǿ��� �� commit
 * ���� �߻��� rollback ó���� ����
 * 
 * �׽�Ʈ 1 : �������� ������ �Է��� commit Ȯ���Ѵ�.
 * �׽�Ʈ 2 : point ��Ͻ� ���Ƿ� ������ �߻����� rollback�� �Ǵ��� Ȯ���Ѵ�.
 * @author KOSTA
 *
 */
public class TestTransaction2 {
	public static void main(String[] args) {
		try {
			CardDAO2 dao = new CardDAO2();
			dao.registerCardAndPoint("java3", "�����", "lotte", 1000); // id, name, point_type, point
			System.out.println("ī��� ����Ʈ insert ok");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("ī��߱ް����� ������ ���� �߱��� ��ҵǾ����ϴ�.");
		}
	}
}
