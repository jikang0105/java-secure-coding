package step5;
/*
 *  하나의 클래스를 이용해 다수의 스레드를 생성해서 실행하는 예제
 *  채팅 서버를 가정하고 서비스 내용은 동일하나
 *  접속한 다수의 클라이언트에게 동시에 서비스하기위해
 *  다수의 스레드를 생성하여 실행하도록 구현해본다.
 */

// 채팅서비스를 제공하는 클래스
class ServerWorker implements Runnable{
	@Override
	public void run() {
		try {
			service();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void service() throws InterruptedException {
		// 현재 실행중인 스레드 이름을 반환받는다.
		String name = Thread.currentThread().getName();
		for(int i = 0; i < 10; i++) {
			System.out.println(name + "고객에게 채팅 서비스 제공" + i);
			Thread.sleep(500);
		}
	}
}

public class TestThread5 {
	
	public static void main(String[] args) {
		System.out.println("**main thread start**");
		ServerWorker worker = new ServerWorker();
		// 스레드 생성시 스레드의 name을 함께 할당한다.
		// 현재 스레드가 어떤 스레드인지 알기위해서
		Thread t1 = new Thread(worker, "정재우");
		t1.start();
		// 서비스 내용을 동일하므로 ServerWorker 하나로 다수의 스레드를
		// 생성해서 start 시킨다.
		Thread t2 = new Thread(worker, "정세희");
		t2.start();
		Thread t3 = new Thread(worker, "강상훈");
		t3.start();
		//new Thread(new ServerWorker()).start();
	}
}
