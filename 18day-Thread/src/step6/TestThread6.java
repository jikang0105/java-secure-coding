package step6;
/*
 *  �ڹ� ������ �����ٸ��� �켱���� ����� ä���Ѵ�.
 *  �̸� Ȯ���ϴ� ����
 *  �׽�Ʈ ������ 20���� ������ start��Ű��
 *  �� �� �ϳ��� �켱������ ���� ���� ������ ���� ����� Ȯ���Ѵ�.
 */

class Worker implements Runnable{
	@Override
	public void run() {
		// ���� �������� ������ �̸��� ��ȯ�޴´�.
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		for(long l = 0; l < 9000000000L; l++) {
		}
		System.out.println(name + " ������ ����Ϸ�! �켱���� : " + priority);
	}
}

public class TestThread6 {
	public static void main(String[] args) {
		System.out.println("**main thread start**");
		Worker w = new Worker();
//		Thread t1 = new Thread(w, "1��° �ϲ� ������");
//		t1.setPriority(9);
//		t1.start();
		for(int i = 1; i <= 20; i++) {
			Thread t = new Thread(w, i+"��° �ϲ� ������");
			if(i==9) {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();
			
			System.out.println(i + "��° �ϲ� ������ start"); // start�� ���డ�� ���·� ������ 
		}
		System.out.println("**main thread finish**");
	}
}
