package step4;

public class Test2DArray {
	public static void main(String[] args) {
		// 2차원 배열 테스트
		int [][] rain = new int[3][12]; // 3행 12열
		rain[0][0] = 100;
		// ...
		rain[2][11] = 200;
		// 판교 중학교 1학년 3개반, 2학년 2개반, 3학년 5개반
		int [][]school = new int[3][];
		school[0] = new int[3];
		school[1] = new int[2];
		school[2] = new int[5];
	}
}
