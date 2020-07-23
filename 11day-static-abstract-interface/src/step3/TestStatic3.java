package step3;

public class TestStatic3 {
	public static void main(String[] args) {
		String s1 = "1";
		int s2 = 8;
		// 문자열이 앞에 나오면 이후 연산은 문자열로 인식한사
		System.out.println(s1+s2);
		System.out.println(s2+s1);
		// 문자열 String을 정수로 변환
		// java.lang.Integer의 static method인 parseInt(String s)을
		// 활용해서 문자열을 정수로 변환한다.
		int i = Integer.parseInt(s1);
		System.out.println(i + s2);
	}
}
