package step2;

public class MyDate {
	private int day = 1;
	
	public void setDay(int day) {
		if(day > 31 || day < 1) {
			System.out.println(day + "�� �߸��� �Է°��Դϴ�.");
		}else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
}
