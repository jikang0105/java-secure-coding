package step3;

import java.util.Random;

// ������ ���� ��ȯ�Ѵ�.
public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 0; i < 5; i++) {
			// nextInt(3)�� 0, 1, 2�� �������� ��ȯ�ȴ�.
			System.out.println(r.nextInt(3));
		}
	}
}
