package step4;

public class TestArray3 {
	public static void main(String[] args) {
		int point[] = {200, 300, 700, 100, 400};
		// for loop를 이용해 point를 모두 출력
		for(int i = 0; i < point.length; i++) {
			System.out.println(point[i]);
		}
		System.out.println("***point 평균을 출력***");
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i < point.length; i++) {
			sum += point[i];
		}
		
		avg = sum/point.length;
		System.out.println("포인트 종합 : " + sum);
		System.out.println("포인트 평균 : " + avg);
	}
}
