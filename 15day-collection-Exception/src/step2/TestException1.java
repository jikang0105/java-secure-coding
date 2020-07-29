package step2;

public class TestException1 {
	public static void main(String[] args) {
		// Exception 발생하면 프로그램이 실행 중단한다.
		// Exception이 발생하면 JVM은 예외 정보 전달 후 비정상 종료한다.
		String name = "정준상";
		name = null;
		System.out.println(name.length());
		System.out.println("프로그램 정상 수행");
	}
}
