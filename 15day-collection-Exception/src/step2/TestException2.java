package step2;

public class TestException2 {
	public static void main(String[] args) {
		// Exception 발생하면 프로그램이 실행 중단한다.
		// Exception이 발생하면 JVM은 예외 정보 전달 후 비정상 종료한다.
		// Exception 주요 키워드인 try catch를 이용해
		// 예외 처리를 하고 프로그램을 정상 실행하도록 해본다.
		String name = "정준상";
		name = null;
		try {
			System.out.println(name.length());
		} catch (NullPointerException ne) { // catch 예외발생시 대안흐름 실행
			System.out.println("대안작업실행");
		}
		System.out.println("프로그램 정상 수행");
	}
}
