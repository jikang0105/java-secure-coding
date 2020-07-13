package step6;

public class TestDoWhile {
	public static void main(String[] args) {
		int i = 1;
		do {// 실행후 조건검사하므로 반드시 한번은 실행한다.
			System.out.println(i);
		}while(i < 0);
	}
}
