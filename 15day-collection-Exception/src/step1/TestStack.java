package step1;

import java.util.Stack;

// Stack : LIFO( Last in First out )
public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack);
		System.out.println(stack.peek()); // 삭제없이 반환
		System.out.println("*************************");
		/*
		 * System.out.println(stack.pop()); // 추출, stack에서 삭제
		 * System.out.println(stack.pop()); System.out.println(stack.pop());
		 * System.out.println(stack.pop());
		 */
		System.out.println(stack.empty()); // stack이 비어있는지 없는지를 확인하는 예약어 비어있으면 true, 요소가 있으면 false
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		//System.out.println(stack.pop());
		//System.out.println(stack);
		
	}
}
