package step1;
// 단일 Thread 환경 테스트
 class Worker{
	 public void work() {
		 for(int i = 0; i < 5; i++)
		 System.out.println("Worker 일하다" + i);
	 }
 }
public class TestThread1 {
	public static void main(String[] args) {
		System.out.println("** main thread start **");
		Worker w = new Worker();
		w.work();
		System.out.println("** main thread finish **");
	}
}
