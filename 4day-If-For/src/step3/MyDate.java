package step3;

public class MyDate {
	private int month = 1;

	public void setMonth(int month) {
		if (month >= 13 || month <= 1) {
			System.out.println("잘못된 입력값입니다.");
		} else {
			this.month = month;
		}
		/*
		 * if(month <= 12 && month >= 1) {
		 * 		this.month = month;
		 * }else {
		 * 		System.out.println("잘못된 입력값입니다.");
		 * }
		 */
	}

	public int getMonth() {
		return month;
	}
}
