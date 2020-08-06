package step11;
/**
 * synchronized 필요성을 확인하는 예제
 * 하나의 자원에 다수의 스레드가 실행되어 자원을 조작하는 경우
 * 발생할 수 있는 문제점을 확인하는 예제
 * -> 해결방안 : 공유자원( Toilet의 seat )에 접근하는 영역을
 * 				 synchronized 처리하면 된다.
 * 				 synchronized 처리란 해당 영역은 순차적 처리를 하도록 명시하는것을 말한다.
 * 				 순차적 처리란 그 영역을 단일 스레드 환경으로 실행시킨다는 것을 의미한다.
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
	// synchronized modifier 가 명시된 메서드는 단일 스레드 환경을 가지게 되므로
	// 여러 스레드가 사용하더라도 순차적으로 실행된다.
	public synchronized void use(String user) throws InterruptedException {
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
public class TestSynchronizedSolution {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread t1 = new Thread(toilet, "진용현스레드");
		Thread t2 = new Thread(toilet, "김수민스레드"); 
		t1.start();
		t2.start();
	}
}
