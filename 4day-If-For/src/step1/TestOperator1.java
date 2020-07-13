package step1;

// 자바 연산자 테스트
public class TestOperator1 {
	public static void main(String[] args) {
		int i = 7;
		int j = 3;
		System.out.println(i * j); // 곱하기
		System.out.println(i / j); // 나누기 - 몫
		System.out.println(i % j); // 나누기 - 나머지
		System.out.println(i = j); // = 할당, 대입
		System.out.println(i == j); // 같은지 비교
		boolean flag = false;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println("**증감연산자**");
		int k = 7;
		System.out.println(k++); // 실행 후 증가
		System.out.println(k);
		System.out.println(++k); // 증가 후 실행
		System.out.println(k); 
		System.out.println(--k); // 감소 후 실행 , 8
		System.out.println(k--); // 8
		System.out.println(k); // 7
		System.out.println("*******************");
		int money = 100;
		//money = money + 200;
		// 위 코드를 줄여서 표현하면
		money += 200;
		System.out.println(money);
		money -= 100; // money = money - 100 과 동일한 표현.
		System.out.println(money);
		System.out.println("*************");
		// 삼항연산자
		// (조건식) ? 식1 : 식2
		// 조건식이 참이면 식1이 수행되고 거짓이면 식2가 수행된다.
		int x = 10;
		int result = (x > 0) ? x + 1 : x + 2; // 참이므로 식1이 수행된다.
		System.out.println(result);
		
	}
}