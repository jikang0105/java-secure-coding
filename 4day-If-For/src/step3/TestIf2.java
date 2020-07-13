package step3;

public class TestIf2 {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		int month = 13;
		// month는 1 ~ 12 사이 >=  <=
		date.setMonth(month); // 잘못된 입력값입니다.
		System.out.println(date.getMonth()); //1
		month = 7;
		date.setMonth(month);
		System.out.println(date.getMonth()); // 7
	}
}
