package step2;

public class MyDate {
	private int day = 1;
	
	public void setDay(int day) {
		if(day > 31 || day < 1) {
			System.out.println(day + "는 잘못된 입력값입니다.");
		}else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
}
