package step2;
// step1 단일스레드 예제와 실행결과를 비교해본다
// step2 TestThread2는 main과 WorkerThread 즉 두개의
// 스레드가 동작되는 예제
// 스레드를 만드는 첫번째 방법은 extends Thread이다.
class Worker extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Worker 일하다" + i);
		}
	}
	
}
public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("** main thread start **");
		// WorkerThread 생성 -> run() 메서드를 실행시키는것이 아니라
		// start()라는 Thread 클래스의 메서드를 실행해야한다.
		Worker w = new Worker();
		w.start(); // 스레드를 실행시키는 것이 아니라 실행가능상태로 보낸다.
		System.out.println("** main thread finist **");
	}
}
