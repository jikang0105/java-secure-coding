package step3;

public class MyDate {
	private int month = 1;

	public void setMonth(int month) {
		if (month >= 13 || month <= 1) {
			System.out.println("�߸��� �Է°��Դϴ�.");
		} else {
			this.month = month;
		}
		/*
		 * if(month <= 12 && month >= 1) {
		 * 		this.month = month;
		 * }else {
		 * 		System.out.println("�߸��� �Է°��Դϴ�.");
		 * }
		 */
	}

	public int getMonth() {
		return month;
	}
}
