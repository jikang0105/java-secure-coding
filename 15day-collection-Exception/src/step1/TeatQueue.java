package step1;

import java.util.LinkedList;
import java.util.Queue;

// FIFO
public class TeatQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("���ƾ� �氡�氡");
		queue.add("����?");
		queue.add("������!!!!!!!");
		queue.add("�ؾ���~~~~");
		// �������� ������ȯ, ������� �� ������ ���´�
		System.out.println(queue.peek());
		System.out.println(queue.poll()); // ����(����)
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	}
}
