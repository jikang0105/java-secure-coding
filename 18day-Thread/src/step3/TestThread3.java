package step3;
/*
 *  채팅 클라이언트 프로그램을 연상하면서 
 *  두 개의 스레드를 생성시켜 실행해본다.
 *  1. InputWorker Thread : 친구들의 메세지를 입력받는 일을하는 스레드
 *  2. main Thread : 친구들에게 메세지를 출력하는 스레드
 */

class InputWorker implements Runnable{
	// InputWorker Thread의 작업내용을 정의한다.
	// JVM이 스케줄링을하면 이 메서드가 자동 호출된다.
	@Override
	public void run() {
		inputMessage();
	}
	
	public void inputMessage() {
		for(int i = 0; i < 10; i++) {
			System.out.println("친구들의 메세지를 입력받는 Input Thread");
		}
	}
}

public class TestThread3 {
	public void outputMessage() {
		for(int i = 0; i < 5; i++) {
			System.out.println("친구들에게 메세지를 출력하는 Output main thread");
		}
	}
	public static void main(String[] args) {
		System.out.println("**main thread start**");
		// implements Runnable 한 클래스를 이용해 thread를 생성하고 start();
		InputWorker w = new InputWorker();
		Thread thread = new Thread(w);
		thread.start();
		new TestThread3().outputMessage();
		System.out.println("**main thread finish**");
	}
}
