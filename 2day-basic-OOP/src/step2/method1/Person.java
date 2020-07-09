package step2.method1;

public class Person {
	public void eat() {
		System.out.println("먹다");
	}
	// 메서드를 호출한 측으로부터 데이터를 전달받기 위해
	// 매개변수( parameter )를 정의한 메서드를 작성해본다.
	public void eat2(String menu) {
		System.out.println(menu + " 먹다");
	}
	// void 는 메서드 리턴값이 없을을 알리는 자바예약어
	public void eat3(String menu, int count) {
		System.out.println(menu + " "+count+"번 먹다");
	}
	// 아래 eat4는 리턴갑시 있으므로 리턴값의 데이터 타입을 명시한다.
	// return 즉 호출한 측으로 데이터를 반환하는 메서드를 정의해본다.
	public String eat4(String menu) {
		// 특정한 일을 수행한 후 데이터를 반환한다고 가정한다.
		return menu + " 리턴~";
	}
}
