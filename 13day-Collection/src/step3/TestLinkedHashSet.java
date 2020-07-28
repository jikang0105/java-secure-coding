package step3;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		// Set 계열이므로 중복은 허용하지 않고
		// LinkedHashSet 특성인 입력순서를 기억한다.
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("짜장면");
		set.add("라면");
		set.add("라면");
		set.add("백반");
		System.out.println(set);
	}
}
