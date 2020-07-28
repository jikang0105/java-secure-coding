package step3;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		// <String> -> Generic , Set에 추가될 요소의 타입을 명시하는 것을 권장한다.
		TreeSet <String> set = new TreeSet();
		set.add("고병철");
		set.add("정준상");
		set.add("강지훈");
		set.add("고병철");// 중복은 인정하지 않음.
		set.add("고병철");// 중복은 인정하지 않음
		System.out.println(set.size()); // 3
		// TreeSet의 특징은 정렬기능이 내장되어있다.
		System.out.println(set); // toString()이 오버라이딩되어 실제 요소를 출력한다.
		// Generic Test
		//TreeSet set2 = new TreeSet();
		//set2.add("a");
		//set2.add(1);
		// System.out.println(set2); // 입력하는것은 문제가 없지만 출력하는 과정에서 자료형이 달라
		// 정렬에 문제가 생겨 error이 발생한다.
		
		TreeSet<Integer> setInt = new TreeSet();
		setInt.add(1);
		setInt.add(2);
		System.out.println(setInt);
	}
}
