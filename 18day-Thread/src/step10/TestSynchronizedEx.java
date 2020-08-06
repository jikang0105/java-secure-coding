package step10;
/**
 * synchronized 필요성을 확인하는 예제
 * 하나의 자원에 다수의 스레드가 실행되어 자원을 조작하는 경우
 * 발생할 수 있는 문제점을 확인하는 예제
 * @author KOSTA
 */
class Toilet implements Runnable{
	// 각 스레드의 공유자원
	private boolean seat; // 인스턴수 변수의 기본 초기화 false 할당
	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void use(String user) throws InterruptedException {
		if(seat == false) {
			Thread.sleep(1000);
			seat = true;
			System.out.println(user + " 입장");
			System.out.println(user + " 사용");
			Thread.sleep(3000);
			System.out.println(user + " 나옴");
			seat = false;
		} else { // seat가 true이면 화장실을 사용하는 상태이므로 입장불가
			System.out.println(user + "님 화장실 사용중이므로 입장불가");
		}
	}
}
public class TestSynchronizedEx {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread t1 = new Thread(toilet, "진용현스레드");
		Thread t2 = new Thread(toilet, "김수민스레드"); 
		t1.start();
		t2.start();
	}
}
