package step7;
// Daemon Thread �׽�Ʈ ����
/*
 * ������ Ŭ���� �ΰ��� �����Ѵ�.
 * 1. Word
 * 2. BackupWorker
 * Word ������ ���۽� BackupWorker thread �����ϵ���
 * �ڵ�� �����Ǿ��ְ� Word �����尡 �۾��� ����Ǿ� �ش� �����尡
 * ����Ǹ� �Բ� BackWorker thread�� ����ǵ��� 
 * setDeamon(true)�� �����Ѵ�.
 */
class BackupWorker implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				backup();
				Thread.sleep(3000); // 3�ʸ��� ���ó��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void backup() {
		System.out.println("�������ó��");
	}
}
/*
 *  Word �����尡 ����ɶ� ���� ���� BackupWorker Thread�� ������
 *  start ��Ų��.
 */
class Word implements Runnable{
	@Override
	public void run() {
		BackupWorker b = new BackupWorker();
		Thread backupThread = new Thread(new BackupWorker());
		//Word thread�� ����Ǹ� BackThread�� �Բ� ����ȴ�.
		backupThread.setDaemon(true);
		backupThread.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("�����۾�" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // catch
		} // for
		b.backup();
		System.out.println("**�����۾�����**");
	} // run
} // class
public class TestThread7 {
	public static void main(String[] args) {
		System.out.println("**main thread start**");
		// ���� �۾� ������ ���� start
		new Thread(new Word()).start();
		System.out.println("**main thread finish**");
	}
}
