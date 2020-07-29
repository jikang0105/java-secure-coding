package step1;

import java.util.LinkedList;
import java.util.Queue;

// FIFO
public class TeatQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("지훈씨 방가방가");
		queue.add("어디야?");
		queue.add("대답안해!!!!!!!");
		queue.add("해어져~~~~");
		// 삭제없이 정보반환, 가장먼저 들어간 정보가 나온다
		System.out.println(queue.peek());
		System.out.println(queue.poll()); // 추출(삭제)
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	}
}
