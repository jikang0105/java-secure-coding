package step7;

public class TestFor5 {
	public static void main(String[] args) {
		// 구구단 2단부터 9단까지 출력하는 예제
		// 중첩 for문을 이용한다.
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println();
		}
	}
}
