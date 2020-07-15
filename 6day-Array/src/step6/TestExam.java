package step6;

public class TestExam {
	public static void main(String[] args) {
		// int 형 최대값
		//System.out.println(Integer.MAX_VALUE);
		// int 형 최소값
		//System.out.println(Integer.MIN_VALUE);
		int[] point = {30, 50, 10, 20, 100};
		// point 배열 요소의 최소값을 찾아 출력해본다.
		int minPoint = Integer.MAX_VALUE; // 30 // 10
		// for 문을 이용해 최소값을 찾는다.
		for(int i = 0; i < point.length; i++) {
			if(point[i] < minPoint){
				minPoint = point[i];
			}
		}
		
		System.out.println("최소 point : " + minPoint);
	}
}
