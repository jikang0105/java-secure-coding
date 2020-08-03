package step1;

import java.util.StringTokenizer;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String s1 = "아이유";
		String s2 = "아이유";
		System.out.println(s1.concat("짱")); // 마지막에 문자열 추가
		System.out.println(s1); // 기존 s1은 변화되지 않는다.
		System.out.println(s1.replace("유",  "셔"));
		System.out.println(s1); // 여전히 변하지 않는다.
		System.out.println(s1 == s2); // 권장하지 않는다.
		System.out.println(s1.equals(s2)); // 이렇게 비교해야 한다.
		// 이유는 아래의 방식처럼 문자열을 만들수도 있기 때문이다.
		String s3 = new String("아이유");
		System.out.println(s1 == s3); // false가 출력되기 때문에 equals()로 비교해야 한다.
		System.out.println(s1.contentEquals(s3));
		StringBuilder sb = new StringBuilder("아이유");
		System.out.println(sb);
		
		//System.out.println(s1 == sb); // 타입이 달라 비교할 수 없다.
		System.out.println(s1 == sb.toString()); // false -> 이렇게 비교하면 안된다.
		System.out.println(s1.equals(sb.toString())); // true
		System.out.println(s1.contentEquals(sb)); // 타입이 달라도 비교가 가능하다.
		System.out.println(sb.append("왕")); // 문자열 자체가 변경된다.
		System.out.println(sb); // 아이유왕
		
		StringBuffer sbf = new StringBuffer("뻐이장가가니");
		System.out.println(sbf.reverse());
		System.out.println("************StrintTokenizer*************");
		String names="고병철, 강준상, 강지훈";
		StringTokenizer stk = new StringTokenizer(names, ", " );
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}
}
