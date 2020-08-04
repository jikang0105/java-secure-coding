package step8;
/**
 * MakeFileWorker Thread�� 
 * ������ ����ŭ ������ �ð��������� �����ϰ�
 * ������ ����( 0.avi or 1.mp3 )�Ͽ�
 * CommonInfo�� Make_PATH�� �����Ѵ�.
 * @author KOSTA
 *
 *	MoveFileWorker Thread��
 *	MAKE_PATH�� ����� ���ϵ��� Ȯ���ڿ� ����
 *	MOVIE_PATH�� MUSIC_PATH�� �̵���Ų��.
 *	������ ����ŭ ������ �ð� �������� �̵���Ų��.
 */
public class TestThreadEx8 {
	public static void main(String[] args) {
		int makeCount = 30; // ������ ���ϼ�
		int makePeriod = 1000; // 1�� �������� ����
		int moveCount = 5; // �̵���ų�۾���
		int movePeriod = 7000; // 7�� �������� �̵�
		MakeFileWorker makeFileWorker = new MakeFileWorker(makeCount, makePeriod);
		MoveFileWorker moveFileWorker = new MoveFileWorker(moveCount, movePeriod);
		// �� ��ü�� �̿��� ���� ������ �����ϰ� start
		
		new Thread(makeFileWorker).start();
		new Thread(moveFileWorker).start();
		
	}
}
