package step7;

public class TestFor5 {
	public static void main(String[] args) {
		// ������ 2�ܺ��� 9�ܱ��� ����ϴ� ����
		// ��ø for���� �̿��Ѵ�.
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println();
		}
	}
}
