package step7;

public class TestFor3 {
	public static void main(String[] args) {
		/*
		 *	1	2	3	4	5
		 * 	1	2	3	4	5
		 * 	1	2	3	4	5
		 * 
		 */
		
		int row = 3; // ��
		int col = 5; // ��
		/*
		 * System.out.println("��\t����"); System.out.println();
		 * System.out.println("��\t����");
		 */
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
