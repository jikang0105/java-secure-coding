package step1;
// ���� Thread ȯ�� �׽�Ʈ
 class Worker{
	 public void work() {
		 for(int i = 0; i < 5; i++)
		 System.out.println("Worker ���ϴ�" + i);
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