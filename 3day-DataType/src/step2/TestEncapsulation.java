package step2;
/*
 *  아래 코드에 대응되는 클래스를 구현해보는 예제
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		MyDate d = new MyDate();
		// d.day = 2; // 접근불가
		d.setDay(10);
		System.out.println(d.getDay() + "일"); // 10일
		System.out.println("*******************");
		MyDate d2 = new MyDate();
		d2.setDay(32); // 32는 잘못된 입력값입니다.
		System.out.println(d2.getDay() +"일"); //1일
	}

}
