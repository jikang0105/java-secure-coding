package step3;

import java.util.Random;

// 랜덤한 수를 반환한다.
public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 0; i < 5; i++) {
			// nextInt(3)은 0, 1, 2의 랜덤수가 반환된다.
			System.out.println(r.nextInt(3));
		}
	}
}
