package step2;

public class TestException4 {
	/*
	 *  Exception 예외 발생시 실행의 흐름을 알아보는 예제
	 */
	public static void main(String[] args) {
		String age = "스물한살"; // 실행결과예상
		// age = "1"; // 실행결과 예상
		try {
			int intAge = Integer.parseInt(age);
			System.out.println(intAge+1);
			System.out.println("d");
		} catch(NumberFormatException ne) {
			System.out.println("a");
		} catch(Exception e) {
			System.out.println("b");
		} 
		System.out.println("c");
	}
}
