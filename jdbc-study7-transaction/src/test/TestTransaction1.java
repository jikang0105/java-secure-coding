package test;

import model.CardDAO;

/**
 * TestTransaction1
 * Ʈ����� ó���� ���� �ʾ��� �� �߻��Ǵ� ������ Ȯ���ϴ� ����
 * ī�� ���̺� ī�� ������ INSERT�ǰ�
 * ����Ʈ ���̺� ����Ʈ ������ INSERT�� ��
 * ����Ʈ ������ ��ϵ��� �ʰ� ī�������� �����ϴ� ������ �߻��ϴ� ��츦 ������.
 * -> ���� ����
 * @author KOSTA
 *
 */
public class TestTransaction1 {
	public static void main(String[] args) {
		try {
			CardDAO dao = new CardDAO();
			dao.registerCardAndPoint("java2", "�����", "lotte", 1000); // id, name, point_type, point
			System.out.println("ī��� ����Ʈ insert ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
