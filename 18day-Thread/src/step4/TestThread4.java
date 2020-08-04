package step4;
/*
 *  멀티 스레딩 테스트 ( 동영상 플레이어 프로세스 가정 )
 *  1. 영상 작업 스레드
 *  2. 음향 작업 스레드
 */
class VideoWorker implements Runnable{
	@Override
	public void run() {
		try {
			work();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void work() throws InterruptedException {
		for(int i = 0; i < 10; i++) {
			System.out.println("영상 작업 스레드" + i);
		}
		Thread.sleep(1000); // 1초간 스레드 작업 일시 중단 후 재개
	}
}

class AudioWorker implements Runnable{
	@Override
	public void run() {
		try {
			work();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void work() throws InterruptedException {
		for(int i = 0; i < 10; i++) {
			System.out.println("음향 작업 스레드" + i);
		}
		Thread.sleep(1000);
	}
}

public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("** main thread 시작 **");
		new Thread(new VideoWorker()).start();
		new Thread(new AudioWorker()).start();
		System.out.println("** main thread 종료 **");
		
	}
}
