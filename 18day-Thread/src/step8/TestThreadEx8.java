package step8;
/**
 * MakeFileWorker Thread는 
 * 지정한 수만큼 지정한 시간간격으로 랜덤하게
 * 파일을 생성( 0.avi or 1.mp3 )하여
 * CommonInfo의 Make_PATH에 저장한다.
 * @author KOSTA
 *
 *	MoveFileWorker Thread는
 *	MAKE_PATH에 저장된 파일들을 확장자에 따라
 *	MOVIE_PATH와 MUSIC_PATH에 이동시킨다.
 *	지정한 수만큼 지정한 시간 간격으로 이동시킨다.
 */
public class TestThreadEx8 {
	public static void main(String[] args) {
		int makeCount = 30; // 생성할 파일수
		int makePeriod = 1000; // 1초 간격으로 생성
		int moveCount = 5; // 이동시킬작업수
		int movePeriod = 7000; // 7초 간격으로 이동
		MakeFileWorker makeFileWorker = new MakeFileWorker(makeCount, makePeriod);
		MoveFileWorker moveFileWorker = new MoveFileWorker(moveCount, movePeriod);
		// 두 객체를 이용해 각각 스레드 생성하고 start
		
		new Thread(makeFileWorker).start();
		new Thread(moveFileWorker).start();
		
	}
}
