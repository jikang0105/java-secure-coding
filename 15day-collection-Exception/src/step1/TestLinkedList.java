package step1;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.size());
		// 특정 위치에 추가
		list.add(1, "d"); // 두번째 순서에 요소 추가
		System.out.println(list);
		// 삽입
		list.addFirst("k");
		System.out.println(list);
		list.addLast("t");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		
	}
}
