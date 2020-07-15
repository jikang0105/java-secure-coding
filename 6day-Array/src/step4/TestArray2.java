package step4;

public class TestArray2 {
	public static void main(String[] args) {

		// 배열 선언 , 생성
		int salary[] = new int[4];
		System.out.println(salary.length);
		salary[0] = 1000;
		salary[1] = 300;
		salary[2] = 200;
		salary[3] = 500;
		System.out.println("**현 배열의 salary 총액**");
		int sum = 0;
		// for 문을 이용해서 누적
		for (int i = 0; i < salary.length; i++) {
			sum += salary[i];
		}
		System.out.println("총액 : " + sum);
	}
}
