package step3;
/*
 *  static �ʱ�ȭ �� �׽�Ʈ ����
 *  static �ʱ�ȭ ������ ���� ���� ����ȴ�.
 */
public class TestStatic5 {
		
	public static void main(String[] args) {
		System.out.println("main �޼��� ����");
	}
	
	static { // ���α׷� �����۾�
		int i = 1;
		System.out.println("static �ʱ�ȭ ���� ����");
		System.out.println(i);
	}
	
	
}
